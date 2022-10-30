package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.BrowserElement;

public class facebooklogoutpage extends BrowserElement
{
	@FindBy(xpath="//*[local-name()='svg' and @aria-label='Your profile']")
	WebElement profile;
	@FindBy(xpath="(//span[text()='Log Out']//parent::div//parent::div)[1]")
	WebElement logout;
	
	
WebDriver driver;

	public facebooklogoutpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String Validateloginusername() 
	{
		waitforelementtobepresence(driver, "//*[text()='Sathish Ramakrishnan']");
		return driver.findElement(By.xpath("//*[text()='Sathish Ramakrishnan']")).getText();
	}
	
	public void ClickonProfile()
	{
		waitforelementtobeClickable(driver, "//*[local-name()='svg' and @aria-label='Your profile']");
		//WebElement profile=driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']"));
		ClickonButton(profile);
	}
	
	public void ClickonLogout()
	{
		waitforelementtobeClickable(driver, "(//span[text()='Log Out']//parent::div//parent::div)[1]");
		//WebElement logout =driver.findElement(By.xpath("(//span[text()='Log Out']//parent::div//parent::div)[1]"));
		ClickonButton(logout);
	}
}
