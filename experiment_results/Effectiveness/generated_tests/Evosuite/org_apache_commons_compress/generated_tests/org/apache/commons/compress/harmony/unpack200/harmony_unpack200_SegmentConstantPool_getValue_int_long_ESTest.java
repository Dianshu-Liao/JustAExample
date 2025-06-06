/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:25:17 GMT 2025
 */

package org.apache.commons.compress.harmony.unpack200;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.compress.harmony.unpack200.CpBands;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class harmony_unpack200_SegmentConstantPool_getValue_int_long_ESTest extends harmony_unpack200_SegmentConstantPool_getValue_int_long_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(9, 9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(8, 8);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(7, 64);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(6, 6);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(5, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(3, 1959);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(2, 1L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(1, 530L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      try { 
        segmentConstantPool0.getValue((-3512), (-3512));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot have a negative range
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      ClassFileEntry classFileEntry0 = segmentConstantPool0.getValue((-1), (-1));
      assertNull(classFileEntry0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SegmentConstantPool segmentConstantPool0 = new SegmentConstantPool((CpBands) null);
      // Undeclared exception!
      try { 
        segmentConstantPool0.getValue(4, 0L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.SegmentConstantPool", e);
      }
  }
}
