/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 27 20:44:28 GMT 2023
 */

package org.apache.commons.mail.resolver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
import javax.activation.DataSource;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.codehaus.classworlds.BytesURLStreamHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataSourceUrlResolver_ESTest extends DataSourceUrlResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("https:");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "");
      DataSource dataSource0 = dataSourceUrlResolver0.resolve("https://", true);
      assertNotNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0, true);
      DataSource dataSource0 = dataSourceUrlResolver0.resolve("*#.B{{zY?");
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/0=,+wJwQ%");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, " \";bU-&pxxfnA");
      DataSource dataSource0 = dataSourceUrlResolver0.resolve("0=,+wJwQ%");
      assertNotNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver((URL) null, false);
      URL uRL0 = dataSourceUrlResolver0.getBaseUrl();
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      BytesURLStreamHandler bytesURLStreamHandler0 = new BytesURLStreamHandler(byteArray0);
      URL uRL0 = MockURL.URL("\u0006%e%!|gT", "", 0, "", (URLStreamHandler) bytesURLStreamHandler0);
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0, false);
      URL uRL1 = dataSourceUrlResolver0.getBaseUrl();
      assertEquals("\u0006%e%!|gt://:0", uRL1.toExternalForm());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      BytesURLStreamHandler bytesURLStreamHandler0 = new BytesURLStreamHandler(byteArray0);
      URL uRL0 = MockURL.URL("|{ dc^", "http://", 1, "|{ dc^", (URLStreamHandler) bytesURLStreamHandler0);
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0, true);
      URL uRL1 = dataSourceUrlResolver0.getBaseUrl();
      assertEquals("|{ dc^://[http://]:1|{ dc^", uRL1.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver((URL) null, false);
      try { 
        dataSourceUrlResolver0.resolve("org.apache.commons.mail.resolver.DataSourceUrlResolver", false);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: org.apache.commons.mail.resolver.DataSourceUrlResolver
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      // Undeclared exception!
      try { 
        dataSourceUrlResolver0.resolve((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceBaseResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      // Undeclared exception!
      try { 
        dataSourceUrlResolver0.resolve("", true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No resource defined
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceUrlResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver((URL) null);
      try { 
        dataSourceUrlResolver0.createUrl((String) null);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      try { 
        dataSourceUrlResolver0.resolve("!hm$j# )BKBXX", false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      URL uRL1 = dataSourceUrlResolver0.createUrl("file:/");
      assertEquals("file", uRL1.getProtocol());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      // Undeclared exception!
      try { 
        dataSourceUrlResolver0.resolve("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No resource defined
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceUrlResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      BytesURLStreamHandler bytesURLStreamHandler0 = new BytesURLStreamHandler(byteArray0);
      URL uRL0 = MockURL.URL("", "", 0, "", (URLStreamHandler) bytesURLStreamHandler0);
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0, false);
      // Undeclared exception!
      try { 
        dataSourceUrlResolver0.createUrl((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No resource defined
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceUrlResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver((URL) null, false);
      try { 
        dataSourceUrlResolver0.resolve("");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: 
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      DataSource dataSource0 = dataSourceUrlResolver0.resolve("FI(JuDQi", true);
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      try { 
        dataSourceUrlResolver0.resolve("http://");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: 
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0, true);
      DataSource dataSource0 = dataSourceUrlResolver0.resolve("cid:", true);
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0, false);
      // Undeclared exception!
      try { 
        dataSourceUrlResolver0.resolve("n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      DataSourceUrlResolver dataSourceUrlResolver0 = new DataSourceUrlResolver(uRL0);
      URL uRL1 = dataSourceUrlResolver0.getBaseUrl();
      assertEquals("some", uRL1.getAuthority());
  }
}