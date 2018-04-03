package SeleniumMaven.eGov.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumMaven.eGov.Base.BasePage;
import SeleniumMaven.eGov.Constants.Constants;

public class ComplaintPage extends BasePage{
	
	@FindBy(xpath = Constants.Search_cType)
	public WebElement Search;
	
	@FindBy(xpath = Constants.Select_cType)
	public WebElement Select;
	
	public ComplaintPage (WebDriver driver) {
		super(driver);
	}
	
	public LoginPage Enter_cType(String key)
	{
		Search.sendKeys(key);
		Select.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
