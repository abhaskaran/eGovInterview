package SeleniumMaven.eGov.Constants;

public class Constants {
	
	//URL
	public static final String URL = "http://egov-micro-dev.egovernments.org/app/v3/citizen/add-complaint";
	public static final String Browser = "Chrome";
	public static final String keyword = "Garb";
	public static final String location = "eGov";
	
	//Locators
	public static final String Upload = "//*[@id='image-upload']";
	public static final String PageName = "//h1[text()='Add Complaint']";
	public static final String PageName_ComplaintType = "//h1[text()='Complaint Type']";	
	public static final String Search_cType = "//input[@id = 'complainttype-search']";
	public static final String Select_cType = "//*[@id='root']/main/div/div[2]/div[2]/div//span[@tabindex=0][1]";
	public static final String landmark = "//*[@id='addComplaint-location-details']";
	public static final String Search_gMap = "//input[@class='searchBoxStyle']";
	public static final String a = "//div[@class='pac-item']";
	public static final String Comp_Type = "//input[@id='addComplaint-complaint-type']";
	//public static final String Comp_Type = "//*[@id='root']/main/div/div[2]/div/div[2]/div/div/div/svg";
	
	//path
	public static final String Pic_Path = "C:\\Users\\ashwini\\Desktop\\Ashwini_documents";
	
	                                       
	
	
}
