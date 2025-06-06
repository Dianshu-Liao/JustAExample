/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:46:08 GMT 2025
 */

package org.apache.commons.collections4.comparators;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.comparators.BooleanComparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class comparators_BooleanComparator_hashCode__ESTest extends comparators_BooleanComparator_hashCode__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanComparator booleanComparator0 = new BooleanComparator(true);
      booleanComparator0.hashCode();
      assertTrue(booleanComparator0.sortsTrueFirst());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanComparator booleanComparator0 = new BooleanComparator();
      booleanComparator0.hashCode();
      assertFalse(booleanComparator0.sortsTrueFirst());
  }
}
