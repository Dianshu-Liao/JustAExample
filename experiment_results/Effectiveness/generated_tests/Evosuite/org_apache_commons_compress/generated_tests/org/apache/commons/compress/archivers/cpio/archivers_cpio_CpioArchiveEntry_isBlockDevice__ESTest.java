/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:43:40 GMT 2025
 */

package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class archivers_cpio_CpioArchiveEntry_isBlockDevice__ESTest extends archivers_cpio_CpioArchiveEntry_isBlockDevice__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry("");
      boolean boolean0 = cpioArchiveEntry0.isBlockDevice();
      assertEquals("", cpioArchiveEntry0.getName());
      assertEquals((short)1, cpioArchiveEntry0.getFormat());
      assertEquals(4, cpioArchiveEntry0.getAlignmentBoundary());
      assertEquals(110, cpioArchiveEntry0.getHeaderSize());
      assertFalse(boolean0);
  }
}
