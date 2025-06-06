/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 14:15:02 GMT 2025
 */

package com.fasterxml.jackson.core.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.ErrorReportConfiguration;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class io_UTF8Writer_write_int_ESTest extends io_UTF8Writer_write_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = ContentReference.REDACTED_CONTENT;
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, (StreamWriteConstraints) null, (ErrorReportConfiguration) null, bufferRecycler0, contentReference0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      UTF8Writer uTF8Writer0 = new UTF8Writer(iOContext0, byteArrayOutputStream0);
      uTF8Writer0.write(65584);
      assertEquals((-56613888), UTF8Writer.SURROGATE_BASE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = ContentReference.REDACTED_CONTENT;
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, (StreamWriteConstraints) null, (ErrorReportConfiguration) null, bufferRecycler0, contentReference0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("getMaxDocumentLength", false);
      UTF8Writer uTF8Writer0 = new UTF8Writer(iOContext0, mockFileOutputStream0);
      uTF8Writer0.write(3567);
      assertEquals((-56613888), UTF8Writer.SURROGATE_BASE);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = ContentReference.REDACTED_CONTENT;
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, (StreamWriteConstraints) null, (ErrorReportConfiguration) null, bufferRecycler0, contentReference0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("getMaxDocumentLength", false);
      UTF8Writer uTF8Writer0 = new UTF8Writer(iOContext0, mockFileOutputStream0);
      uTF8Writer0.write(2000);
      assertEquals((-56613888), UTF8Writer.SURROGATE_BASE);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = ContentReference.REDACTED_CONTENT;
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, (StreamWriteConstraints) null, (ErrorReportConfiguration) null, bufferRecycler0, contentReference0, false);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1);
      UTF8Writer uTF8Writer0 = new UTF8Writer(iOContext0, byteArrayOutputStream0);
      try { 
        uTF8Writer0.write(57343);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unmatched second part of surrogate pair (0xdfff)
         //
         verifyException("com.fasterxml.jackson.core.io.UTF8Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = ContentReference.REDACTED_CONTENT;
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, (StreamWriteConstraints) null, (ErrorReportConfiguration) null, bufferRecycler0, contentReference0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("getMaxDocumentLength", false);
      UTF8Writer uTF8Writer0 = new UTF8Writer(iOContext0, mockFileOutputStream0);
      try { 
        uTF8Writer0.write(20000000);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Illegal character point (0x1312d00) to output; max is 0x10FFFF as per RFC 4627
         //
         verifyException("com.fasterxml.jackson.core.io.UTF8Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = ContentReference.REDACTED_CONTENT;
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, (StreamWriteConstraints) null, (ErrorReportConfiguration) null, bufferRecycler0, contentReference0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("getMaxDocumentLength");
      UTF8Writer uTF8Writer0 = new UTF8Writer(iOContext0, mockFileOutputStream0);
      uTF8Writer0.write(55296);
      try { 
        uTF8Writer0.write(1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Broken surrogate pair: first char 0xd800, second 0x1; illegal combination
         //
         verifyException("com.fasterxml.jackson.core.io.UTF8Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BufferRecycler bufferRecycler0 = new BufferRecycler();
      ContentReference contentReference0 = ContentReference.REDACTED_CONTENT;
      IOContext iOContext0 = new IOContext((StreamReadConstraints) null, (StreamWriteConstraints) null, (ErrorReportConfiguration) null, bufferRecycler0, contentReference0, false);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("getMaxDocumentLength", false);
      UTF8Writer uTF8Writer0 = new UTF8Writer(iOContext0, mockFileOutputStream0);
      uTF8Writer0.write(3);
      assertEquals((-56613888), UTF8Writer.SURROGATE_BASE);
  }
}
