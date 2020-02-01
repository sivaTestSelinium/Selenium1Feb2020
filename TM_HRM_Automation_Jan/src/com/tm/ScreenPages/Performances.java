package com.tm.ScreenPages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.tm.Libraries.Weblibrary;

public class Performances extends Weblibrary{
	
	@FindBy(xpath="//input[@id='evaluatePerformanceReview360SearchForm_employeeName']")
	public static WebElement employee;
	
	@FindBy(xpath="//select[@id='evaluatePerformanceReview360SearchForm_jobTitleCode']")
	public static WebElement jobtitle;

	@FindBy(xpath="//select[@id='evaluatePerformanceReview360SearchForm_department']")
	public static WebElement department;
     
	@FindBy(xpath="//select[@id='evaluatePerformanceReview360SearchForm_status']")
	public static WebElement status;

	@FindBy(xpath="//input[@id='fromDate']")
	public static WebElement fromdate;

	@FindBy(xpath="//input[@id='toDate']")
	public static WebElement todate;

	@FindBy(xpath="//input[@id='searchBtn']")
	public static WebElement search;
//===================================================================>
	
	
	public void Performancereview(){
		boolean staus;
		
		staus=setText(employee, "siva");
		logEvent(staus,"employee name entered", "employee name not entered");
		 
		staus=selectByText(jobtitle, "All");
		logEvent(staus,"jobtitle is entered", "jobtitle not entered");
	 
		staus=selectByText(department, "All");
		logEvent(staus,"department is entered", "department not entered");
	
		staus=selectByText(status, "Activated");
		logEvent(staus,"status is entered", "status not entered");
	
		staus=setTextandEscape(fromdate, "2020-05-04");
		logEvent(staus,"fromdate is entered", "fromdate not entered");
	
		staus=setTextandEscape(todate,"2020-06-05");
		logEvent(staus,"todate is entered", "todate not entered");
	
		staus=clickElement(search);
		//logEvent(staus,"todate is entered", "todate not entered");
		
		
		
		String[] array={"Employee","Due Date","Review Period","Job Title","Department","Status","Evaluation Status"};
		  for(int i=1;i<=array.length;i++){
		String s=driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr["+ i +"]/th")).getText();
		if(array[i-1].equals(s)){
			Assert.assertTrue("Header is matched", array[i-1].equals(s));
		Reporter.log("header matched");
		}else{
			Assert.assertFalse("Header is not matched",array[i-1].equals(s));
			Reporter.log("fail");
		}
		  }	
	}
		
		
	}	
	
	
	
	

