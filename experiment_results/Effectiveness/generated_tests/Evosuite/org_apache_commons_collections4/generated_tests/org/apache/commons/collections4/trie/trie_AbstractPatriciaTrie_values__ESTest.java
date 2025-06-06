/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:52:49 GMT 2025
 */

package org.apache.commons.collections4.trie;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashMap;
import org.apache.commons.collections4.trie.PatriciaTrie;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class trie_AbstractPatriciaTrie_values__ESTest extends trie_AbstractPatriciaTrie_values__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      PatriciaTrie<Integer> patriciaTrie0 = new PatriciaTrie<Integer>(hashMap0);
      Collection<Integer> collection0 = patriciaTrie0.values();
      Collection<Integer> collection1 = patriciaTrie0.values();
      assertSame(collection1, collection0);
  }
}
