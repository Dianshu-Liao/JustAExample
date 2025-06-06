/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 07:22:59 GMT 2025
 */

package org.apache.commons.collections4.iterators;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.iterators.AbstractOrderedMapIteratorDecorator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class iterators_UnmodifiableMapIterator_unmodifiableMapIterator_MapIterator_ESTest extends iterators_UnmodifiableMapIterator_unmodifiableMapIterator_MapIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptyOrderedMapIterator<Object, Object> emptyOrderedMapIterator0 = new EmptyOrderedMapIterator<Object, Object>();
      AbstractOrderedMapIteratorDecorator<Object, Object> abstractOrderedMapIteratorDecorator0 = new AbstractOrderedMapIteratorDecorator<Object, Object>(emptyOrderedMapIterator0);
      MapIterator<Object, Object> mapIterator0 = UnmodifiableMapIterator.unmodifiableMapIterator((MapIterator<?, ?>) abstractOrderedMapIteratorDecorator0);
      MapIterator<Object, Object> mapIterator1 = UnmodifiableMapIterator.unmodifiableMapIterator((MapIterator<?, ?>) mapIterator0);
      assertSame(mapIterator0, mapIterator1);
  }
}
