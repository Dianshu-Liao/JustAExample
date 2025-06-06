/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:37:35 GMT 2025
 */

package org.apache.commons.collections4.functors;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.functors.ConstantTransformer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class functors_ConstantTransformer_hashCode__ESTest extends functors_ConstantTransformer_hashCode__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      ConstantTransformer<Integer, Integer> constantTransformer0 = new ConstantTransformer<Integer, Integer>(integer0);
      constantTransformer0.hashCode();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstantTransformer<Integer, Integer> constantTransformer0 = new ConstantTransformer<Integer, Integer>((Integer) null);
      constantTransformer0.hashCode();
  }
}
