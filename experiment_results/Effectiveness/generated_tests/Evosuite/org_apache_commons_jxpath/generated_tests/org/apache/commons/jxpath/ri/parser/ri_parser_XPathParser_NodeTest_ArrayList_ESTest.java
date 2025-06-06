/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 05:04:37 GMT 2025
 */

package org.apache.commons.jxpath.ri.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import org.apache.commons.jxpath.ri.parser.XPathParser;
import org.apache.commons.jxpath.ri.parser.XPathParserTokenManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class ri_parser_XPathParser_NodeTest_ArrayList_ESTest extends ri_parser_XPathParser_NodeTest_ArrayList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      XPathParser xPathParser0 = new XPathParser(pipedInputStream0);
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"<EOF>\" at line 0, column 0.
         // Was expecting one of:
         //     \"or\" ...
         //     \"and\" ...
         //     \"mod\" ...
         //     \"div\" ...
         //     \"node\" ...
         //     \"text\" ...
         //     \"comment\" ...
         //     \"processing-instruction\" ...
         //     \"self::\" ...
         //     \"child::\" ...
         //     \"parent::\" ...
         //     \"ancestor::\" ...
         //     \"attribute::\" ...
         //     \"namespace::\" ...
         //     \"preceding::\" ...
         //     \"following::\" ...
         //     \"descendant::\" ...
         //     \"ancestor-or-self::\" ...
         //     \"following-sibling::\" ...
         //     \"preceding-sibling::\" ...
         //     \"descendant-or-self::\" ...
         //     \"last\" ...
         //     \"position\" ...
         //     \"count\" ...
         //     \"id\" ...
         //     \"key\" ...
         //     \"local-name\" ...
         //     \"namespace-uri\" ...
         //     \"name\" ...
         //     \"string\" ...
         //     \"concat\" ...
         //     \"starts-with\" ...
         //     \"ends-with\" ...
         //     \"contains\" ...
         //     \"substring-before\" ...
         //     \"substring-after\" ...
         //     \"substring\" ...
         //     \"string-length\" ...
         //     \"normalize-space\" ...
         //     \"translate\" ...
         //     \"boolean\" ...
         //     \"not\" ...
         //     \"true\" ...
         //     \"false\" ...
         //     \"null\" ...
         //     \"lang\" ...
         //     \"number\" ...
         //     \"sum\" ...
         //     \"floor\" ...
         //     \"ceiling\" ...
         //     \"round\" ...
         //     \"format-number\" ...
         //     <NCName> ...
         //     \".\" ...
         //     \"..\" ...
         //     \"@\" ...
         //     \"*\" ...
         //     
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("*Q>KAgL2&},L{");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      ArrayList<InputStream> arrayList0 = new ArrayList<InputStream>();
      // Undeclared exception!
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      StringReader stringReader0 = new StringReader(",&/E]$`3h},S");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      // Undeclared exception!
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 2.  Encountered: \"&\" (38), after : \"\"
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringReader stringReader0 = new StringReader("@4=B");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      ArrayList<InputStream> arrayList0 = new ArrayList<InputStream>();
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"4\" at line 1, column 2.
         // Was expecting one of:
         //     \"or\" ...
         //     \"and\" ...
         //     \"mod\" ...
         //     \"div\" ...
         //     \"node\" ...
         //     \"text\" ...
         //     \"comment\" ...
         //     \"processing-instruction\" ...
         //     \"last\" ...
         //     \"position\" ...
         //     \"count\" ...
         //     \"id\" ...
         //     \"key\" ...
         //     \"local-name\" ...
         //     \"namespace-uri\" ...
         //     \"name\" ...
         //     \"string\" ...
         //     \"concat\" ...
         //     \"starts-with\" ...
         //     \"ends-with\" ...
         //     \"contains\" ...
         //     \"substring-before\" ...
         //     \"substring-after\" ...
         //     \"substring\" ...
         //     \"string-length\" ...
         //     \"normalize-space\" ...
         //     \"translate\" ...
         //     \"boolean\" ...
         //     \"not\" ...
         //     \"true\" ...
         //     \"false\" ...
         //     \"null\" ...
         //     \"lang\" ...
         //     \"number\" ...
         //     \"sum\" ...
         //     \"floor\" ...
         //     \"ceiling\" ...
         //     \"round\" ...
         //     \"format-number\" ...
         //     <NCName> ...
         //     \"*\" ...
         //     
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringReader stringReader0 = new StringReader("[&9.U^");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 2.  Encountered: \"&\" (38), after : \"\"
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      StringReader stringReader0 = new StringReader(".n8");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      // Undeclared exception!
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      StringReader stringReader0 = new StringReader("ssk(&1W6");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      XPathParser xPathParser1 = new XPathParser((XPathParserTokenManager) xPathParser0.token_source);
      // Undeclared exception!
      try { 
        xPathParser1.NodeTest(arrayList0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Lexical error at line 1, column 5.  Encountered: \"&\" (38), after : \"\"
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParserTokenManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("v4P");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      ArrayList<InputStream> arrayList0 = new ArrayList<InputStream>();
      // Undeclared exception!
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      StringReader stringReader0 = new StringReader("self::");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Encountered \"<EOF>\" at line 1, column 6.
         // Was expecting one of:
         //     \"or\" ...
         //     \"and\" ...
         //     \"mod\" ...
         //     \"div\" ...
         //     \"node\" ...
         //     \"text\" ...
         //     \"comment\" ...
         //     \"processing-instruction\" ...
         //     \"last\" ...
         //     \"position\" ...
         //     \"count\" ...
         //     \"id\" ...
         //     \"key\" ...
         //     \"local-name\" ...
         //     \"namespace-uri\" ...
         //     \"name\" ...
         //     \"string\" ...
         //     \"concat\" ...
         //     \"starts-with\" ...
         //     \"ends-with\" ...
         //     \"contains\" ...
         //     \"substring-before\" ...
         //     \"substring-after\" ...
         //     \"substring\" ...
         //     \"string-length\" ...
         //     \"normalize-space\" ...
         //     \"translate\" ...
         //     \"boolean\" ...
         //     \"not\" ...
         //     \"true\" ...
         //     \"false\" ...
         //     \"null\" ...
         //     \"lang\" ...
         //     \"number\" ...
         //     \"sum\" ...
         //     \"floor\" ...
         //     \"ceiling\" ...
         //     \"round\" ...
         //     \"format-number\" ...
         //     <NCName> ...
         //     \"*\" ...
         //     
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      StringReader stringReader0 = new StringReader("and");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      // Undeclared exception!
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("substring-after");
      XPathParser xPathParser0 = new XPathParser(stringReader0);
      ArrayList<InputStream> arrayList0 = new ArrayList<InputStream>();
      // Undeclared exception!
      try { 
        xPathParser0.NodeTest(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.jxpath.ri.parser.XPathParser", e);
      }
  }
}
