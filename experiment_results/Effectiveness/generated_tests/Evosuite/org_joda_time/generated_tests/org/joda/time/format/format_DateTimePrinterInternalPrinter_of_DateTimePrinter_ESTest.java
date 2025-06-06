/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:30:11 GMT 2025
 */

package org.joda.time.format;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.joda.time.format.DateTimePrinter;
import org.joda.time.format.DateTimePrinterInternalPrinter;
import org.joda.time.format.InternalPrinter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class format_DateTimePrinterInternalPrinter_of_DateTimePrinter_ESTest extends format_DateTimePrinterInternalPrinter_of_DateTimePrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DateTimePrinter dateTimePrinter0 = mock(DateTimePrinter.class, new ViolatedAssumptionAnswer());
      DateTimePrinterInternalPrinter dateTimePrinterInternalPrinter0 = (DateTimePrinterInternalPrinter)DateTimePrinterInternalPrinter.of(dateTimePrinter0);
      assertEquals(0, dateTimePrinterInternalPrinter0.estimatePrintedLength());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InternalPrinter internalPrinter0 = DateTimePrinterInternalPrinter.of((DateTimePrinter) null);
      assertNull(internalPrinter0);
  }
}
