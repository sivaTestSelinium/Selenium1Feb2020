package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.Performances;

public class TestCases_Perfomance extends BaseClass {
	
	
	@Test
	public void TC102_perfomance(){
		
	//Login the application
	Login lp = PageFactory.initElements(driver, Login.class);
	Home home = PageFactory.initElements(driver, Home.class);
	Performances per=PageFactory.initElements(driver, Performances.class);
	String[] data = ReadRowData(CurrentTestCaseName);
	
	
	//Step 1: Login as a team member
	  lp.LoginHRM(data[0], data[1]);
	
	  //Step 2:click on Performances tab
	  home.navPerformance();
	  
	  //Step 3:Performances reviews in table
        per.Performancereview();
        
       //Step 4:-logout
        lp.Logout();

}
}
