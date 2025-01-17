/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 27 20:47:29 GMT 2023
 */

package org.apache.commons.mail.resolver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import javax.activation.DataSource;
import org.apache.commons.mail.resolver.DataSourceFileResolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataSourceFileResolver_ESTest extends DataSourceFileResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver((File) null, true);
      File file0 = dataSourceFileResolver0.getBaseDir();
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\"vR9hw =J$", "");
      File file0 = mockFile0.getParentFile();
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver(file0, false);
      File file1 = dataSourceFileResolver0.getBaseDir();
      assertFalse(file1.isHidden());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\"vR9hw =J$", "");
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver(mockFile0, false);
      File file0 = dataSourceFileResolver0.getBaseDir();
      assertTrue(file0.isAbsolute());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(".");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "org.apache.commons.mail.resolver.DataSourceFileResolver");
      File file0 = dataSourceFileResolver0.getBaseDir();
      assertEquals(".", file0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver();
      // Undeclared exception!
      try { 
        dataSourceFileResolver0.resolve((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceBaseResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      File file0 = mock(File.class, new ViolatedAssumptionAnswer());
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver(file0);
      // Undeclared exception!
      try { 
        dataSourceFileResolver0.resolve((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceBaseResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver();
      try { 
        dataSourceFileResolver0.resolve("@l}4xL", false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cant resolve the following file resource :/Users/antonio/Documents/GitHub/commons-email-mod/./@l}4xL
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceFileResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver((File) null, true);
      DataSource dataSource0 = dataSourceFileResolver0.resolve("", false);
      assertNotNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver((File) null, true);
      DataSource dataSource0 = dataSourceFileResolver0.resolve("http://", true);
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver();
      DataSource dataSource0 = dataSourceFileResolver0.resolve("/&[,f::&OA/", true);
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver((File) null, true);
      DataSource dataSource0 = dataSourceFileResolver0.resolve("cid:", true);
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver((File) null, true);
      DataSource dataSource0 = dataSourceFileResolver0.resolve("http://");
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver();
      try { 
        dataSourceFileResolver0.resolve(" (error discovering new components)");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cant resolve the following file resource :/Users/antonio/Documents/GitHub/commons-email-mod/./ (error discovering new components)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceFileResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataSourceFileResolver dataSourceFileResolver0 = new DataSourceFileResolver((File) null);
      DataSource dataSource0 = dataSourceFileResolver0.resolve("/");
      assertNotNull(dataSource0);
  }
}
