/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:00:11 GMT 2025
 */

package org.apache.commons.collections4.list;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.list.TreeList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class list_TreeList_toArray__ESTest extends list_TreeList_toArray__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeList<Object> treeList0 = new TreeList<Object>();
      treeList0.toArray();
      assertEquals(0, treeList0.size());
  }
}
