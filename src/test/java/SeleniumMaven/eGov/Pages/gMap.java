package SeleniumMaven.eGov.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumMaven.eGov.Base.BasePage;
import SeleniumMaven.eGov.Constants.Constants;

public class gMap extends BasePage{
	
	@FindBy(xpath = Constants.Search_gMap)
	public WebElement S_Gmap;
	@FindBy(tagName = Constants.a)
	public List<WebElement> listings;
	
	public gMap(WebDriver driver) {
		super(driver);
	}
	
	public void Select_Loc(String loc) {
		
		boolean ele = isElementPresent(Constants.Search_gMap);
		if (ele)
		{
			S_Gmap.sendKeys(loc);
			List<WebElement> option = listings;
			for(WebElement b : option)
				b.click();
			}
			
		}
	}


