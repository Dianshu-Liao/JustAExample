/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 15:13:10 GMT 2025
 */

package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.fasterxml.jackson.core.ErrorReportConfiguration;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.DataInput;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class json_UTF8DataInputJsonParser__getText2_JsonToken_ESTest extends json_UTF8DataInputJsonParser__getText2_JsonToken_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = mock(ByteQuadsCanonicalizer.class, new ViolatedAssumptionAnswer());
      UTF8DataInputJsonParser uTF8DataInputJsonParser0 = new UTF8DataInputJsonParser(iOContext0, 3, (DataInput) null, (ObjectCodec) null, byteQuadsCanonicalizer0, 2);
      JsonToken jsonToken0 = JsonToken.VALUE_FALSE;
      String string0 = uTF8DataInputJsonParser0._getText2(jsonToken0);
      assertEquals("false", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(streamReadConstraints0).hasMaxTokenCount();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = mock(ByteQuadsCanonicalizer.class, new ViolatedAssumptionAnswer());
      UTF8DataInputJsonParser uTF8DataInputJsonParser0 = new UTF8DataInputJsonParser(iOContext0, 3, (DataInput) null, (ObjectCodec) null, byteQuadsCanonicalizer0, 500);
      JsonToken jsonToken0 = JsonToken.VALUE_NUMBER_FLOAT;
      String string0 = uTF8DataInputJsonParser0._getText2(jsonToken0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = mock(ByteQuadsCanonicalizer.class, new ViolatedAssumptionAnswer());
      UTF8DataInputJsonParser uTF8DataInputJsonParser0 = new UTF8DataInputJsonParser(iOContext0, 3, (DataInput) null, (ObjectCodec) null, byteQuadsCanonicalizer0, 2);
      JsonToken jsonToken0 = JsonToken.VALUE_NUMBER_INT;
      String string0 = uTF8DataInputJsonParser0._getText2(jsonToken0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn(bufferRecycler0).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = mock(ByteQuadsCanonicalizer.class, new ViolatedAssumptionAnswer());
      UTF8DataInputJsonParser uTF8DataInputJsonParser0 = new UTF8DataInputJsonParser(iOContext0, 3, (DataInput) null, (ObjectCodec) null, byteQuadsCanonicalizer0, 2);
      JsonToken jsonToken0 = JsonToken.FIELD_NAME;
      String string0 = uTF8DataInputJsonParser0._getText2(jsonToken0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((StreamReadConstraints) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = mock(ByteQuadsCanonicalizer.class, new ViolatedAssumptionAnswer());
      UTF8DataInputJsonParser uTF8DataInputJsonParser0 = new UTF8DataInputJsonParser(iOContext0, 2, (DataInput) null, (ObjectCodec) null, byteQuadsCanonicalizer0, 500);
      String string0 = uTF8DataInputJsonParser0._getText2((JsonToken) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(streamReadConstraints0).hasMaxTokenCount();
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      UTF8DataInputJsonParser uTF8DataInputJsonParser0 = new UTF8DataInputJsonParser(iOContext0, 20000000, (DataInput) null, (ObjectCodec) null, (ByteQuadsCanonicalizer) null, 2);
      JsonToken jsonToken0 = JsonToken.VALUE_STRING;
      String string0 = uTF8DataInputJsonParser0._getText2(jsonToken0);
      assertEquals("", string0);
  }
}
