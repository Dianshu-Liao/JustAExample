/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:12:49 GMT 2025
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.PeriodType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class PeriodType_standard__ESTest extends PeriodType_standard__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PeriodType.standard();
      PeriodType periodType0 = PeriodType.standard();
      assertEquals("Standard", periodType0.getName());
      assertNotNull(periodType0);
      assertEquals(8, periodType0.size());
  }
}
