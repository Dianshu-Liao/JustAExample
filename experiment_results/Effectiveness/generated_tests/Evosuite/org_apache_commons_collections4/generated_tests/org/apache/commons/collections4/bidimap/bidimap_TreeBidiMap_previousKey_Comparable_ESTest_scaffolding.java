/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 20 04:21:20 GMT 2025
 */

package org.apache.commons.collections4.bidimap;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class bidimap_TreeBidiMap_previousKey_Comparable_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.bidimap.TreeBidiMap"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/Users/dianshuliao/Documents/Research/Knowledge_Distillation_for_LLM_Test_Gen/UnitTestGeneration/saved_data/TenJavaProjects/commons-collections-master"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/9s/7vk_xbtd4svcp0w1m5f92w3m0000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(bidimap_TreeBidiMap_previousKey_Comparable_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.MapIterator",
      "org.apache.commons.collections4.OrderedBidiMap",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$DataElement",
      "org.apache.commons.collections4.KeyValue",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$AbstractView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$Inverse",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseEntryView",
      "org.apache.commons.collections4.Get",
      "org.apache.commons.collections4.OrderedMapIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ValueView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ViewMapIterator",
      "org.apache.commons.collections4.Put",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapEntryIterator",
      "org.apache.commons.collections4.IterableMap",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$KeyView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ViewMapEntryIterator",
      "org.apache.commons.collections4.OrderedMap",
      "org.apache.commons.collections4.OrderedIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$Node",
      "org.apache.commons.collections4.BidiMap",
      "org.apache.commons.collections4.IterableGet",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$AbstractViewIterator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(bidimap_TreeBidiMap_previousKey_Comparable_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.bidimap.TreeBidiMap",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$Node",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$DataElement",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$AbstractViewIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ViewMapIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$AbstractView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$EntryView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$Inverse",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$KeyView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ValueView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$1",
      "org.apache.commons.collections4.iterators.AbstractEmptyIterator",
      "org.apache.commons.collections4.iterators.AbstractEmptyMapIterator",
      "org.apache.commons.collections4.iterators.EmptyOrderedMapIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$ViewMapEntryIterator",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseEntryView",
      "org.apache.commons.collections4.bidimap.TreeBidiMap$InverseViewMapEntryIterator"
    );
  }
}
