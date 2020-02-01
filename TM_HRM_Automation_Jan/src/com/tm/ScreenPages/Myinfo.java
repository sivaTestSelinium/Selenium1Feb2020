package com.tm.ScreenPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Myinfo extends Weblibrary {

	//Username Field Webelement
	@FindBy(xpath = "//b[text()='My Info']")
	public static WebElement Btn_Myinfo;
	
	//Edit button Element
	@FindBy(xpath="//input[@value='Edit']")
	public static WebElement Edit;
	
	//Personal details Fields in first name
	@FindBy(xpath="//input[@title='First Name']")
	public static WebElement FirstName;
	
	//Personal details Fields in Middlename
	@FindBy(xpath="//input[@title='Middle Name']")
	public static WebElement middlename;
	
	//Personal details Fields in LastName
	@FindBy(xpath="//input[@title='Last Name']")
	public static WebElement lastname;
	
	//Personal details Fields in Otherid
	@FindBy(xpath="//input[@id='personal_txtOtherID']")
	public static WebElement OtherId;
	
	//Personal details Fields in personal_txtLicExpDate
		@FindBy(xpath="//input[@id='personal_txtLicExpDate']")
		public static WebElement LicExpDate ;
		
		//Personal details Fields in Gender
		@FindBy(xpath="//input[@id='personal_optGender_2']")
		public static WebElement Gender;
		
		//Personal details Fields in personal_cmbMarital
		@FindBy(xpath="//select[@id='personal_cmbMarital']/option[3]")
		public static WebElement Marital;
		
       //Personal details Fields in Save
		@FindBy(xpath="//input[@id='btnSave']")
		public static WebElement save;
		
		//profile details in  personal details
		@FindBy(xpath="//a[text()='Personal Details']")
		public static WebElement personal;
		
		//profile details in  contacts details
		@FindBy(xpath="//div[@class='head']/h1")
	     public static WebElement contacts;
			
		//profile details in  Dependent details
		 @FindBy(xpath="//a[text()='Dependents']")
  		public static WebElement Dependent;
				
		//profile details in  immidration details
		@FindBy(xpath="//a[text()='Immigration']")
		public static WebElement immidration;
				
		//profile details in  jobDetails d
	    @FindBy(xpath="//a[text()='Job']")
		public static WebElement jobDetails;
				
		//profile details in  salary details
		@FindBy(xpath="//a[text()='Salary']")
		public static WebElement salary;
				
		//profile details in  Report details
		@FindBy(xpath="//a[text()='Report-to']")
		public static WebElement Report;
				
		//profile details in  Qualifications details
		@FindBy(xpath="//a[text()='Qualifications']")
		public static WebElement Qualifications;

		//profile details in  Memberships details
		@FindBy(xpath="//a[text()='Memberships']")
		public static WebElement Memberships;
		
		//Attached in add button
		@FindBy(xpath="//input[@id='btnAddAttachment']")
		public static WebElement add;
		
		//uplode file
		@FindBy(xpath="//input[@id='ufile']")
		public static WebElement upplod;
		
		//add comment
		@FindBy(xpath="//textarea[@id='txtAttDesc']")
		public static WebElement commit;
		
		//uplode/save button
		@FindBy(xpath="//input[@id='btnSaveAttachment']")
		public static WebElement SaveAttachment;
				
		
//===============================================================>		
		
			
	public void VerifyMyinfo() {
		boolean status;	
	status=clickElement(Btn_Myinfo);
	logEvent(status, "My onfo button clicked sucessfully","not clicked");	
	}
	
	public void Editbutton(){
		boolean status;
		status=clickElement(Edit);
		logEvent(status, "Edit button clicked sucessfully", "not clicked");
		
	}
	public void VerifyPersonalDETAILS(){
		boolean status;
		status=isExist(FirstName);
		logEvent(status, "FirstName field displayed","FirstName field disabled ");
		
		status=isExist(middlename);
		logEvent(status, "Middlename field sucessfully", "Middlename is disabled");
	
		status=isExist(lastname);
		logEvent(status, "LastName field is sucessfully", "LastName is field disabled");
	

		status= isExist(OtherId);
		logEvent(status,"Otherid value is sucessfully", "SearchOtherid is disabled");

		status= isExist(LicExpDate);
		logEvent(status,"LicExpDate date is sucessfully", "LicExpDate is disabled");
	
		status= isExist(Marital);
		logEvent(status,"Gender rediobutton is Enabled", "Gender rediobutton is disabled");
	
		status= isExist(Gender);
		logEvent(status,"SearchMarital value is sucessfully", "SearchMarital is failed");
	
		status=isExist(save);
		logEvent(status,"save sucessfully", "failed");
	}
	/*public void Entervalues(String YearId, String licExpDate){
		boolean status;
		status=setText(FirstName, "siva");
		logEvent(status, "siva is entered", "empty field");
		
		status=setText(middlename, "krushna");
		logEvent(status, "krushna is entered", "empty field");
		
		status=setText(lastname, "y");
		logEvent(status, "y is entered", "empty field");
		
		status=setText(OtherId, YearId);
		logEvent(status, "OtherId is entered", "empty field");
		
		status=getLicExpStatus(LicExpDate,licExpDate );
		logEvent(status, "licexpdate is entered", "empty field");
		
		
		status=clickElement(Gender);
		logEvent(status, "Gender is enabled", "empty field");
		
		
		status=selectByText(Marital, "marriage");
		logEvent(status, "Marital field is entered", "Marital field");
		
		status=clickElement(save);
		logEvent(status, "save sucessfully", "does notfield");
		
		
	}*/
	
	public void Entervalues(String YearId){
		boolean status;
		status=setText(FirstName, "siva");
		logEvent(status, "siva is entered", "empty field");
		
		status=setText(middlename, "krushna");
		logEvent(status, "krushna is entered", "empty field");
		
		status=setText(lastname, "y");
		logEvent(status, "y is entered", "empty field");
		
		status=setText(OtherId, YearId);
		logEvent(status, "OtherId is entered", "empty field");
		
		status=getLicExpStatus(LicExpDate,"2021-05-11" );
		logEvent(status, "licexpdate is entered", "empty field");
		
		
		status=clickElement(Gender);
		logEvent(status, "Gender is enabled", "empty field");
		
		
		status=selectByText(Marital, "marriage");
		logEvent(status, "Marital field is entered", "Marital field");
		
		status=clickElement(save);
		logEvent(status, "save sucessfully", "does notfield");
		
		
	}
	
	public void EntervaluesWithExpDate(String YearId, String licExpDate,String firstname,String Middlename){
		boolean status;
		status=setText(FirstName, firstname);
		logEvent(status, "siva is entered", "empty field");
		
		status=setText(middlename, Middlename);
		logEvent(status, "krushna is entered", "empty field");
		
		status=setText(lastname, "y");
		logEvent(status, "y is entered", "empty field");
		
		status=setText(OtherId, YearId);
		logEvent(status, "OtherId is entered", "empty field");
		
		status=setText(LicExpDate,licExpDate);
		logEvent(status, "licexpdate is entered", "empty field");
		
		
		status=clickElement(Gender);
		logEvent(status, "Gender is enabled", "empty field");
		
		
		status=selectByText(Marital, "marriage");
		logEvent(status, "Marital field is entered", "Marital field");
		
		status=clickElement(save);
		logEvent(status, "save sucessfully", "does notfield");
		
		
	}
	
	public boolean getLicExpStatus(WebElement element, String value){
		boolean status;
		
		
		status=setText(element, value);
		logEvent(status, "licexpdate is entered", "empty field");
		
		return status;
		
	}
	
	
	public static void Profile(){
		boolean status;
		status=clickElement(personal);
		logEvent(status, "personal page displayed","personal page not displayed");
		
		status=clickElement(contacts);
		logEvent(status, "contacts page displayed","contacts page not displayed");
		
		status=clickElement(Dependent);
		logEvent(status, "Dependent page displayed","Dependent page not displayed");
		
		status=clickElement(immidration);
		logEvent(status, "immidration page displayed","immidration page not displayed");
		
		status=clickElement(jobDetails);
		logEvent(status, "jobDetails page displayed","jobDetails page not displayed");
		
		status=clickElement(salary);
		logEvent(status, "salary page displayed","salary page not displayed");
		
		status=clickElement(Report);
		logEvent(status, "Report page displayed","Report page not displayed");
		
		status=clickElement(Qualifications);
		logEvent(status, "Qualifications page displayed","Qualifications page not displayed");
		
		status=clickElement(Memberships);
		logEvent(status, "Memberships page displayed","Memberships page not displayed");
		
	}
	public static void addProfile() {
        boolean status;
        
        status=clickElement(add);
		
		status=clickElement(upplod);
		uploadFile("E:\\Text.xlsx");
		wait(20);
		
		status=selectByText(commit, "Mydetails");
		status=clickElement(SaveAttachment);
	
        }
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
		public static void uploadFile(String fileLocation) {
	        try {
	        	//Setting clipboard with file location
	            setClipboardData(fileLocation);
	            //native key strokes for CTRL, V and ENTER keys
	            Robot robot = new Robot();
		
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	        } catch (Exception exp) {
	        	exp.printStackTrace();
	        }
	    }
}
