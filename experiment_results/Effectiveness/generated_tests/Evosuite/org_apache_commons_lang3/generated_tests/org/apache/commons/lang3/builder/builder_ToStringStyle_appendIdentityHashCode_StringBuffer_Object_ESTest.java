/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:34:53 GMT 2025
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.StandardToStringStyle;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class builder_ToStringStyle_appendIdentityHashCode_StringBuffer_Object_ESTest extends builder_ToStringStyle_appendIdentityHashCode_StringBuffer_Object_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StandardToStringStyle standardToStringStyle0 = new StandardToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer();
      standardToStringStyle0.MULTI_LINE_STYLE.appendIdentityHashCode(stringBuffer0, (Object) null);
      assertTrue(standardToStringStyle0.isUseFieldNames());
      assertEquals(">", standardToStringStyle0.getSummaryObjectEndText());
      assertEquals("=", standardToStringStyle0.getFieldNameValueSeparator());
      assertEquals("{", standardToStringStyle0.getArrayStart());
      assertEquals("}", standardToStringStyle0.getArrayEnd());
      assertEquals("", stringBuffer0.toString());
      assertTrue(standardToStringStyle0.isUseClassName());
      assertEquals("<", standardToStringStyle0.getSummaryObjectStartText());
      assertEquals("<size=", standardToStringStyle0.getSizeStartText());
      assertEquals("]", standardToStringStyle0.getContentEnd());
      assertTrue(standardToStringStyle0.isDefaultFullDetail());
      assertTrue(standardToStringStyle0.isUseIdentityHashCode());
      assertEquals(",", standardToStringStyle0.getFieldSeparator());
      assertEquals(",", standardToStringStyle0.getArraySeparator());
      assertEquals("<null>", standardToStringStyle0.getNullText());
      assertTrue(standardToStringStyle0.isArrayContentDetail());
      assertEquals("[", standardToStringStyle0.getContentStart());
      assertEquals(">", standardToStringStyle0.getSizeEndText());
      assertEquals(0, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MultilineRecursiveToStringStyle multilineRecursiveToStringStyle0 = new MultilineRecursiveToStringStyle();
      StringBuffer stringBuffer0 = new StringBuffer("i|s{4\"p`j4");
      Object object0 = new Object();
      multilineRecursiveToStringStyle0.appendIdentityHashCode(stringBuffer0, object0);
      assertEquals(12, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ToStringStyle toStringStyle0 = ToStringStyle.SHORT_PREFIX_STYLE;
      Boolean boolean0 = Boolean.TRUE;
      toStringStyle0.appendIdentityHashCode((StringBuffer) null, boolean0);
  }
}
