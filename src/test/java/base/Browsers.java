package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import base.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	
	//This is browser class
	
	public WebDriver driver;

	public void setUp_Browser(BrowserType browser) {

		switch (browser) {
		 case GoogleChrome: {
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			break;
		 }
		 
		case Firefox: {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		}
		case IE:{
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		}
		default: {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		}
	}

}
