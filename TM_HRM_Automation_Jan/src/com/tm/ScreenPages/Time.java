package com.tm.ScreenPages;

import java.util.List;

import org.apache.log4j.pattern.LogEvent;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.thoughtworks.selenium.Wait;
import com.tm.Libraries.Weblibrary;

public class Time extends Weblibrary{

	@FindBy(xpath="//select[@id='startDates']")
	public static WebElement selectdate;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr/td")
	public static List<WebElement> table;	
	
	@FindBy(xpath="//input[@id='btnSubmit']")
	public static WebElement submit;
	
	@FindBy(xpath="//input[@id='attendance_date']")
	public static WebElement attendance_date;
	
	
	
	
	
	
//	==========================================================>
    public static void time(){
	boolean status;
	
	status=selectByText(selectdate, "2020-01-22 to 2020-01-28");
	logEvent(status, "from and To date is enabled","from and To date is disabled");
	
	String[] array={"Project Name","Activity Name","Wed 22","Thu 23","Fri 24","Sat 25","Sun 26","Mon 27","Tue 28","Total"};
	
	for(int i=1;i<=array.length;i++){
		String s=driver.findElement(By.xpath("//table[@class='table']/thead/tr[1]/th["+ i +"]")).getText().trim();
		if(array[i-1].equals(s)){
			Assert.assertTrue("table header is displayed",array[i-1].equals(s) );
			Reporter.log("pass");
			
		}
		else{
			Assert.assertFalse("table header is displayed",array[i-1].equals(s));
			Reporter.log("fail ");
		}
		
	}
   wait(2);
		
		for(int i=1;i<=table.size();i++){
           	String s2=	driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+ i +"]/td")).getText();
           		if(s2.equals("NoRecordsFound")){
           			Assert.assertTrue(" NoRecordsFound displayed",s2.equals("NoRecordsFound"));
           			Reporter.log("pass");
           		}
           			else{
           				Assert.assertFalse(" Time table data fail",s2.equals("NoRecordsFound"));
    					Reporter.log("fail");
           				
           			}
           		
           		status=clickElement(submit);
           		logEvent(status, "click submit button sucessfull","submit button failed");
           		
           		}
		String[] array1={"Action","Performed By","Date","Comment"};
		for(int i=1;i<array1.length;i++ ){
      String s=	driver.findElement(By.xpath("//table[@class='table']/following::table/thead/tr["+i+"]/th")).getText();
       if(array1[i-1].equals(s)){
    	   Assert.assertTrue("Performed on theTimesheet is displayed",array1[i-1].equals(s));
    	   Reporter.log("Time table list is sucessfull");
       }
       else{
   
    	   Assert.assertFalse("Performed on theTimesheet is displayed",array1[i-1].equals(s));
    	   Reporter.log("table data is failed");
       }
		 
		}
	}
    
    
   
	public static void MyRecords(){
	boolean status;
	
	status=setText(attendance_date, "2020-01-01");
	wait(2);
	
	String[] array1={"Punch In"," Punch In Note","Punch Out","Punch Out Note","Duration(Hours)"};
	for(int i=1;i<array1.length;i++ ){
   
		String s=	driver.findElement(By.xpath("//table[@class='table']/thead/tr["+ i +"]/th")).getText();
        if(array1[i-1].equals(s)){
	   
    	Assert.assertTrue("My Attendance Records is displayed",array1[i-1].equals(s));
	   Reporter.log("records is displayed sucessfully");
   }
   else{
	   
	   Assert.assertFalse("My Attendance Records is displayed",array1[i-1].equals(s));
	   Reporter.log("records is displayed failed");
   }
	
	}	
	

}
}