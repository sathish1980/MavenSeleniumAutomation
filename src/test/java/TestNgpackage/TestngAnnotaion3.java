package TestNgpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestngAnnotaion3 {
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method");
	}

	@Test(groups="Sanity")
	public void Testcase4()
	{
		System.out.println("Testcase4");
	}

}
