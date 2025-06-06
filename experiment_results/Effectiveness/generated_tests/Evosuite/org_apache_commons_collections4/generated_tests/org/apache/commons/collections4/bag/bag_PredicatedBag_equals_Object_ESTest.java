/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:51:26 GMT 2025
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Comparator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class bag_PredicatedBag_equals_Object_ESTest extends bag_PredicatedBag_equals_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>((Comparator<? super Object>) null);
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedSortedBag<Object> predicatedSortedBag0 = new PredicatedSortedBag<Object>(treeBag0, predicate0);
      Object object0 = new Object();
      boolean boolean0 = predicatedSortedBag0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreeBag<HashBag<Object>> treeBag0 = new TreeBag<HashBag<Object>>();
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedSortedBag<HashBag<Object>> predicatedSortedBag0 = new PredicatedSortedBag<HashBag<Object>>(treeBag0, predicate0);
      boolean boolean0 = predicatedSortedBag0.equals(treeBag0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TreeBag<Object> treeBag0 = new TreeBag<Object>((Comparator<? super Object>) null);
      Predicate<Object> predicate0 = (Predicate<Object>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      PredicatedSortedBag<Object> predicatedSortedBag0 = new PredicatedSortedBag<Object>(treeBag0, predicate0);
      boolean boolean0 = predicatedSortedBag0.equals(predicatedSortedBag0);
      assertTrue(boolean0);
  }
}
