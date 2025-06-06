/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 14:43:52 GMT 2025
 */

package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.fasterxml.jackson.core.ErrorReportConfiguration;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class json_UTF8JsonGenerator__releaseBuffers__ESTest extends json_UTF8JsonGenerator__releaseBuffers__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[7];
      IOContext iOContext0 = mock(IOContext.class, new ViolatedAssumptionAnswer());
      doReturn(charArray0).when(iOContext0).allocConcatBuffer();
      doReturn((StreamWriteConstraints) null).when(iOContext0).streamWriteConstraints();
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      byte[] byteArray0 = new byte[1];
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 50000, objectCodec0, byteArrayOutputStream0, byteArray0, 1000, false);
      uTF8JsonGenerator0._releaseBuffers();
      assertEquals(1000, uTF8JsonGenerator0.getOutputBuffered());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      ErrorReportConfiguration errorReportConfiguration0 = mock(ErrorReportConfiguration.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, (StreamWriteConstraints) null, errorReportConfiguration0, bufferRecycler0, contentReference0, false);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("67AC(6oOVS/R", false);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockFileOutputStream0);
      UTF8JsonGenerator uTF8JsonGenerator0 = new UTF8JsonGenerator(iOContext0, 42, objectCodec0, objectOutputStream0);
      uTF8JsonGenerator0._releaseBuffers();
      uTF8JsonGenerator0._releaseBuffers();
      assertEquals(127, uTF8JsonGenerator0.getHighestEscapedChar());
  }
}
