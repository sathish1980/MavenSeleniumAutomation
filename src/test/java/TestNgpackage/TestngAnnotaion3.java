package TestNgpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestngAnnotaion3 {
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method in class 3");
	}

	@Test(groups="Sanity",invocationCount=5,invocationTimeOut=1)
	public void Testcase5()
	{
		System.out.println("Testcase5");
	}
	
	@Test(groups="Sanity",dependsOnMethods="Testcase5",timeOut=60)
	public void Testcase4()
	{
		System.out.println("Testcase4");
	}

}
