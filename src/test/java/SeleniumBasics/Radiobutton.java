package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobutton {
	WebDriver driver;
	public void radiobuttonimplementation(String actualLanguage)
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.findElement(By.xpath("//*[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//*[text()='Radio Button']//parent::a")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("(//*[text()='Chrome']//parent::td//div[1])[1]")));
		driver.findElement(By.xpath("(//*[text()='Chrome']//parent::td//div[1])[1]")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Radiobutton r = new Radiobutton();
		r.radiobuttonimplementation(null);
	}

}
