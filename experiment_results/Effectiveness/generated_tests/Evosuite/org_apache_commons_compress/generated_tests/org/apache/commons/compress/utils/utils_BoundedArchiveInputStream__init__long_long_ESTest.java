/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:47:00 GMT 2025
 */

package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.channels.SeekableByteChannel;
import org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class utils_BoundedArchiveInputStream__init__long_long_ESTest extends utils_BoundedArchiveInputStream__init__long_long_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = null;
      try {
        boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream((-1L), (-1L), (SeekableByteChannel) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid length of stream at offset=-1, length=-1
         //
         verifyException("org.apache.commons.compress.utils.BoundedArchiveInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoundedSeekableByteChannelInputStream boundedSeekableByteChannelInputStream0 = new BoundedSeekableByteChannelInputStream(7504L, 7504L, (SeekableByteChannel) null);
  }
}
