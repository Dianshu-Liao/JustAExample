/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 12:23:48 GMT 2025
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
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class json_ReaderBasedJsonParser__isNextTokenNameMaybe_int_String_ESTest extends json_ReaderBasedJsonParser__isNextTokenNameMaybe_int_String_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(streamReadConstraints0).hasMaxTokenCount();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      doReturn(3, 1).when(errorReportConfiguration0).getMaxErrorTokenLength();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      StringReader stringReader0 = new StringReader("9UA:r32p");
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(charsToNameCanonicalizer0).findSymbol(any(char[].class) , anyInt() , anyInt() , anyInt());
      doReturn(0).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1000, stringReader0, objectCodec0, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._isNextTokenNameMaybe(256, "9UA:r32p");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unrecognized token 'r32...': was expecting (JSON String, Number, Array, Object or token 'null', 'true' or 'false')
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 8]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(streamReadConstraints0).hasMaxTokenCount();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      StringReader stringReader0 = new StringReader("mXD:{m6\"z<");
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn("mXD:{m6\"z<").when(charsToNameCanonicalizer0).findSymbol(any(char[].class) , anyInt() , anyInt() , anyInt());
      doReturn(1000).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1000, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
      readerBasedJsonParser0._isNextTokenNameMaybe(20000000, "mXD:{m6\"z<");
      assertEquals(6, readerBasedJsonParser0.getTokenColumnNr());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(streamReadConstraints0).hasMaxTokenCount();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      StringReader stringReader0 = new StringReader(":8~JQ|GS:?TM");
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(charsToNameCanonicalizer0).findSymbol(any(char[].class) , anyInt() , anyInt() , anyInt());
      doReturn(0).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1000, stringReader0, objectCodec0, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._isNextTokenNameMaybe(1000, ":8~JQ|GS:?TM");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unexpected character ('~' (code 126)): Expected space separating root-level values
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 3]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(streamReadConstraints0).hasMaxTokenCount();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      StringReader stringReader0 = new StringReader("9UA:32p");
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn("9UA:32p").when(charsToNameCanonicalizer0).findSymbol(any(char[].class) , anyInt() , anyInt() , anyInt());
      doReturn(50000).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1000, stringReader0, objectCodec0, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._isNextTokenNameMaybe(20000000, "9UA:32p");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unexpected character ('p' (code 112)): Expected space separating root-level values
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 7]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(streamReadConstraints0).hasMaxTokenCount();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      StringReader stringReader0 = new StringReader("4:-IuCTBd2x");
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn("4:-IuCTBd2x").when(charsToNameCanonicalizer0).findSymbol(any(char[].class) , anyInt() , anyInt() , anyInt());
      doReturn(1000).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1000, stringReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._isNextTokenNameMaybe(20000000, "4:-IuCTBd2x");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unexpected character ('u' (code 117)) in numeric value: expected digit (0-9) to follow minus sign, for valid numeric value
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 5]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(streamReadConstraints0).hasMaxTokenCount();
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      StringReader stringReader0 = new StringReader("9UA:2p");
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(charsToNameCanonicalizer0).findSymbol(any(char[].class) , anyInt() , anyInt() , anyInt());
      doReturn(50000).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 1000, stringReader0, objectCodec0, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._isNextTokenNameMaybe(20000000, "9UA:2p");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unexpected character ('p' (code 112)): Expected space separating root-level values
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 6]
         //
         verifyException("com.fasterxml.jackson.core.JsonParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(streamReadConstraints0).hasMaxTokenCount();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      StringReader stringReader0 = new StringReader("b/6>k5E6gX");
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      CharsToNameCanonicalizer charsToNameCanonicalizer0 = mock(CharsToNameCanonicalizer.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(charsToNameCanonicalizer0).hashSeed();
      ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, stringReader0, objectCodec0, charsToNameCanonicalizer0);
      try { 
        readerBasedJsonParser0._isNextTokenNameMaybe(34, "b/6>k5E6gX");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unexpected end-of-input in field name
         //  at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 11]
         //
         verifyException("com.fasterxml.jackson.core.base.ParserMinimalBase", e);
      }
  }
}
