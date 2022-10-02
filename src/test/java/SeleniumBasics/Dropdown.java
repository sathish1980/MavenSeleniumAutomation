package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	WebDriver driver;
	public void singleselectdp()
	{

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/select.xhtml");
		Select drodpwon= new Select(driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")));
		System.out.println(drodpwon.isMultiple());
		//drodpwon.selectByIndex(4);
		if(drodpwon.isMultiple()==false)
		{
		drodpwon.selectByVisibleText("Cypress");
		}
	}
	
	
	public void mutiselect() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		Select multidropdown= new Select(driver.findElement(By.xpath("(//*[@id='second'])[2]")));
		System.out.println(multidropdown.isMultiple());
		//drodpwon.selectByIndex(4);
		if(multidropdown.isMultiple())
		{
			multidropdown.selectByIndex(1);
			multidropdown.selectByValue("bonda");
			multidropdown.selectByVisibleText("Pizza");
			Thread.sleep(1000);
			multidropdown.deselectByValue("pizza");
			Thread.sleep(1000);
			multidropdown.deselectByVisibleText("Donut");
			Thread.sleep(1000);
			multidropdown.deselectAll();

		}
	
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dropdown  d = new Dropdown();
		d.mutiselect();
	}

}
