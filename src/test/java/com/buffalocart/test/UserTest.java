package com.buffalocart.test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.AdduserPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.SidebarPage;
import com.buffalocart.pages.UserManagementPage;
import com.buffalocart.pages.UserPage;

public class UserTest extends Base {
	HomePage obhomepage;
	LoginPage objlogin;
	SidebarPage objsidebar;
	UserManagementPage objusermngt;
	UserPage objuser;

	@Test(priority = 16, enabled = false)
	public void useractionsearch() throws AWTException {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		SidebarPage objsidebar = new SidebarPage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		UserPage objuser = new UserPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objuser = objusermngt.clickonUsers();
		objuser.clickonsearchbox("sruthi");

	}

	@Test(priority = 17, enabled = true)
	public void useractionsentries() throws AWTException {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		SidebarPage objsidebar = new SidebarPage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		UserPage objuser = new UserPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		objsidebar.clickOnUserManagement();
		objuser = objusermngt.clickonUsers();
		// objusermngt.clickonentries();
		objusermngt = objuser.SelectEntriesList();

	}

	@Test(priority = 18, enabled = false)
	public void AdduserButton() throws AWTException {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		SidebarPage objsidebar = new SidebarPage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		UserPage objuser = new UserPage(driver);
		AdduserPage objadd = new AdduserPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		// obhomepage.clickonusemanangement();
		objsidebar.clickOnUserManagement();
		objuser = objusermngt.clickonUsers();
		objadd = objuser.AddUserFunction();

	}

}
