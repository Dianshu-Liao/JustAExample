/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:04:24 GMT 2025
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import org.apache.commons.collections4.map.Flat3Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class map_Flat3Map_values__ESTest extends map_Flat3Map_values__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Flat3Map<Integer, Integer> flat3Map0 = new Flat3Map<Integer, Integer>();
      Collection<Integer> collection0 = flat3Map0.values();
      assertNotNull(collection0);
  }
}
