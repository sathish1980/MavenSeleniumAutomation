package SeleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class syncronization {
	
	public void syncronizationconcept()
	{
		System.setProperty("webdriver.edge.driver", "D:\\Software\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("firstname")).sendKeys("sathish");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("kumar.sathish189@gmail.com");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("reg_email_confirmation__")));
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kumar.sathish189@gmail.com");
		//fluent wait
		FluentWait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(60))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);
		//Thread.sleep(2000);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		syncronization s = new syncronization();
		s.syncronizationconcept();
	}

}
