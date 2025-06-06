/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 20 04:45:45 GMT 2025
 */

package org.apache.commons.codec.language;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.codec.language.MatchRatingApproachEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class language_MatchRatingApproachEncoder_removeVowels_String_ESTest extends language_MatchRatingApproachEncoder_removeVowels_String_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.removeVowels("org.apache.commons.codec.EncoderException");
      assertEquals("oorg.apache.commons.codec.ncoderxception", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MatchRatingApproachEncoder matchRatingApproachEncoder0 = new MatchRatingApproachEncoder();
      String string0 = matchRatingApproachEncoder0.removeVowels("Dk!)JQ7Gh~4 Wx6");
      assertEquals("Dk!)JQ7Gh~4 Wx6", string0);
  }
}
