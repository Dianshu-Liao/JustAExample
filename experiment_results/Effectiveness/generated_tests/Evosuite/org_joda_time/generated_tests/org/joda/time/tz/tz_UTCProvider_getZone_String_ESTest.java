/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:33:54 GMT 2025
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.UTCProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class tz_UTCProvider_getZone_String_ESTest extends tz_UTCProvider_getZone_String_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone dateTimeZone0 = uTCProvider0.getZone("UTC");
      assertEquals("UTC", dateTimeZone0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UTCProvider uTCProvider0 = new UTCProvider();
      DateTimeZone dateTimeZone0 = uTCProvider0.getZone("");
      assertNull(dateTimeZone0);
  }
}
