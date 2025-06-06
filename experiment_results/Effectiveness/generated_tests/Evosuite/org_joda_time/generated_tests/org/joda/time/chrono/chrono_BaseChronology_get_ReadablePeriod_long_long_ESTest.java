/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:46:12 GMT 2025
 */

package org.joda.time.chrono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.Days;
import org.joda.time.DurationField;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class chrono_BaseChronology_get_ReadablePeriod_long_long_ESTest extends chrono_BaseChronology_get_ReadablePeriod_long_long_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(durationField0).add(anyLong() , anyInt());
      doReturn(2146880760).when(durationField0).getDifference(anyLong() , anyLong());
      doReturn(true, true, true, true, true).when(durationField0).isSupported();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(durationField0).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn(durationField0).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn(durationField0).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn(durationField0).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn(durationField0).when(chronology0).hours();
      doReturn(durationField0).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn(durationField0).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn(durationField0).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn(durationField0).when(chronology0).seconds();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn(durationField0).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn(durationField0).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn(durationField0).when(chronology0).years();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, chronology0, islamicChronology_LeapYearPatternType0);
      Days days0 = Days.MAX_VALUE;
      int[] intArray0 = islamicChronology0.get((ReadablePeriod) days0, (long) 1, (long) (-1161));
      assertArrayEquals(new int[] {2146880760}, intArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DurationField durationField0 = mock(DurationField.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(durationField0).getDifference(anyLong() , anyLong());
      doReturn(true, true, true, true, true).when(durationField0).isSupported();
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn(durationField0).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn(durationField0).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn(durationField0).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn(durationField0).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn(durationField0).when(chronology0).hours();
      doReturn(durationField0).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn(durationField0).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn(durationField0).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn(durationField0).when(chronology0).seconds();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn(durationField0).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn(durationField0).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn(durationField0).when(chronology0).years();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, chronology0, islamicChronology_LeapYearPatternType0);
      Days days0 = Days.MAX_VALUE;
      int[] intArray0 = islamicChronology0.get((ReadablePeriod) days0, (long) 1, (long) (-1161));
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Chronology chronology0 = mock(Chronology.class, new ViolatedAssumptionAnswer());
      doReturn((DurationField) null).when(chronology0).centuries();
      doReturn((DateTimeField) null).when(chronology0).centuryOfEra();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfDay();
      doReturn((DateTimeField) null).when(chronology0).clockhourOfHalfday();
      doReturn((DateTimeField) null).when(chronology0).dayOfMonth();
      doReturn((DateTimeField) null).when(chronology0).dayOfWeek();
      doReturn((DateTimeField) null).when(chronology0).dayOfYear();
      doReturn((DurationField) null).when(chronology0).days();
      doReturn((DateTimeField) null).when(chronology0).era();
      doReturn((DurationField) null).when(chronology0).eras();
      doReturn((DateTimeField) null).when(chronology0).halfdayOfDay();
      doReturn((DurationField) null).when(chronology0).halfdays();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).hourOfDay();
      doReturn((DateTimeField) null).when(chronology0).hourOfHalfday();
      doReturn((DurationField) null).when(chronology0).hours();
      doReturn((DurationField) null).when(chronology0).millis();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).millisOfDay();
      doReturn((DateTimeField) null).when(chronology0).millisOfSecond();
      doReturn((DateTimeField) null).when(chronology0).minuteOfDay();
      doReturn((DateTimeField) null).when(chronology0).minuteOfHour();
      doReturn((DurationField) null).when(chronology0).minutes();
      doReturn((DateTimeField) null).when(chronology0).monthOfYear();
      doReturn((DurationField) null).when(chronology0).months();
      doReturn((DateTimeField) null).when(chronology0).secondOfDay();
      doReturn((DateTimeField) null).when(chronology0).secondOfMinute();
      doReturn((DurationField) null).when(chronology0).seconds();
      doReturn((DateTimeField) null).when(chronology0).weekOfWeekyear();
      doReturn((DurationField) null).when(chronology0).weeks();
      doReturn((DateTimeField) null).when(chronology0).weekyear();
      doReturn((DateTimeField) null).when(chronology0).weekyearOfCentury();
      doReturn((DurationField) null).when(chronology0).weekyears();
      doReturn((DateTimeField) null, (DateTimeField) null).when(chronology0).year();
      doReturn((DateTimeField) null).when(chronology0).yearOfCentury();
      doReturn((DateTimeField) null).when(chronology0).yearOfEra();
      doReturn((DurationField) null).when(chronology0).years();
      IslamicChronology.LeapYearPatternType islamicChronology_LeapYearPatternType0 = IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
      IslamicChronology islamicChronology0 = new IslamicChronology(chronology0, chronology0, islamicChronology_LeapYearPatternType0);
      Object object0 = new Object();
      CopticChronology copticChronology0 = new CopticChronology(islamicChronology0, object0, 1);
      EthiopicChronology ethiopicChronology0 = new EthiopicChronology(copticChronology0, object0, 1);
      JulianChronology julianChronology0 = new JulianChronology(ethiopicChronology0, object0, 1);
      Days days0 = Days.MAX_VALUE;
      int[] intArray0 = julianChronology0.get((ReadablePeriod) days0, (long) 1, (long) 1);
      assertEquals(1, intArray0.length);
  }
}
