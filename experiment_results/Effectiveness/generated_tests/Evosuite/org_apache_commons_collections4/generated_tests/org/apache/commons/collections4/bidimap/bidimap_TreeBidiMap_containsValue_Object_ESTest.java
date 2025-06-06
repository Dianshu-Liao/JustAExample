/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:17:30 GMT 2025
 */

package org.apache.commons.collections4.bidimap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class bidimap_TreeBidiMap_containsValue_Object_ESTest extends bidimap_TreeBidiMap_containsValue_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeBidiMap<Integer, Integer> treeBidiMap0 = new TreeBidiMap<Integer, Integer>();
      Integer integer0 = new Integer(47);
      boolean boolean0 = treeBidiMap0.containsValue(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreeBidiMap<Integer, Integer> treeBidiMap0 = new TreeBidiMap<Integer, Integer>();
      TreeBidiMap.Inverse treeBidiMap_Inverse0 = treeBidiMap0.new Inverse();
      // Undeclared exception!
      try { 
        treeBidiMap_Inverse0.containsValue(treeBidiMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // key must be Comparable
         //
         verifyException("org.apache.commons.collections4.bidimap.TreeBidiMap", e);
      }
  }
}
