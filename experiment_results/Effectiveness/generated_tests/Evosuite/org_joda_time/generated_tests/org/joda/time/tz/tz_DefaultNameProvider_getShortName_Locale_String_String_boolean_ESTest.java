/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 06:33:33 GMT 2025
 */

package org.joda.time.tz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.tz.DefaultNameProvider;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class tz_DefaultNameProvider_getShortName_Locale_String_String_boolean_ESTest extends tz_DefaultNameProvider_getShortName_Locale_String_String_boolean_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      Locale locale0 = new Locale("a%SLb23", "a%SLb23");
      String string0 = defaultNameProvider0.getShortName(locale0, "", "America/Los_Angeles", true);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      Locale locale0 = new Locale("a%SLb23", "a%SLb23");
      String string0 = defaultNameProvider0.getShortName(locale0, "America/Los_Angeles", "America/Los_Angeles", false);
      assertNotNull(string0);
      assertEquals("PDT", string0);
  }
}
