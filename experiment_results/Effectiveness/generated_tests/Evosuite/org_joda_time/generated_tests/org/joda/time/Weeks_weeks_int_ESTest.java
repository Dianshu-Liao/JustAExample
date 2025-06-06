/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:37:34 GMT 2025
 */

package org.joda.time;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.joda.time.Weeks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Weeks_weeks_int_ESTest extends Weeks_weeks_int_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(Integer.MAX_VALUE);
      assertEquals(Integer.MAX_VALUE, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(3);
      assertEquals(3, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(2);
      assertEquals(2, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(1);
      assertEquals(1, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(0);
      assertEquals(0, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(456);
      assertEquals(456, weeks0.getWeeks());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Weeks weeks0 = Weeks.weeks(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, weeks0.getWeeks());
  }
}
