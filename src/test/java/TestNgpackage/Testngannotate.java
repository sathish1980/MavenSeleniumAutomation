package TestNgpackage;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Testngannotate {
	
@BeforeSuite(alwaysRun=true)
public void beforesuite()
{
	System.out.println("Before Suite");
}

@AfterSuite(alwaysRun=true)
public void aftersuite()
{
	System.out.println("After Suite");
}

@BeforeTest(alwaysRun=true)
public void beforetest()
{
	System.out.println("Before Test");
}

@AfterTest(alwaysRun=true)
public void aftertest()
{
	System.out.println("After Test");
}

@BeforeClass(alwaysRun=true)
public void beforeclass()
{
	System.out.println("Before class");
}

@AfterClass(alwaysRun=true)
public void afterclass()
{
	System.out.println("After class");
}

@BeforeMethod(alwaysRun=true)
public void BeforeMethod()
{
	System.out.println("Before method");
}

@AfterMethod(alwaysRun=true)
public void aftermethod()
{
	System.out.println("After method");
}

@Test(groups= {"Sanity","SIT"},priority=1)
public void Testcase1()
{
	System.out.println("Testcase1");
}

@Test(groups="SIT",description="testannotate2",priority=0)
public void Testcase2()
{
	System.out.println("Testcase2");
}

}
