package com.tm.TestCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.Performances;
import com.tm.ScreenPages.Time;

public class TestCases_Time extends BaseClass{
	
    @Test        
public void Tc_101MyTimeSheet(){
	  //Step 1:-login page
    	
    	Login lp = PageFactory.initElements(driver, Login.class);
    	Home home = PageFactory.initElements(driver, Home.class);
    	Time T=  PageFactory.initElements(driver, Time.class);
    	String[] data = ReadRowData(CurrentTestCaseName);
    	
    	
    	//Step 1: Login as a team member
    	  lp.LoginHRM(data[0], data[1]);
    	
    	//Step 2:-click the Timesheet
    	home.MyTime();
	
	   //Step 3:-verify the Timesheet
	    Time.time();	
	    
	    //Step 4:- Table data in the Time sheet
	    //Time.Tabledata();
	    
	//Logout
	    lp.Logout();
}
   
  @Test
  public void Tc_102AttendanceRecords(){
	
	  //Login the application
		Login lp = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Performances per=PageFactory.initElements(driver, Performances.class);
		
        String[] data = ReadRowData(CurrentTestCaseName);
    	
    	
    	//Step 1: Login as a team member
    	  lp.LoginHRM(data[0], data[1]);
    	
  	//Step 2:-click the Timesheet
	      Home.MyTime();
	
	  //Step 3:- click on the my Recordes
	     Home.navMyTimeRecordes();
	     
	  //Step 4:-Display the AttendanceRecords table
	     Time.MyRecords();
	     
	  //Step 5:-logout
	     lp.Logout();
	      
	      
  }
    
    
    
    
}
