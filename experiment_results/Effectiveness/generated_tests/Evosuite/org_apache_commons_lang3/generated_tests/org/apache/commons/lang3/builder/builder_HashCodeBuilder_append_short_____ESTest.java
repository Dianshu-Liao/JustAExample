/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:40:32 GMT 2025
 */

package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class builder_HashCodeBuilder_append_short_____ESTest extends builder_HashCodeBuilder_append_short_____ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      hashCodeBuilder0.append((short[]) null);
      assertEquals(629, hashCodeBuilder0.toHashCode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashCodeBuilder hashCodeBuilder0 = new HashCodeBuilder();
      short[] shortArray0 = new short[1];
      hashCodeBuilder0.append(shortArray0);
      assertEquals(629, (int)hashCodeBuilder0.build());
  }
}
