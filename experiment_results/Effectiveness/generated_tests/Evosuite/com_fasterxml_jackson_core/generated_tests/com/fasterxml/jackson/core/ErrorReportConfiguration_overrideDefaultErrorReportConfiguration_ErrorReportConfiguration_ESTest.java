/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 13:33:55 GMT 2025
 */

package com.fasterxml.jackson.core;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.ErrorReportConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ErrorReportConfiguration_overrideDefaultErrorReportConfiguration_ErrorReportConfiguration_ESTest extends ErrorReportConfiguration_overrideDefaultErrorReportConfiguration_ErrorReportConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ErrorReportConfiguration.overrideDefaultErrorReportConfiguration((ErrorReportConfiguration) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ErrorReportConfiguration errorReportConfiguration0 = new ErrorReportConfiguration(452, (-1241));
      ErrorReportConfiguration.overrideDefaultErrorReportConfiguration(errorReportConfiguration0);
      assertEquals((-1241), errorReportConfiguration0.getMaxRawContentLength());
      assertEquals(452, errorReportConfiguration0.getMaxErrorTokenLength());
  }
}
