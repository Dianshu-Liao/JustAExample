/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:20:53 GMT 2025
 */

package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringReader;
import org.apache.commons.jxpath.ri.parser.XPathParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_parser_XPathParser_NodeType__ESTest extends ri_parser_XPathParser_NodeType__ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3;;DfZX/umXYDF,");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      // Undeclared exception!
      try { 
        xPathParser0.NodeType();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 2.  Encountered: \";\" (59), after : \"\"
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParserTokenManager", e);
      }
  }
}
