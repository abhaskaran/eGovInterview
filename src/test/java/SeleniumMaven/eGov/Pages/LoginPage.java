package SeleniumMaven.eGov.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import SeleniumMaven.eGov.Base.BasePage;
import SeleniumMaven.eGov.Constants.Constants;

public class LoginPage extends BasePage{
	
	@FindBy(xpath = Constants.Upload)
	public WebElement UploadPic;
	
	@FindBy(xpath = Constants.Comp_Type)
	public WebElement cType;	
	
	@FindBy(xpath = Constants.landmark)
	public WebElement lm;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public void UploadPicture(String path) {
		UploadPic.click();
		uploadFile(path);
	}
	
	//Add Complaint Type
	public ComplaintPage AddCompType() {
		cType.click();
		return PageFactory.initElements(driver, ComplaintPage.class);		
	}
	
	public gMap AddLandmark() {
		lm.click();
		return PageFactory.initElements(driver, gMap.class);
	}
}
