package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base
{
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("D://Selenium Training//5pmweekday//codes//frameworkdev//src//main//java//resources//brow.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D://Selenium Training//5pmweekday//jarsanddrivers//geckodriver.exe");
		    driver=new FirefoxDriver();
		
		}
		else
		{
			System.out.println("Incorrect browser");
		}
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
	public  String takeTestFailureScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		System.out.println("Driver "+driver);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png"; 
		FileUtils.copyFile(file,new File(destination));
		return destination;
	}
	
}
