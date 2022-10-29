package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import Utils.Propertyfileread;

public class BrowserDriver extends Propertyfileread {

	public static WebDriver driver;
	
	public void launch()
	{
		String Browsername=propreaddata().getProperty("Browser");
		if(Browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-Notifications");
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		}
		else if (Browsername.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\driverfiles\\edgedriver_win64\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-Notifications");
		driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		}
	}
}
