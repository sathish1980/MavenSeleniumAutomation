package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestcase 
{
	WebDriver driver;
	public void launch(String browsername)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver",  System.getProperty("user.dir")+"\\driverfiles\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		}
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.gmail.com/");
	}
	
	public void favorites() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	
	public void locators()
	{
		//driver.findElement(By.id("email"));.sendKeys("kumar.sathish189@gmail.com");
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("kumar.sathish189@gmail.com");
		username.clear();
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sathish");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("word?")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("cssselector");
		driver.findElement(By.cssSelector("input[data-testid=royal_email]")).sendKeys("3rdtype");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xpath");
		driver.findElement(By.xpath("//button[contains(@id,'u_0')]")).click();
	}
	
	public void close()
	{
		driver.close();
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		FirstTestcase FT = new FirstTestcase();
		FT.launch("chrome");
		FT.locators();
		//FT.close();
	}
}
