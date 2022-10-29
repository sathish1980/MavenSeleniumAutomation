package Common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserElement {
	
public void waitforelementtobeClickable(WebDriver driver,String attribute)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(attribute)));
	
}

public void waitforelementtobepresence(WebDriver driver,String attribute)
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(attribute)));
	
}

public void TextToEnter(WebElement Element,String actualText)
{
	if(Element.isDisplayed() && Element.isEnabled())
	{
		Element.clear();
		Element.sendKeys(actualText);
	}
}

public void ClickonButton(WebElement Element)
{
	if(Element.isDisplayed() && Element.isEnabled())
	{
		Element.click();
	}
}

}
