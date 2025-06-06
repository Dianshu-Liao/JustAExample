/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:34:09 GMT 2025
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.IfTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class functors_IfTransformer_transform_Object_ESTest extends functors_IfTransformer_transform_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Integer> predicate0 = (Predicate<Integer>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(predicate0).test(anyInt());
      Integer integer0 = new Integer(1);
      Transformer<Integer, Integer> transformer0 = (Transformer<Integer, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(transformer0).apply(anyInt());
      IfTransformer<Integer, Integer> ifTransformer0 = new IfTransformer<Integer, Integer>(predicate0, transformer0, transformer0);
      Integer integer1 = ifTransformer0.transform(integer0);
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Predicate<Integer> predicate0 = (Predicate<Integer>) mock(Predicate.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(predicate0).test(anyInt());
      Transformer<Integer, Integer> transformer0 = (Transformer<Integer, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(transformer0).apply(anyInt());
      IfTransformer<Integer, Integer> ifTransformer0 = new IfTransformer<Integer, Integer>(predicate0, transformer0, transformer0);
      Integer integer0 = ifTransformer0.transform((Integer) null);
      assertNull(integer0);
  }
}
