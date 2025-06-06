/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:04:00 GMT 2025
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.UTCDateTimeZone;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class DateTime_plusYears_int_ESTest extends DateTime_plusYears_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTime dateTime0 = new DateTime();
      DateTime dateTime1 = dateTime0.plusYears(0);
      assertEquals(1392409281320L, dateTime1.getMillis());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UTCDateTimeZone uTCDateTimeZone0 = (UTCDateTimeZone)DateTimeZone.UTC;
      DateTime dateTime0 = new DateTime((DateTimeZone) uTCDateTimeZone0);
      DateTime dateTime1 = dateTime0.plusYears((-34));
      assertEquals(319407681320L, dateTime1.getMillis());
  }
}
