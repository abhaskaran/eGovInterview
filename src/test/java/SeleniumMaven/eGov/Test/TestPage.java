package SeleniumMaven.eGov.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import SeleniumMaven.eGov.BaseTest.BaseTest;
import SeleniumMaven.eGov.Constants.Constants;
import SeleniumMaven.eGov.Pages.ComplaintPage;
import SeleniumMaven.eGov.Pages.LoginPage;
import SeleniumMaven.eGov.Pages.gMap;

public class TestPage extends BaseTest{

	@Test
	public void test() {
		
		LaunchApp(Constants.Browser, Constants.URL);
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		//Assert.assertTrue(Constants.PageName.equals("Add Complaint"), "LaunchApp was successful");
		ComplaintPage cPage = lp.AddCompType();
		//Assert.assertTrue(Constants.PageName_ComplaintType.equals("Complaint Type"),"Successfully navigated to Complaint Page");
		lp= cPage.Enter_cType(Constants.keyword);
		//Assert.assertTrue(Constants.PageName.equals("Add Complaint"), "Add complaint was successful");
		gMap gp = lp.AddLandmark();
		gp.Select_Loc(Constants.location);
		
	}
}
