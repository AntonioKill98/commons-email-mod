/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 27 20:48:27 GMT 2023
 */

package org.apache.commons.mail.resolver;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import javax.activation.DataSource;
import org.apache.commons.mail.DataSourceResolver;
import org.apache.commons.mail.resolver.DataSourceCompositeResolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataSourceCompositeResolver_ESTest extends DataSourceCompositeResolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[1];
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0, true);
      DataSourceResolver[] dataSourceResolverArray1 = dataSourceCompositeResolver0.getDataSourceResolvers();
      assertNotSame(dataSourceResolverArray0, dataSourceResolverArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DataSourceCompositeResolver dataSourceCompositeResolver0 = null;
      try {
        dataSourceCompositeResolver0 = new DataSourceCompositeResolver((DataSourceResolver[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceCompositeResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DataSourceCompositeResolver dataSourceCompositeResolver0 = null;
      try {
        dataSourceCompositeResolver0 = new DataSourceCompositeResolver((DataSourceResolver[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceCompositeResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[0];
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0);
      DataSource dataSource0 = dataSourceCompositeResolver0.resolve("/+9M", true);
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[6];
      DataSourceResolver dataSourceResolver0 = mock(DataSourceResolver.class, new ViolatedAssumptionAnswer());
      doReturn((DataSource) null).when(dataSourceResolver0).resolve(anyString() , anyBoolean());
      dataSourceResolverArray0[0] = dataSourceResolver0;
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0);
      // Undeclared exception!
      try { 
        dataSourceCompositeResolver0.resolve("", false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceCompositeResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[6];
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(dataSource0).toString();
      DataSourceResolver dataSourceResolver0 = mock(DataSourceResolver.class, new ViolatedAssumptionAnswer());
      doReturn(dataSource0).when(dataSourceResolver0).resolve(anyString() , anyBoolean());
      dataSourceResolverArray0[0] = dataSourceResolver0;
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0, true);
      DataSource dataSource1 = dataSourceCompositeResolver0.resolve("org.apache.commons.mail.resolver.DataSourceCompositeResolver", true);
      assertSame(dataSource1, dataSource0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[0];
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0, true);
      DataSourceResolver[] dataSourceResolverArray1 = dataSourceCompositeResolver0.getDataSourceResolvers();
      assertNotSame(dataSourceResolverArray0, dataSourceResolverArray1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[0];
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0, true);
      try { 
        dataSourceCompositeResolver0.resolve("'6&D\"0wm]Aos", false);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The following resource was not found : '6&D\"0wm]Aos
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceCompositeResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[6];
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      DataSourceResolver dataSourceResolver0 = mock(DataSourceResolver.class, new ViolatedAssumptionAnswer());
      doReturn(dataSource0).when(dataSourceResolver0).resolve(anyString() , anyBoolean());
      dataSourceResolverArray0[0] = dataSourceResolver0;
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0, true);
      // Undeclared exception!
      try { 
        dataSourceCompositeResolver0.resolve((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceCompositeResolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[1];
      DataSourceResolver[] dataSourceResolverArray1 = new DataSourceResolver[6];
      DataSource dataSource0 = mock(DataSource.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null).when(dataSource0).toString();
      DataSourceResolver dataSourceResolver0 = mock(DataSourceResolver.class, new ViolatedAssumptionAnswer());
      doReturn(dataSource0).when(dataSourceResolver0).resolve(anyString() , anyBoolean());
      dataSourceResolverArray1[0] = dataSourceResolver0;
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray1, true);
      dataSourceResolverArray0[0] = (DataSourceResolver) dataSourceCompositeResolver0;
      DataSourceCompositeResolver dataSourceCompositeResolver1 = new DataSourceCompositeResolver(dataSourceResolverArray0);
      DataSource dataSource1 = dataSourceCompositeResolver1.resolve("org.apache.commons.mail.resolver.DataSourceCompositeResolver");
      assertSame(dataSource1, dataSource0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[0];
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0, true);
      DataSource dataSource0 = dataSourceCompositeResolver0.resolve("'6&D\"0wm]Aos");
      assertNull(dataSource0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DataSourceResolver[] dataSourceResolverArray0 = new DataSourceResolver[0];
      DataSourceCompositeResolver dataSourceCompositeResolver0 = new DataSourceCompositeResolver(dataSourceResolverArray0, false);
      try { 
        dataSourceCompositeResolver0.resolve("Mu");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The following resource was not found : Mu
         //
         verifyException("org.apache.commons.mail.resolver.DataSourceCompositeResolver", e);
      }
  }
}
