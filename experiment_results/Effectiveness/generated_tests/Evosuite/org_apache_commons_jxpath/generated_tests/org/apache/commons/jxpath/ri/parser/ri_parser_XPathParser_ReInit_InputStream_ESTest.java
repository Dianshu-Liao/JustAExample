/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:19:43 GMT 2025
 */

package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.commons.jxpath.ri.parser.XPathParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_parser_XPathParser_ReInit_InputStream_ESTest extends ri_parser_XPathParser_ReInit_InputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 3189, 2048);
      XPathParser xPathParser0 = new XPathParser(byteArrayInputStream0);
      xPathParser0.ReInit((InputStream) byteArrayInputStream0);
      assertEquals((-3189), byteArrayInputStream0.available());
  }
}
