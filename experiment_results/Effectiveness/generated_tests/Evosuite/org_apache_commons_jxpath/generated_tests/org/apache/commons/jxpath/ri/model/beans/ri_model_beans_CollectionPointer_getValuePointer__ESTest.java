/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:05:04 GMT 2025
 */

package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.CollectionPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_model_beans_CollectionPointer_getValuePointer__ESTest extends ri_model_beans_CollectionPointer_getValuePointer__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CollectionPointer collectionPointer0 = new CollectionPointer((Object) null, (Locale) null);
      collectionPointer0.getValuePointer();
      NodePointer nodePointer0 = collectionPointer0.getValuePointer();
      assertFalse(nodePointer0.isContainer());
  }
}
