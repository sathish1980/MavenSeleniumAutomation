package SeleniumTestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

@BeforeSuite
public void Beforesuite() 
{
	System.out.println("Before suite");
}

@BeforeTest
public void Beforetest() 
{
	System.out.println("Before Test");
}

@BeforeClass
public void Beforeclass() 
{
	System.out.println("Before Class");
}

@BeforeMethod
public void Beforemethod() 
{
	System.out.println("Before Method");
}

@Test
public void Testcase1() 
{
	System.out.println("Testcase1");
}

@AfterMethod
public void Aftermethod() 
{
	System.out.println("after Method");
}

@AfterClass
public void Afterclass() 
{
	System.out.println("After Class");
}



@AfterTest
public void Aftertest() 
{
	System.out.println("After Test");
}

@AfterSuite
public void Aftersuite() 
{
	System.out.println("After suite");
}

}
