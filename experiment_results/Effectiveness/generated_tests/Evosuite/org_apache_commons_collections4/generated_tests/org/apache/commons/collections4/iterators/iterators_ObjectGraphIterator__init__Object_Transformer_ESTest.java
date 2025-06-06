/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:10:14 GMT 2025
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.iterators.ObjectGraphIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class iterators_ObjectGraphIterator__init__Object_Transformer_ESTest extends iterators_ObjectGraphIterator__init__Object_Transformer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-2135));
      Transformer<Integer, Integer> transformer0 = (Transformer<Integer, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      ObjectGraphIterator<Integer> objectGraphIterator0 = new ObjectGraphIterator<Integer>(integer0, transformer0);
      Transformer<Object, Integer> transformer1 = (Transformer<Object, Integer>) mock(Transformer.class, new ViolatedAssumptionAnswer());
      ObjectGraphIterator<Object> objectGraphIterator1 = new ObjectGraphIterator<Object>(objectGraphIterator0, transformer1);
  }
}
