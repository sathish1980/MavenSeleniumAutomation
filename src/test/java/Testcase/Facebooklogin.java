package Testcase;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Common.BrowserElement;
import Drivers.BrowserDriver;
import Pages.Facbookloginpage;
import Pages.facebooklogoutpage;
import Utils.Excelread;

public class Facebooklogin extends BrowserDriver {

File folderpath=new File(System.getProperty("user.dir")+"//Screenshot//");


@BeforeSuite
public void Browserlaunch()
{
	
	deleteFiles(folderpath);
	report= new ExtentReports(reportpath,true);
	test=report.startTest("Execution started");
	launch();
}

@BeforeTest
public void FBURL()
{
	String url=propreaddata().getProperty("URL");
	driver.get(url);
}
	
@Test(priority=0,enabled=false)
public void facebooklogin()
{
	driver.findElement(By.id("email")).sendKeys("kumar.sathish189@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Admin@123");
	driver.findElement(By.name("login")).click();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Sathish Ramakrishnan']")));
	String actualText=driver.findElement(By.xpath("//*[text()='Sathish Ramakrishnan']")).getText();
	Assert.assertEquals(actualText, "Sathish Ramakrishnan");
}

@Test(priority=1,dataProvider="fbtestdata",dataProviderClass=DataProviderdeclaration.class,enabled=false)
public void facebookloginandlogout(String username,String password)
{
	try
	{
	BrowserElement b = new BrowserElement();
	WebElement usrname=driver.findElement(By.id("email"));
	b.TextToEnter(usrname, username);
	test.log(LogStatus.INFO, "Login username : " +username);

	//driver.findElement(By.id("email")).sendKeys(username);
	WebElement pwd=driver.findElement(By.id("pass"));
	b.TextToEnter(pwd, password);
	test.log(LogStatus.INFO, "Login username : " +password);
	//driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	b.waitforelementtobepresence(driver, "//*[text()='Sathish Ramakrishnan']");
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Sathish Ramakrishnan']")));
	String scrnshot1=takescreenshot();
	test.log(LogStatus.INFO, "Login done",test.addScreenCapture(scrnshot1));

	String actualText=driver.findElement(By.xpath("//*[text()='Sathish Ramakrishnan']")).getText();
	Assert.assertEquals(actualText, "Sathish Ramakrishnan");
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	b.waitforelementtobeClickable(driver, "//*[local-name()='svg' and @aria-label='Your profile']");
	
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']")));
	driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Your profile']")).click();
	String scrnshot2=takescreenshot();
	test.log(LogStatus.INFO, "Logout dropdown clicked",test.addScreenCapture(scrnshot2));

	b.waitforelementtobeClickable(driver, "(//span[text()='Log Out']//parent::div//parent::div)[1]");
	
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Log Out']//parent::div//parent::div)[1]")));
	driver.findElement(By.xpath("(//span[text()='Log Out']//parent::div//parent::div)[1]")).click();
	String scrnshot=takescreenshot();
	test.log(LogStatus.PASS, "Login and logout sucessfull",test.addScreenCapture(scrnshot));

	}
	catch(Exception e)
	{
		String scrnshot=takescreenshot();
		test.log(LogStatus.FAIL, test.addScreenCapture(scrnshot),e);

	}
}

@Test(priority=1,dataProvider="fbtestdata",dataProviderClass=DataProviderdeclaration.class)
public void facebookloginandlogoutPOM(String username,String password)
{
	try
	{
	Facbookloginpage FL = new Facbookloginpage(driver);
	FL.Enterusername(username);
	test.log(LogStatus.INFO, "Login username : " +username);
	FL.Enterpassword(password);
	test.log(LogStatus.INFO, "Login username : " +password);
	FL.ClickOnLogin();
	facebooklogoutpage FLO= new facebooklogoutpage(driver);
	
	String scrnshot1=takescreenshot();
	test.log(LogStatus.INFO, "Login done",test.addScreenCapture(scrnshot1));

	Assert.assertEquals(FLO.Validateloginusername(), "Sathish Ramakrishnan");
	FLO.ClickonProfile();
	String scrnshot2=takescreenshot();
	test.log(LogStatus.INFO, "Logout dropdown clicked",test.addScreenCapture(scrnshot2));
	FLO.ClickonLogout();
	String scrnshot=takescreenshot();
	test.log(LogStatus.PASS, "Login and logout sucessfull",test.addScreenCapture(scrnshot));

	}
	catch(Exception e)
	{
		String scrnshot=takescreenshot();
		test.log(LogStatus.FAIL, test.addScreenCapture(scrnshot),e);

	}
}


public String takescreenshot()
{
	Date date = new Date();
    //This method returns the time in millis
	long timeMilli = date.getTime();
	String date_v= String.valueOf(timeMilli);
	return screenshottaken(date_v);
}

@AfterSuite
public void teardown() 
{
	report.flush();
	driver.quit();	
}
public String screenshottaken(String filename)
{
	TakesScreenshot ts =(TakesScreenshot)driver;
	File sourcefile= ts.getScreenshotAs(OutputType.FILE);
	File Destinationfile= new File(System.getProperty("user.dir")+
			"//Screenshot//"+filename+".png");
	try {
		FileUtils.copyFile(sourcefile, Destinationfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return Destinationfile.toString();
}
public static void deleteFiles(File dirPath) {
    File filesList[] = dirPath.listFiles();
    for(File file : filesList) {
       if(file.isFile()) {
          file.delete();
       } else {
          deleteFiles(file);
       }
    }
 }

}
