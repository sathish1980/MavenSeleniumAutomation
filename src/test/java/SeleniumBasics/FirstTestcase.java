package SeleniumBasics;

import org.openqa.selenium.WebDriver;
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
		driver.get("https://www.gmail.com/");
	}
	
	public void favorites() throws InterruptedException
	{
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
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
		FT.favorites();
		FT.close();
	}
}
