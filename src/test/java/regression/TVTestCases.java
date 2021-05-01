package regression;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class TVTestCases extends Base
{
	
	public WebDriver driver;
	
	@BeforeClass
	void initDriver() throws IOException
	{
		System.out.println("Before class TV");
		driver=initializeDriver();
	}
	/*
	 * @Test void testTv() throws IOException { //driver=initializeDriver();
	 * 
	 * System.out.println("TV test case"+driver);
	 * driver.get("http://live.demoguru99.com/index.php/tv.html"); String
	 * title=driver.getTitle(); System.out.println("Site title"+title); }
	 */
	 
	@Test
	void amazonLogin()
	{
		System.out.println("amazon "+Thread.currentThread().getId());
		driver.get("https://www.amazon.com");
	}
	@Test
	void flipKart()
	{
		System.out.println("Flipkart"+Thread.currentThread().getId());
		driver.get("https://www.flipkart.com");
		String title=driver.getTitle();
		Assert.assertEquals(title,"abc");
	}
	
	  @AfterSuite
	  @AfterClass
	  void closeDriver() 
	  {
	  System.out.println("After class driver close"); 
	  driver.quit(); 
	  }
	 
}
