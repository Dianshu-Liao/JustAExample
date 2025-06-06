/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:08:52 GMT 2025
 */

package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.map.DefaultedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class map_DefaultedMap_get_Object_ESTest extends map_DefaultedMap_get_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      DefaultedMap<HashMap<Integer, Integer>, HashMap<Integer, Integer>> defaultedMap0 = new DefaultedMap<HashMap<Integer, Integer>, HashMap<Integer, Integer>>(hashMap0);
      DefaultedMap<HashMap<Integer, Integer>, HashMap<Integer, Integer>> defaultedMap1 = new DefaultedMap<HashMap<Integer, Integer>, HashMap<Integer, Integer>>(hashMap0);
      defaultedMap0.map = (Map<HashMap<Integer, Integer>, HashMap<Integer, Integer>>) defaultedMap1;
      HashMap<Integer, Integer> hashMap1 = defaultedMap0.get(hashMap0);
      assertSame(hashMap1, hashMap0);
  }
}
