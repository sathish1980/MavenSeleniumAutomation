package TestNgpackage;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Testngannotate {
	
@BeforeSuite(alwaysRun=true)
public void beforesuite()
{
	System.out.println("Before Suite");
}

@AfterSuite
public void aftersuite()
{
	System.out.println("After Suite");
}

@BeforeTest
public void beforetest()
{
	System.out.println("Before Test");
}

@AfterTest
public void aftertest()
{
	System.out.println("After Test");
}

@BeforeClass
public void beforeclass()
{
	System.out.println("Before class");
}

@AfterClass
public void afterclass()
{
	System.out.println("After class");
}

@BeforeMethod
public void BeforeMethod()
{
	System.out.println("Before method");
}

@AfterMethod
public void aftermethod()
{
	System.out.println("After method");
}

@Test(groups= {"Sanity","SIT"})
public void Testcase1()
{
	System.out.println("Testcase1");
}

@Test(groups="SIT")
public void Testcase2()
{
	System.out.println("Testcase2");
}

}
