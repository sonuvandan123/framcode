package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	By mobileButtonInHomePage =By.xpath("//a[contains(text(),'Mobile')]");
	
	public WebElement mobileButtonInHomePage()
	{
		return driver.findElement(mobileButtonInHomePage); 
	}
	
}
