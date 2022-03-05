package com.buffalocart.test;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.AddRolesPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.RolesPage;
import com.buffalocart.pages.SidebarPage;
import com.buffalocart.pages.UserManagementPage;
import com.buffalocart.pages.UserPage;

public class RolesTest extends Base {
	HomePage obhomepage;
	LoginPage objlogin;
	SidebarPage objsidebar;
	UserManagementPage objusermngt;
	UserPage objuser;
	RolesPage objrole;
	AddRolesPage objaddrole;

	@Test(priority = 21, enabled = true)
	public void RolesSearch() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		RolesPage objrole = new RolesPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objrole = objusermngt.clickonRoles("Roles");
		objrole.Clickonsearch("Admin");
		objlogin=objrole.signoutfromrolespage();
	}
	
	@Test(priority = 22, enabled = false)
	public void AddRoles() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		RolesPage objrole = new RolesPage(driver);
		AddRolesPage objaddrole=new AddRolesPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objrole = objusermngt.clickonRoles("Roles");
		objaddrole=objrole. ClickonAddroles();
	}
}
