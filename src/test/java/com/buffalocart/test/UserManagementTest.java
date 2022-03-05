package com.buffalocart.test;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.RolesPage;
import com.buffalocart.pages.SalesAgentPage;
import com.buffalocart.pages.SidebarPage;
import com.buffalocart.pages.UserManagementPage;
import com.buffalocart.pages.UserPage;

public class UserManagementTest extends Base {

	HomePage obhomepage;
	LoginPage objlogin;
	SidebarPage objsidebar;
	UserManagementPage objusermngt;
	UserPage objuser;
	SalesAgentPage objsales;

	@Test(priority = 15, enabled = true)
	public void UserManagementclickUser() {
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
		// objuser = objusermngt.clickonUsers();
		objuser = objusermngt.clickOnUsersSubMenu("Users");
	}

	@Test(priority = 20, enabled = false)
	public void UserManagementClickRoles() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		SidebarPage objsidebar = new SidebarPage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		UserPage objuser = new UserPage(driver);
		RolesPage objrole = new RolesPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objrole = objusermngt.clickonRoles("Roles");

	}

	@Test(priority = 24, enabled = true)
	public void UserManagementClickSales() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		SidebarPage objsidebar = new SidebarPage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		UserPage objuser = new UserPage(driver);
		SalesAgentPage objsales = new SalesAgentPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objsales = objusermngt.clickonSalesAgent("Sales Commission Agents");

	}
}