package pageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver;
	
	@FindBy(css="#APjFqb")
	private WebElement search;
	@FindBy(xpath="(//input[contains(@value,'Google Search')] )[2]")
	private WebElement clickOnSearchBTN;
	
	public SearchPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void getSearch()
	{
		search.sendKeys("Dilip Kumar");
	}
	public void clickOnSearch()
	{
		clickOnSearchBTN.click();
	}
	

}
