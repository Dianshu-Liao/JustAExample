/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:39:00 GMT 2025
 */

package org.apache.commons.compress.harmony.unpack200.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class harmony_unpack200_bytecode_BCIRenumberedAttribute_renumber_List_ESTest extends harmony_unpack200_bytecode_BCIRenumberedAttribute_renumber_List_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[8];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[8];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(11, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      localVariableTypeTableAttribute0.renumbered = true;
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber((List<Integer>) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Trying to renumber a line number table that has already been renumbered
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[2];
      CPUTF8[] cPUTF8Array0 = new CPUTF8[6];
      LocalVariableTypeTableAttribute localVariableTypeTableAttribute0 = new LocalVariableTypeTableAttribute(255, intArray0, intArray0, cPUTF8Array0, cPUTF8Array0, intArray0);
      // Undeclared exception!
      try { 
        localVariableTypeTableAttribute0.renumber((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute", e);
      }
  }
}
