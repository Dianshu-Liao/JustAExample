/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 15:36:11 GMT 2025
 */

package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.ErrorReportConfiguration;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class json_ReaderBasedJsonParser__reportInvalidToken_String_String_ESTest extends json_ReaderBasedJsonParser__reportInvalidToken_String_String_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(streamReadConstraints0).hasMaxTokenCount();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(errorReportConfiguration0).getMaxErrorTokenLength();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      StringReader stringReader0 = new StringReader("_!)0UVj?8q=a:{Dy_");
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, objectCodec0, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._reportInvalidToken("", "_!)0UVj?8q=a:{Dy_");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unrecognized token '_...': was expecting _!)0UVj?8q=a:{Dy_
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 2]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(streamReadConstraints0).hasMaxTokenCount();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, (Reader) null, objectCodec0, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._reportInvalidToken("InputData source not (yet?) supported for this format (%s)", "InputData source not (yet?) supported for this format (%s)");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unrecognized token 'InputData source not (yet?) supported for this format (%s)': was expecting InputData source not (yet?) supported for this format (%s)
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 1]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(streamReadConstraints0).hasMaxTokenCount();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      doReturn(20000000).when(errorReportConfiguration0).getMaxErrorTokenLength();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      StringReader stringReader0 = new StringReader("_!)0UVj?8q=a:{Dy_");
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1, stringReader0, objectCodec0, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._reportInvalidToken("", "_!)0UVj?8q=a:{Dy_");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unrecognized token '_': was expecting _!)0UVj?8q=a:{Dy_
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 2]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }
}
