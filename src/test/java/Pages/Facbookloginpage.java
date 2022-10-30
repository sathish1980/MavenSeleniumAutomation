package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.BrowserElement;

public class Facbookloginpage extends BrowserElement {

	@FindBy(id="email")
	WebElement usrname;
	@FindBy(id="pass")
	WebElement pwd;
	@FindBy(name="login")
	WebElement login;
	
	WebDriver driver;
	
	public Facbookloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
public void Enterusername(String username)
{
	//WebElement usrname=driver.findElement(By.id("email"));
	TextToEnter(usrname, username);
}


public void Enterpassword(String password)
{
	//WebElement pwd=driver.findElement(By.id("pass"));
	TextToEnter(pwd, password);
}

public void ClickOnLogin()
{
//WebElement login=driver.findElement(By.name("login"));
ClickonButton(login);
}

public void ClickOnForgotPassword()
{
WebElement usrname=driver.findElement(By.id("email"));
//TextToEnter(usrname, username);
}

public void ClickOnCreateAccount()
{
WebElement usrname=driver.findElement(By.id("email"));
//TextToEnter(usrname, username);
}
}
