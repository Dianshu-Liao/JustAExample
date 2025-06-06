/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:00:01 GMT 2025
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.Months;
import org.joda.time.MutableDateTime;
import org.joda.time.MutableInterval;
import org.joda.time.ReadablePeriod;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class MutableInterval_setPeriodBeforeEnd_ReadablePeriod_ESTest extends MutableInterval_setPeriodBeforeEnd_ReadablePeriod_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      MutableDateTime mutableDateTime0 = new MutableDateTime((-2524L), chronology0);
      MutableInterval mutableInterval0 = new MutableInterval((ReadablePeriod) null, mutableDateTime0);
      mutableInterval0.setPeriodBeforeEnd((ReadablePeriod) null);
      assertEquals((-2524L), mutableInterval0.getEndMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(chronology0).add(any(org.joda.time.ReadablePeriod.class) , anyLong() , anyInt());
      MutableInterval mutableInterval0 = new MutableInterval(0L, 0L, chronology0);
      Months months0 = Months.MAX_VALUE;
      mutableInterval0.setPeriodBeforeEnd(months0);
      assertEquals(0L, mutableInterval0.getStartMillis());
  }
}
