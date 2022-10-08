package auto.MavenSeleniumAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DOUBTS1 {
	
	public void launch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ji@gmail");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("psswrd@123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login' or @id='u_0_5_JJ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass' and @id='pass']")).sendKeys("b@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[starts-with(@id,'identify_')]")).sendKeys("1234567");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
