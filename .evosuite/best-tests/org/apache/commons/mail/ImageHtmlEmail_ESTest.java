/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 27 20:45:31 GMT 2023
 */

package org.apache.commons.mail;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import org.apache.commons.mail.DataSourceResolver;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.resolver.DataSourceClassPathResolver;
import org.apache.maven.model.Model;
import org.apache.maven.project.MavenProject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ImageHtmlEmail_ESTest extends ImageHtmlEmail_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ImageHtmlEmail imageHtmlEmail0 = new ImageHtmlEmail();
      imageHtmlEmail0.html = "(<[Ss][Cc][Rr][Ii][Pp][Tt]s*.*?s+[Ss][Rr][Cc]s*=s*[\"'])([^\"']+?)([\"'])";
      Model model0 = new Model();
      MavenProject mavenProject0 = new MavenProject(model0);
      Properties properties0 = mavenProject0.getProperties();
      Session session0 = Session.getInstance(properties0);
      MimeMessage mimeMessage0 = new MimeMessage(session0);
      imageHtmlEmail0.message = mimeMessage0;
      // Undeclared exception!
      try { 
        imageHtmlEmail0.buildMimeMessage();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // The MimeMessage is already built.
         //
         verifyException("org.apache.commons.mail.Email", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ImageHtmlEmail imageHtmlEmail0 = new ImageHtmlEmail();
      imageHtmlEmail0.html = "(<[Ii][Mm][Gg]s*[^>]*?s+[Ss][Rr][Cc]s*=s*[\"'])([^\"'s]+?)([\"'])";
      try { 
        imageHtmlEmail0.buildMimeMessage();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot find valid hostname for mail session
         //
         verifyException("org.apache.commons.mail.Email", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ImageHtmlEmail imageHtmlEmail0 = new ImageHtmlEmail();
      DataSourceResolver dataSourceResolver0 = imageHtmlEmail0.getDataSourceResolver();
      assertNull(dataSourceResolver0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ImageHtmlEmail imageHtmlEmail0 = new ImageHtmlEmail();
      // Undeclared exception!
      try { 
        imageHtmlEmail0.buildMimeMessage();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ImageHtmlEmail imageHtmlEmail0 = new ImageHtmlEmail();
      DataSourceClassPathResolver dataSourceClassPathResolver0 = new DataSourceClassPathResolver();
      imageHtmlEmail0.setDataSourceResolver(dataSourceClassPathResolver0);
      DataSourceClassPathResolver dataSourceClassPathResolver1 = (DataSourceClassPathResolver)imageHtmlEmail0.getDataSourceResolver();
      assertEquals("/", dataSourceClassPathResolver1.getClassPathBase());
  }
}