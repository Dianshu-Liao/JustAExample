/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 03:59:54 GMT 2025
 */

package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class CollectionUtils_collect_Iterable_Transformer_ESTest extends CollectionUtils_collect_Iterable_Transformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<LinkedHashSet<Integer>> linkedList0 = new LinkedList<LinkedHashSet<Integer>>();
      Transformer<LinkedHashSet<Integer>, Integer> transformer0 = (Transformer<LinkedHashSet<Integer>, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Collection<Integer> collection0 = CollectionUtils.collect((Iterable<LinkedHashSet<Integer>>) linkedList0, (Transformer<? super LinkedHashSet<Integer>, ? extends Integer>) transformer0);
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Transformer<Integer, Integer> transformer0 = (Transformer<Integer, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Collection<Integer> collection0 = CollectionUtils.collect((Iterable<Integer>) null, (Transformer<? super Integer, ? extends Integer>) transformer0);
      assertNotNull(collection0);
  }
}
