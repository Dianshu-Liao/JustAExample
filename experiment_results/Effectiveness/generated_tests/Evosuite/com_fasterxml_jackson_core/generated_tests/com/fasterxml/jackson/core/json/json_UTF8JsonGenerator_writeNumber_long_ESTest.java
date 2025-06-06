/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 14:42:26 GMT 2025
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
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class json_UTF8JsonGenerator_writeNumber_long_ESTest extends json_UTF8JsonGenerator_writeNumber_long_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, (StreamWriteConstraints) null, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      byte[] byteArray0 = new byte[0];
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, Integer.MIN_VALUE, objectCodec0, pipedOutputStream0, byteArray0, (-1006), true);
      // Undeclared exception!
      try { 
        uTF8JsonGenerator0.writeNumber(862L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1006 out of bounds for length 0
         //
         verifyException("com.fasterxml.jackson.core.io.NumberOutput", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[0];
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, streamWriteConstraints0, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(256);
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectCodec0, byteArrayOutputStream0);
      StreamWriteConstraints streamWriteConstraints1 = uTF8JsonGenerator0._streamWriteConstraints;
      IOContext iOContext1 = mock(IOContext.class, new ViolatedAssumptionAnswer());
      doReturn(charArray0).when(iOContext1).allocConcatBuffer();
      doReturn(streamWriteConstraints1).when(iOContext1).streamWriteConstraints();
      ObjectCodec objectCodec1 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      byte[] byteArray0 = new byte[0];
      UTF8JsonGenerator uTF8JsonGenerator1 = new UTF8JsonGenerator(iOContext1, 102, objectCodec1, (OutputStream) null, 'y', byteArray0, 102, false);
      // Undeclared exception!
      try { 
        uTF8JsonGenerator1.writeNumber((-3713L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.fasterxml.jackson.core.json.UTF8JsonGenerator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((StreamWriteConstraints) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, (StreamWriteConstraints) null, errorReportConfiguration0, bufferRecycler0, contentReference0, true);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("DR");
      byte[] byteArray0 = new byte[8];
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 0, objectCodec0, mockFileOutputStream0, byteArray0, (byte)126, true);
      uTF8JsonGenerator0.writeNumber((long) 50000);
      assertArrayEquals(new byte[] {(byte)53, (byte)48, (byte)48, (byte)48, (byte)48, (byte)0, (byte)0, (byte)0}, byteArray0);
      assertEquals(5, uTF8JsonGenerator0.getOutputBuffered());
  }
}
