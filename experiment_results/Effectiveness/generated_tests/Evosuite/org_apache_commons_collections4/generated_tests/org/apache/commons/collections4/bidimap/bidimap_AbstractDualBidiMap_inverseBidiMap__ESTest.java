/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:13:57 GMT 2025
 */

package org.apache.commons.collections4.bidimap;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.AbstractMap;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class bidimap_AbstractDualBidiMap_inverseBidiMap__ESTest extends bidimap_AbstractDualBidiMap_inverseBidiMap__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DualTreeBidiMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>> dualTreeBidiMap0 = new DualTreeBidiMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>>();
      dualTreeBidiMap0.inverseBidiMap();
      BidiMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>> bidiMap0 = dualTreeBidiMap0.inverseBidiMap();
      assertTrue(bidiMap0.isEmpty());
  }
}
