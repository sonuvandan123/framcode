package regression;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import resources.Base;

public class MobileTestCases extends Base
{
	public WebDriver driver;
	
	  @BeforeClass
	  public void initDriver() throws IOException 
	  {
		  System.out.println("Before class mobile");
		  driver=initializeDriver();
		  System.out.println(driver); 
	  }
	 
	
	@Test
	void testCaseOne() throws IOException
	{
		System.out.println("Live demo guru"+Thread.currentThread().getId());
		driver.get("http://live.demoguru99.com/");
		String title=driver.getTitle();
		Assert.assertEquals(title,"bcd");
	}
	@Test
	void googleM()
	{
		System.out.println("google m"+Thread.currentThread().getId());
		driver.get("https://www.google.com");
	}
	
		
}
