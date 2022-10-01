package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class firsttestcaseonline {
	
	public void launch()
	{
		/*System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.edge.driver", "D:\\Software\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.close();
		//driver.quit();
		driver.get("https://www.facebook.com/");
		/*driver.navigate().to("https://www.gmail.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		//WebElement username=driver.findElement(By.className("inputtext_55r1 _6luy"));
		//username.sendKeys("kumar.sathish189@gmail.com");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("word?")).click();
		//driver.findElement(By.cssSelector("input#identify_email")).sendKeys("sathish");
		driver.findElement(By.cssSelector("input[name=email]")).sendKeys("topvalue");
		//driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("second value");
		driver.findElement(By.xpath("//input[contains(@class,'_9o1w')]")).sendKeys("contains");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firsttestcaseonline f = new firsttestcaseonline();
		f.launch();
	}

}
