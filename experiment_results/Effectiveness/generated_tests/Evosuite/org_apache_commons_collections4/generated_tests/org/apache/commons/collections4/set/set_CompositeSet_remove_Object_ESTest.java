/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:36:10 GMT 2025
 */

package org.apache.commons.collections4.set;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedHashSet;
import org.apache.commons.collections4.set.CompositeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class set_CompositeSet_remove_Object_ESTest extends set_CompositeSet_remove_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      CompositeSet<Integer> compositeSet0 = new CompositeSet<Integer>(linkedHashSet0);
      boolean boolean0 = compositeSet0.remove(linkedHashSet0);
      assertFalse(boolean0);
  }
}
