/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:22:17 GMT 2025
 */

package org.apache.commons.collections4.bloomfilter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.apache.commons.collections4.bloomfilter.IndexExtractor;
import org.apache.commons.collections4.bloomfilter.Shape;
import org.apache.commons.collections4.bloomfilter.SparseBloomFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class bloomfilter_SparseBloomFilter_merge_IndexExtractor_ESTest extends bloomfilter_SparseBloomFilter_merge_IndexExtractor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Shape shape0 = mock(Shape.class, new ViolatedAssumptionAnswer());
      SparseBloomFilter sparseBloomFilter0 = new SparseBloomFilter(shape0);
      boolean boolean0 = sparseBloomFilter0.merge((IndexExtractor) sparseBloomFilter0);
      assertTrue(boolean0);
  }
}
