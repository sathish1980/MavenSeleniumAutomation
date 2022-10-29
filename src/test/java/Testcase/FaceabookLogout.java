package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Drivers.BrowserDriver;

public class FaceabookLogout extends BrowserDriver {
	
	@Test(priority=0,enabled=false)
	public void Logout()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']")));
		driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Log Out']//parent::div//parent::div)[1]")));
		driver.findElement(By.xpath("(//span[text()='Log Out']//parent::div//parent::div)[1]")).click();
		
	}

}
