package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {
	
	WebDriver driver;
	public void checkboximplementation(String[] actualLanguage)
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.findElement(By.xpath("//*[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//*[text()='Check Box']//parent::a")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='j_idt87:j_idt89']//*[contains(@class,'ui-chkbox-box')]")));
		driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//*[contains(@class,'ui-chkbox-box')]")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		for(int arrayvalue=0;arrayvalue<actualLanguage.length;arrayvalue++)
		{
			String eachrrayvalue=actualLanguage[arrayvalue];
		
		//checkbox in table
		List<WebElement> tablevalue=driver.findElements(By.xpath("//*[@id='j_idt87:basic']//td"));
		int listsize=tablevalue.size();
		for(int i=1;i<=listsize;i++)
		{
			String langauage=driver.findElement(By.xpath("//*[@id='j_idt87:basic']//td["+i+"]//label")).getText();
			if (langauage.equalsIgnoreCase(eachrrayvalue))
			{
				driver.findElement(By.xpath("//*[@id='j_idt87:basic']//td["+i+"]//div[2]")).click();
				break;
			}
			
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbox c = new Checkbox();
		String[] lanauages= {"C-sharp","Java"};
		c.checkboximplementation(lanauages);
		//c.checkboximplementation("Java");
	}

}
