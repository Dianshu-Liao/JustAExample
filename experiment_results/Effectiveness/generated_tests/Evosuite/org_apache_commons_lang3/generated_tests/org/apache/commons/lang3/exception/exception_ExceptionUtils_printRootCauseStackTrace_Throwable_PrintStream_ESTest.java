/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:50:50 GMT 2025
 */

package org.apache.commons.lang3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.UndeclaredThrowableException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockError;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class exception_ExceptionUtils_printRootCauseStackTrace_Throwable_PrintStream_ESTest extends exception_ExceptionUtils_printRootCauseStackTrace_Throwable_PrintStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0);
      ExceptionUtils.printRootCauseStackTrace((Throwable) null, (PrintStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      UndeclaredThrowableException undeclaredThrowableException0 = new UndeclaredThrowableException(mockThrowable0);
      MockError mockError0 = new MockError(undeclaredThrowableException0);
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException("xf8R>w4_mG{P$sO", mockError0);
      // Undeclared exception!
      try { 
        ExceptionUtils.printRootCauseStackTrace((Throwable) mockRuntimeException0, (PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // printStream
         //
         verifyException("java.util.Objects", e);
      }
  }
}
