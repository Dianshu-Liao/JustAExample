/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:55:31 GMT 2025
 */

package org.apache.commons.collections4.multimap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.AbstractMap;
import java.util.HashMap;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.multimap.ArrayListValuedLinkedHashMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class multimap_TransformedMultiValuedMap_transformValue_Object_ESTest extends multimap_TransformedMultiValuedMap_transformValue_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashSetValuedHashMap<Integer, Integer> hashSetValuedHashMap0 = new HashSetValuedHashMap<Integer, Integer>(0);
      Integer integer0 = new Integer(0);
      Transformer<Integer, Integer> transformer0 = (Transformer<Integer, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      TransformedMultiValuedMap<Integer, Integer> transformedMultiValuedMap0 = new TransformedMultiValuedMap<Integer, Integer>(hashSetValuedHashMap0, transformer0, (Transformer<? super Integer, ? extends Integer>) null);
      Integer integer1 = transformedMultiValuedMap0.transformValue(integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> hashMap0 = new HashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>();
      HashSetValuedHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> hashSetValuedHashMap0 = new HashSetValuedHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>(hashMap0);
      ArrayListValuedLinkedHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> arrayListValuedLinkedHashMap0 = new ArrayListValuedLinkedHashMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>(hashSetValuedHashMap0);
      Transformer<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>> transformer0 = (Transformer<AbstractMap.SimpleImmutableEntry<Integer, Integer>, AbstractMap.SimpleImmutableEntry<Integer, Integer>>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      Transformer<Integer, Integer> transformer1 = (Transformer<Integer, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(transformer1).apply(anyInt());
      TransformedMultiValuedMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer> transformedMultiValuedMap0 = new TransformedMultiValuedMap<AbstractMap.SimpleImmutableEntry<Integer, Integer>, Integer>(arrayListValuedLinkedHashMap0, transformer0, transformer1);
      Integer integer1 = transformedMultiValuedMap0.transformValue(integer0);
      assertNull(integer1);
  }
}
