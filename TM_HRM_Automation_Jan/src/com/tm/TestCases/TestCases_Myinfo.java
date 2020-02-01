package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;
import com.tm.ScreenPages.Myinfo;

public class TestCases_Myinfo extends BaseClass {
	
	@Test
	public void TC102_myInfo(){
		
	//Login the application
	Login lp = PageFactory.initElements(driver, Login.class);
	Home home = PageFactory.initElements(driver, Home.class);
	Myinfo Mif = PageFactory.initElements(driver, Myinfo.class);
	String[] data = ReadRowData(CurrentTestCaseName);
	
	//Step 1: Login as a team member
	  lp.LoginHRM(data[0], data[1]);
	
	//Step 2: Navigate to MyInfo
	Mif.VerifyMyinfo();
	
	//Step 3: Edit the MyInfo
      Mif.Editbutton();
   
	//Step 4:-verify personal detalis
      Mif.VerifyPersonalDETAILS();
   
   //Step 5:- Enter values in the fields
      Mif.EntervaluesWithExpDate(data[2],data[3],data[4],data[5]);
   
      lp.Logout();
    
	}


	@Test
	public void Tc103_Profile(){
	
		Login lp = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Myinfo Mif = PageFactory.initElements(driver, Myinfo.class);
		
		String[] data = ReadRowData(CurrentTestCaseName);
		
		//Step 1: Login as a team member
		  lp.LoginHRM(data[0], data[1]);
		
		//Step 2: Navigate to MyInfo
		Mif.VerifyMyinfo();
		
		//Step 3:-check the profile details
		Mif.Profile();
		
		//Step:- logout
		lp.Logout();
		
	
	}
	
	@Test
	public void Tc104_AddProfile(){
	
		Login lp = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		Myinfo Mif = PageFactory.initElements(driver, Myinfo.class);
		
		String[] data = ReadRowData(CurrentTestCaseName);
		
		//Step 1: Login as a team member
		  lp.LoginHRM(data[0], data[1]);
		
		//Step 2: Navigate to MyInfo
		Mif.VerifyMyinfo();
		
		//Step 3:-check the profile details
		Mif.addProfile();
		
		//Step:- logout
		
		
	
	}
	
	
}
