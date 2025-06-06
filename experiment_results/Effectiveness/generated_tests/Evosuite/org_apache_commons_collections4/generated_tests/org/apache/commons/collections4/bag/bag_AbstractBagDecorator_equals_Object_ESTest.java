/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:51:03 GMT 2025
 */

package org.apache.commons.collections4.bag;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Comparator;
import org.apache.commons.collections4.bag.CollectionBag;
import org.apache.commons.collections4.bag.CollectionSortedBag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.collections4.bag.TreeBag;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class bag_AbstractBagDecorator_equals_Object_ESTest extends bag_AbstractBagDecorator_equals_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      CollectionSortedBag<Integer> collectionSortedBag0 = new CollectionSortedBag<Integer>(treeBag0);
      Object object0 = new Object();
      boolean boolean0 = collectionSortedBag0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TreeBag<Integer> treeBag0 = new TreeBag<Integer>();
      SynchronizedSortedBag<Integer> synchronizedSortedBag0 = new SynchronizedSortedBag<Integer>(treeBag0, treeBag0);
      CollectionSortedBag<Integer> collectionSortedBag0 = new CollectionSortedBag<Integer>(synchronizedSortedBag0);
      boolean boolean0 = collectionSortedBag0.equals(synchronizedSortedBag0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeBag<HashBag<Object>> treeBag0 = new TreeBag<HashBag<Object>>(comparator0);
      CollectionBag<HashBag<Object>> collectionBag0 = new CollectionBag<HashBag<Object>>(treeBag0);
      boolean boolean0 = collectionBag0.equals(collectionBag0);
      assertTrue(boolean0);
  }
}
