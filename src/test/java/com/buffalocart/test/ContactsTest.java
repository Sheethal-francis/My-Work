package com.buffalocart.test;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.ContactsPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.SuppliersPage;

public class ContactsTest extends Base{
	HomePage obhomepage;
	LoginPage objlogin;
	SuppliersPage objsuppliers;
	@Test(priority = 28, enabled = true)
	public void UserManagementclickUser() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		ContactsPage objcontacts=new ContactsPage(driver);
		SuppliersPage objsuppliers=new SuppliersPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickonContactsTab();
		objcontacts.clickonsupplier();
	}
	
}
