/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 27 20:51:59 GMT 2023
 */

package org.apache.commons.mail;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.apache.commons.mail.EmailException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmailException_ESTest extends EmailException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmailException emailException0 = new EmailException();
      // Undeclared exception!
      try { 
        emailException0.printStackTrace((PrintStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmailException emailException0 = new EmailException();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("eI");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, false);
      emailException0.printStackTrace((PrintWriter) mockPrintWriter0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmailException emailException0 = new EmailException();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("eI");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
      emailException0.printStackTrace((PrintStream) mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmailException emailException0 = new EmailException();
      EmailException emailException1 = new EmailException("eI", emailException0);
      assertFalse(emailException1.equals((Object)emailException0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmailException emailException0 = new EmailException("net.sourceforge.pmd.lang.PlainTextLanguage");
      // Undeclared exception!
      try { 
        emailException0.printStackTrace((PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockThrowable", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      EmailException emailException0 = new EmailException(mockThrowable0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmailException emailException0 = new EmailException();
      emailException0.printStackTrace();
  }
}
