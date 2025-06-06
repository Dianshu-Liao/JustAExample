/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 14:26:13 GMT 2025
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
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.StringWriter;
import java.io.Writer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class json_WriterBasedJsonGenerator__writeFieldNameTail_SerializableString_ESTest extends json_WriterBasedJsonGenerator__writeFieldNameTail_SerializableString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[5];
      StreamReadConstraints streamReadConstraints0 = mock(StreamReadConstraints.class, new ViolatedAssumptionAnswer());
      StreamWriteConstraints streamWriteConstraints0 = mock(StreamWriteConstraints.class, new ViolatedAssumptionAnswer());
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = mock(ContentReference.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(contentReference0).getRawContent();
      IOContext iOContext0 = new IOContext(streamReadConstraints0, streamWriteConstraints0, (ErrorReportConfiguration) null, bufferRecycler0, contentReference0, false);
      ObjectCodec objectCodec0 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      WriterBasedJsonGenerator writerBasedJsonGenerator0 = new WriterBasedJsonGenerator(iOContext0, 0, objectCodec0, (Writer) null);
      StreamWriteConstraints streamWriteConstraints1 = writerBasedJsonGenerator0._streamWriteConstraints;
      IOContext iOContext1 = mock(IOContext.class, new ViolatedAssumptionAnswer());
      doReturn(charArray0).when(iOContext1).allocConcatBuffer();
      doReturn(streamWriteConstraints1).when(iOContext1).streamWriteConstraints();
      ObjectCodec objectCodec1 = mock(ObjectCodec.class, new ViolatedAssumptionAnswer());
      StringWriter stringWriter0 = new StringWriter(20000000);
      WriterBasedJsonGenerator writerBasedJsonGenerator1 = new WriterBasedJsonGenerator(iOContext1, 2679, objectCodec1, stringWriter0, '=');
      SerializedString serializedString0 = (SerializedString)writerBasedJsonGenerator1._rootValueSeparator;
      writerBasedJsonGenerator1._writeFieldNameTail(serializedString0);
      writerBasedJsonGenerator1._writeFieldNameTail(serializedString0);
      writerBasedJsonGenerator1._writeFieldNameTail(serializedString0);
      assertEquals(" = = ", stringWriter0.toString());
      assertArrayEquals(new char[] {'=', '=', ' ', '=', ' '}, charArray0);
  }
}
