/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:38:36 GMT 2025
 */

package org.joda.time.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.ReadablePartial;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class base_AbstractPartial_isBefore_ReadablePartial_ESTest extends base_AbstractPartial_isBefore_ReadablePartial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      LocalDateTime localDateTime1 = new LocalDateTime(0L);
      boolean boolean0 = localDateTime1.isBefore(localDateTime0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      LocalDate localDate0 = new LocalDate(dateTimeZone0);
      // Undeclared exception!
      try { 
        localDate0.isBefore((ReadablePartial) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Partial cannot be null
         //
         verifyException("org.joda.time.base.AbstractPartial", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DateTimeZone dateTimeZone0 = DateTimeZone.UTC;
      LocalDateTime localDateTime0 = new LocalDateTime(dateTimeZone0);
      boolean boolean0 = localDateTime0.isBefore(localDateTime0);
      assertFalse(boolean0);
  }
}
