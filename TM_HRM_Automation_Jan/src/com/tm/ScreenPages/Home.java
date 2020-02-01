package com.tm.ScreenPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tm.Libraries.Weblibrary;

public class Home extends Weblibrary{
	
	//===========Elements section===================
	//Leave menu Field
	@FindBy(xpath = "//a[@id='menu_leave_viewLeaveModule']")
	public static WebElement link_Leave;
	
	@FindBy(xpath = "//a[@id='menu_leave_applyLeave']")
	public static WebElement link_ApplyLeave;
	
	@FindBy(xpath = "//a[@id='menu_leave_viewMyLeaveList']")
	public static WebElement link_MyLeave;
	
	 
	@FindBy(xpath = "//a[@id='menu_pim_viewMyDetails']")
	public static WebElement link_MyInfo;
	
	@FindBy(xpath="//a[@id='menu_leave_viewMyLeaveList']")
	public static WebElement LeavesList;
	
	@FindBy(xpath="//b[text()='Time']")
	public static WebElement time;
	
	@FindBy(xpath="//a[@id='menu_attendance_Attendance']")
	public static WebElement attendance;
	
	@FindBy(xpath="//a[@id='menu_attendance_viewMyAttendanceRecord']")
	public static WebElement Myrecord;
	
	@FindBy(xpath="//a[@id='menu__Performance']")
	public static WebElement Performance;
	
	@FindBy(xpath="//a[@id='menu_performance_ManageReviews']")
	public static WebElement Review;
	
	@FindBy(xpath="//a[@id='menu_performance_searchEvaluatePerformancReview']")
	public static WebElement reviewlist;
	
	
	//============Methods section==============
	public static void navApplyLeave(){
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
		wait(2);		
		status = clickElement(link_ApplyLeave);	
		logEvent(status, "Apply leave menu link clicked", "Apply leave menu link not clicked");
	}
	
	public static void navMyLeave(){
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "mouse hover to Leave menu is successful", "mouse hover to Leave menu is unsuccessful");
		wait(2);
		status = clickElement(link_MyLeave);	
		logEvent(status, "MyLeave menu link clicked", "MyLeave menu link not clicked");
	}
	
	public static void myLeaveslist(){
		boolean status;
		
		status=clickElement(LeavesList);
		logEvent(status, "My LeavesList Link clicked", "My LeavesList Link not clicked");
	}
	public static void MyTime(){
		boolean status;
		
		status=clickElement(time);
		logEvent(status, "Time text link is clicked","Time text link not clicked");
		
		}
	public static void navMyTimeRecordes(){
		boolean status;
		
		status=moveToElement(attendance);
		logEvent(status, "mouse over to attendance is sucessfull", "mouse over to attendance is not sucessfull");
	   
		wait(5);
	   status=clickElement(Myrecord);
	   logEvent(status, " Myrecord Link clicked", "Myrecord not clicked");
	
	
	}
	public static void navMyInfo(){			
		boolean status = clickElement(link_MyInfo);	
		logEvent(status, "MyInfo menu link clicked", "MyInfo menu link not clicked");
		
	}
	public static void navPerformance(){
		boolean status;
		status=moveToElement(Performance);
		logEvent(status, "Performance link is clicked", "Performance link is not clicked");
		
		wait(3);
		status=clickElement(Review);
		logEvent(status, "Review link is clicked", "Review link not clicked");
		
		wait(3);
		status=clickElement(reviewlist);
		logEvent(status, "mouse over to Performance and click reviewlist", "mouse over to Performance and click reviewlist fail");
		
		}
	
	
	
     
	//=====================================

}





