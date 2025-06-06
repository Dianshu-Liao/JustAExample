/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:21:32 GMT 2025
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.Iterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class iterators_SkippingIterator_init__ESTest extends iterators_SkippingIterator_init__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      SkippingIterator<Object> skippingIterator0 = new SkippingIterator<Object>(iterator0, 1L);
      SkippingIterator<Object> skippingIterator1 = new SkippingIterator<Object>(skippingIterator0, 1L);
      assertFalse(skippingIterator1.equals((Object)skippingIterator0));
  }
}
