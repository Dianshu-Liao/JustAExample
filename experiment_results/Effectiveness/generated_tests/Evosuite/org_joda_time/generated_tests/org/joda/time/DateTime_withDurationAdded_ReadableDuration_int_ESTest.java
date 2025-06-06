/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:03:35 GMT 2025
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.ReadableDuration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class DateTime_withDurationAdded_ReadableDuration_int_ESTest extends DateTime_withDurationAdded_ReadableDuration_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTime dateTime0 = new DateTime(0L);
      Duration duration0 = new Duration(dateTime0, dateTime0);
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, 0);
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTime dateTime0 = new DateTime(0L);
      Duration duration0 = new Duration(dateTime0, dateTime0);
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) duration0, (-1));
      assertSame(dateTime1, dateTime0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTime dateTime0 = new DateTime(0L);
      DateTime dateTime1 = dateTime0.withDurationAdded((ReadableDuration) null, 1571);
      assertSame(dateTime1, dateTime0);
  }
}
