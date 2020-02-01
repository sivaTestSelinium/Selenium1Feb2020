package com.tm.ScreenPages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import com.tm.Libraries.Weblibrary;

public class ApplyLeave extends Weblibrary{
	//Leave Type field
	@FindBy(xpath = "//select[@id='applyleave_txtLeaveType']")
	public static WebElement dd_LeaveType;
	
	//from date field
	@FindBy(xpath = "//input[@id='applyleave_txtFromDate']")
	public static WebElement edit_fromDate;
	
	//To date field
	@FindBy(xpath = "//input[@id='applyleave_txtToDate']")
	public static WebElement edit_toDate;
	
	//Apply button field
	@FindBy(xpath = "//input[@id='applyBtn']")
	public static WebElement btn_Apply;
	 
	 //Leaves list from date field
     @FindBy(xpath="//input[@id='calFromDate']")
     public static WebElement fromdate;
     
     //Leaves list To date field
     @FindBy(xpath="//input[@id='calToDate']")
     public static WebElement Todate;
     
     //Show Leave with Status as All 
     @FindBy(xpath="//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
     public static WebElement All;
     
     //Search button
     @FindBy(xpath="//input[@id='btnSearch']")
     public static WebElement search;
     
     //Leaaves list Table Result
     @FindBy(xpath="//table[@id='resultTable']/tbody/tr[1]/td[6]/a")
     public static WebElement tbl;		 
     
   //Leaves list Table Result
     @FindBy(xpath="//table[@id='resultTable']/tbody/tr/td")
     public static List<WebElement> tbls;
     
   //Leaves Rejected Field 
     @FindBy(xpath="//input[@id='leaveList_chkSearchFilter_-1']")
     public static WebElement Reject;
    
    // Rejected tablelist
     @FindBy(xpath="//table[@id='resultTable']/tbody/tr/td")
     public static List<WebElement>Rej;
     
     //Leaves in Pending fields
     @FindBy(xpath="//input[@id='leaveList_chkSearchFilter_1']")
     public static WebElement pending;
     
     //Pending TableList
     @FindBy(xpath="//table[@id='resultTable']/tbody/tr/td")
     public static List<WebElement>pen;   
	//==============================================
	
	public static void ApplyLeave(){
		boolean status;
		
		status = selectByText(dd_LeaveType, "Annual Leave");
		logEvent(status, "Leave type selected", "Leave type not selected");
		
		status = setTextandEscape(edit_fromDate, "2019-10-26");
		logEvent(status, "From date entered", "From date not entered");
		
		status = setTextandEscape(edit_toDate, "2019-10-26");
		logEvent(status, "To date entered", "To date not entered");
		
		status = clickElement(btn_Apply);
		logEvent(status, "Apply button clicked", "Apply button not clicked");
		
		
		
	}
	
	public static void MyLeaveslist(String Fromdate,String todate ){
		boolean status;
		status=setTextandEscape(fromdate, Fromdate);
		logEvent(status, "From date entered", "From date not entered");
		
		status=setTextandEscape(Todate,todate);
	    logEvent(status, "To date entered", "To date not entered");
		
		/*status=clickElement(All);
		logEvent(status, "All check box clicked","All check box not clicked");
		*/
		status=clickElement(search);
		logEvent(status, "search button clicked", "Search button not clicked");
		
		//status=isExist(Tableresult);
	//	logEvent(status, "isdisplayed", "");
		
		String[] array={"Date","Employee Name","Leave Type","Leave Balance (Days)","Number of Days","Status","Comments","Actions"};
		  for(int i=1;i<=array.length;i++){
		String s=driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th["+ i +"]/span")).getText();
		if(array[i-1].equals(s)){
			logEvent(status, "header is match", "header not match");
			Reporter.log("pass");
		}else{
			Assert.assertFalse("Header is not matched",array[i-1].equals(s));
			Reporter.log("fail");
		}
		  }	
	}
	
	 public static void mylink(){
		boolean status;	

	  for(int i=1;i<=tbls.size();i++)
	  {
			String LeaveBlance=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+ i +"]/td[4]")).getText();
			if(LeaveBlance.equals("5.00"))
			{
				driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+ i +"]/td[2]/a")).click();
				Reporter.log("pass");			
			}
			else
			{
				Assert.assertFalse("Header is not matched",LeaveBlance.equals("5.00"));
				Reporter.log("fail");
			}
	  }
	 }
	  
           public static void MyRejectedLeaves(String Fromdate,String todate){
				boolean status;
				
				status=setTextandEscape(fromdate, Fromdate);
				logEvent(status, "From date entered", "From date not entered");
				
				status=setTextandEscape(Todate,todate);
				logEvent(status, "To date entered", "To date not entered");
				
				status=clickElement(Reject);
				
				status=clickElement(search);
				logEvent(status, "search button clicked", "Search button not clicked");
						
				String[] array={"Date","Employee Name","Leave Type","Leave Balance (Days)","Number of Days","Status","Comments","Actions"};
				  for(int i=1;i<=array.length;i++){
				String s=driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th["+ i +"]/span")).getText();
				    if(array[i-1].equals(s)){
					Reporter.log("table is displayed");		
				}else{
					Assert.assertFalse("Header is not matched",array[i-1].equals(s));
					Reporter.log("fail");
				}
							
				  }	  }
			public static void RejectTableList(){
				boolean status;
	           	for(int i=1;i<=Rej.size();i++){
	           	String s2=	driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+ i +"] /td")).getText();
	           		if(s2.equals("NoRecordsFound")){
	           			Assert.assertTrue("reject list displayed",s2.equals("NoRecordsFound"));
	           			Reporter.log("pass");
	           		}
	           			else{
	           				Assert.assertFalse("Header is not matched",s2.equals("NoRecordsFound"));
	    					Reporter.log("fail");
	           				
	           			}
	           		}
	}
			
			public static void MyPendingList(String Fromdate,String todate){
				boolean status;
				status=setTextandEscape(fromdate, Fromdate);
				logEvent(status, "From date entered", "From date not entered");
				
				status=setTextandEscape(Todate,todate);
				logEvent(status, "To date entered", "To date not entered");
				
				status=clickElement(pending);
				
				status=clickElement(search);
				logEvent(status, "search button clicked", "Search button not clicked");
						
				String[] array={"Date","Employee Name","Leave Type","Leave Balance (Days)","Number of Days","Status","Comments","Actions"};
				  for(int i=1;i<=array.length;i++){
				String s=driver.findElement(By.xpath("//table[@id='resultTable']/thead/tr/th["+ i +"]/span")).getText();
				    if(array[i-1].equals(s)){
					Reporter.log("header matched");		
				}else{
					Assert.assertFalse("Header is not matched",array[i-1].equals(s));
					Reporter.log("fail");
				}
							
				  }	  
			}
			public static void Pending_List(){
				boolean status;
	           	for(int i=1;i<=pen.size();i++){
	           	String s2=	driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/following-sibling::tr["+i+"]/td[6]")).getText();
	           		if(s2.equals("Pending Approval(1.00)"))
	           		{
	           		status=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/following-sibling::tr/td[8]")).isSelected();
	           	    Assert.assertTrue(" cancel is displayed",s2.equals("NoRecordsFound"));
	           			Reporter.log("pass");
	           		}
	           	else{
	           	Assert.assertFalse("Cancel is not display",s2.equals("NoRecordsFound"));
	    		Reporter.log("fail");
	           				
	           			
				  
				  
				  
				  
	
}
 
	
	
	
	
	
	           	}
	           	
			}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//==============================================
	
}







