package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BrowserType;
import base.Browsers;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObj.SearchPage;

public class SearchTest {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUpEnv()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	 
	}
	
	public static void getUrl()
	{
		driver.get("https://www.google.com/");
	}
	@Test
	public void search()
	{
		SearchPage page = new SearchPage(driver);
		page.getSearch();
	}
	@Test
	public void serachBTN()
	{
		SearchPage page = new SearchPage(driver);
        page.clickOnSearch();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
