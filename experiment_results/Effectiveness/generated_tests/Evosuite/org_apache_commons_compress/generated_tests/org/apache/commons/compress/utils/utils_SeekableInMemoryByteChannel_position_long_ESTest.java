/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:51:12 GMT 2025
 */

package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.compress.utils.SeekableInMemoryByteChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class utils_SeekableInMemoryByteChannel_position_long_ESTest extends utils_SeekableInMemoryByteChannel_position_long_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      try { 
        seekableInMemoryByteChannel0.position(2147483680L);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position must be in range [0..2147483647]
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel(byteArray0);
      seekableInMemoryByteChannel0.position((long) (byte)74);
      assertEquals(74L, seekableInMemoryByteChannel0.position());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SeekableInMemoryByteChannel seekableInMemoryByteChannel0 = new SeekableInMemoryByteChannel();
      try { 
        seekableInMemoryByteChannel0.position((-1294L));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Position must be in range [0..2147483647]
         //
         verifyException("org.apache.commons.compress.utils.SeekableInMemoryByteChannel", e);
      }
  }
}
