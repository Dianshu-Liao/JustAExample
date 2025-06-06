/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 16:17:42 GMT 2025
 */

package com.fasterxml.jackson.core.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.fasterxml.jackson.core.ErrorReportConfiguration;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class base_ParserMinimalBase_isExpectedStartObjectToken__ESTest extends base_ParserMinimalBase_isExpectedStartObjectToken__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      StringReader stringReader0 = new StringReader("Array");
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, objectCodec0, charsToNameCanonicalizer0);
      boolean boolean0 = readerBasedJsonParser0.isExpectedStartObjectToken();
      assertFalse(boolean0);
  }
}
