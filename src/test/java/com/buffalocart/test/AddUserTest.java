package com.buffalocart.test;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.AdduserPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.SidebarPage;
import com.buffalocart.pages.UserManagementPage;
import com.buffalocart.pages.UserPage;

public class AddUserTest extends Base {
	HomePage obhomepage;
	LoginPage objlogin;
	SidebarPage objsidebar;
	UserManagementPage objusermngt;
	UserPage objuser;
	AdduserPage objadd;
	@Test(priority=19,enabled=true)
	public void AdduserActions()
	{
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		UserPage objuser = new UserPage(driver);
		AdduserPage objadd=new AdduserPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objuser = objusermngt.clickonUsers();
		objadd=objuser.AddUserFunction();
		objadd.EnterPrefix("Miss");
		objadd.EnterName("Sruthi");
		objadd.	EnterNewLastNmae("Xavier");
		objadd.	EnterNewEmailField("sheethalfrancis3@gmail.com");
		objadd.EnterRolesInNewUser("SalesMan");
		objadd. EnterNewPassword("Sruthi@Xavier");
		objadd.	EnterConfirmPassord("Sruthi@Xavier");
		objadd.sales_percentage("40%");
		objadd.allowselected_contacts();
		objadd.is_active();
		objadd.clicktosave();
		
		
	}
	
	
}
