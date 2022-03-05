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

public class AddRoleTest extends Base{
	HomePage obhomepage;
	LoginPage objlogin;
	SidebarPage objsidebar;
	UserManagementPage objusermngt;
	UserPage objuser;
	RolesPage objrole;
	AddRolesPage objaddrole;


	@Test(priority = 23, enabled = true)
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
		objaddrole.addrolename("delivery boy");
		objaddrole.is_active();
		objaddrole.is_active2();
		objaddrole.AddRolesSubmit();
	}
}
