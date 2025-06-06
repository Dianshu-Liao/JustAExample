/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:56:43 GMT 2025
 */

package org.joda.time.convert;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.PeriodConverter;
import org.joda.time.convert.ReadableDurationConverter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class convert_ConverterManager_addPeriodConverter_PeriodConverter_ESTest extends convert_ConverterManager_addPeriodConverter_PeriodConverter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConverterManager converterManager0 = new ConverterManager();
      PeriodConverter periodConverter0 = converterManager0.addPeriodConverter((PeriodConverter) null);
      assertNull(periodConverter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConverterManager converterManager0 = new ConverterManager();
      ReadableDurationConverter readableDurationConverter0 = new ReadableDurationConverter();
      PeriodConverter periodConverter0 = converterManager0.addPeriodConverter(readableDurationConverter0);
      assertFalse(periodConverter0.equals((Object)readableDurationConverter0));
  }
}
