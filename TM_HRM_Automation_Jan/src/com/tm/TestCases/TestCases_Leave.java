package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.BaseClass;
import com.tm.ScreenPages.ApplyLeave;
import com.tm.ScreenPages.Home;
import com.tm.ScreenPages.Login;


public class TestCases_Leave extends BaseClass {

	@Test
	public void TC101_verifyLoginFunctionality() {
		
		String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		//Login lps = new Login();
		//Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);		

		lp.LoginHRM(data[0], data[1]);
		//lp.LoginHRM("user02", "TM1234");
		//hpg.Exist();
		
		lp.Logout();
	}
	
	//==============================================================================
	@Test
	public void TC102_ApplyLeave() {
		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		ApplyLeave applyleave = PageFactory.initElements(driver, ApplyLeave.class);
		String[] data = ReadRowData(CurrentTestCaseName);
				
		//Step 1: Login as a team member
		  login.LoginHRM(data[0], data[1]);
		
		//Step 2: Navigate Apply Leave page
		home.navApplyLeave();
		
		//Step 3: Enter leave list and click save
		
		home.myLeaveslist();

       //Step 3:-verify the fields and Enter values.
		ApplyLeave.MyLeaveslist(data[4],data[5]);
		
		//Step 4:-check the table Link
		ApplyLeave.mylink();

		
		//Step 6: Logout
		login.Logout();
		
	}
	 @Test
	  public void TC103_MyLeavesList(){
		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		ApplyLeave Lists=PageFactory.initElements(driver, ApplyLeave.class);
		String[] data = ReadRowData(CurrentTestCaseName);
		
		//Step 1: Login as a team member
		  login.LoginHRM(data[0], data[1]);
		
		
		//Step 2: Navigate Apply Leave page
		  home.navApplyLeave();
				
		  //Step 3: Enter leave list and click save
		  home.myLeaveslist();
		  
		  //Step4:-Reject the leaves
		  ApplyLeave.MyRejectedLeaves(data[4],data[5]);
          
		  //Step 5:- Reject the table list
		  ApplyLeave.RejectTableList();
		  
		//Step 6:-Logout
		  login.Logout();
		
		
		
	}
	 
	 @Test
	  public void TC104_MyLeavesList1(){
		
		Login login = PageFactory.initElements(driver, Login.class);
		Home home = PageFactory.initElements(driver, Home.class);
		ApplyLeave Lists=PageFactory.initElements(driver, ApplyLeave.class);
		String[] data = ReadRowData(CurrentTestCaseName);
		
		//Step 1: Login as a team member
		  login.LoginHRM(data[0], data[1]);
		
		
		//Step 2: Navigate Apply Leave page
		  home.navApplyLeave();
				
		  //Step 3: Enter leave list and click save
		  home.myLeaveslist();
		  
		  //Step4:-pending the leaves
		  ApplyLeave.MyPendingList(data[4],data[5]);
          
		  //Step 5:- panding the table list
		  ApplyLeave.Pending_List();
		  
		//Step 6:-Logout
		  login.Logout();
		
	
	
}
}