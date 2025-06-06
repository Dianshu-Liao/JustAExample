/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:56:38 GMT 2025
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LRUMap;
import org.apache.commons.collections4.map.LinkedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class map_AbstractLinkedMap_createKeySetIterator__ESTest extends map_AbstractLinkedMap_createKeySetIterator__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LRUMap<Integer, AbstractLinkedMap.LinkEntry<Integer, Integer>> lRUMap0 = new LRUMap<Integer, AbstractLinkedMap.LinkEntry<Integer, Integer>>(1);
      Iterator<Integer> iterator0 = lRUMap0.createKeySetIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedMap<Integer, Integer> linkedMap0 = new LinkedMap<Integer, Integer>(585);
      linkedMap0.size = 585;
      Iterator<Integer> iterator0 = linkedMap0.createKeySetIterator();
      assertNotNull(iterator0);
  }
}
