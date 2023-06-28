/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 27 20:43:27 GMT 2023
 */

package org.apache.commons.mail.resolver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import javax.activation.DataSource;
import org.apache.commons.mail.resolver.DataSourceClassPathResolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataSourceClassPathResolver_ESTest extends DataSourceClassPathResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("", false);
      // Undeclared exception!
      try { 
        dataSourceClassPathResolver0.resolve((String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceBaseResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = null;
      try {
        dataSourceClassPathResolver0 = new DataSourceClassPathResolver((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = null;
      try {
        dataSourceClassPathResolver0 = new DataSourceClassPathResolver((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("tZngHHOD/", false);
      try { 
        dataSourceClassPathResolver0.resolve("tZngHHOD/", false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The following class path resource was not found : tZngHHOD/
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceClassPathResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("/", false);
      DataSource dataSource0 = dataSourceClassPathResolver0.resolve("/", false);
      assertNotNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("tZngHHOD/", false);
      DataSource dataSource0 = dataSourceClassPathResolver0.resolve("tZngHHOD/", true);
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("tZngHHOD/", false);
      String string0 = dataSourceClassPathResolver0.getClassPathBase();
      assertEquals("tZngHHOD/", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("[^RMOtRBB?y}4$nJ", true);
      dataSourceClassPathResolver0.resolve("[^RMOtRBB?y}4$nJ");
      assertEquals("[^RMOtRBB?y}4$nJ/", dataSourceClassPathResolver0.getClassPathBase());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("https://");
      try { 
        dataSourceClassPathResolver0.resolve("Uxuoss&c7");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The following class path resource was not found : Uxuoss&c7
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceClassPathResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("[^RMOtRBB?y}4$nJ", true);
      dataSourceClassPathResolver0.resolve("https://", true);
      assertEquals("[^RMOtRBB?y}4$nJ/", dataSourceClassPathResolver0.getClassPathBase());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("https://");
      dataSourceClassPathResolver0.resolve("cid:", false);
      assertEquals("https://", dataSourceClassPathResolver0.getClassPathBase());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("");
      assertEquals("/", dataSourceClassPathResolver0.getClassPathBase());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver();
      // Undeclared exception!
      try { 
        dataSourceClassPathResolver0.resolve((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceBaseResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver("/", false);
      DataSource dataSource0 = dataSourceClassPathResolver0.resolve("/");
      assertNotNull(dataSource0);
  }
}
