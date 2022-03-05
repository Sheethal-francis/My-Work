package com.buffalocart.test;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.AddSuppliersPage;
import com.buffalocart.pages.ContactsPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.SuppliersPage;

public class SuppliersTest extends Base {
	HomePage obhomepage;
	LoginPage objlogin;
	SuppliersPage objsuppliers;
	AddSuppliersPage objAddsupplier;
	@Test(priority = 29, enabled = false)
	public void SupplierPageTitle(){
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
		objsuppliers.verfifypagetitle("Suppliers - Llolll");
	}
	
	
	@Test(priority = 30, enabled = true)
	public void viewSuppliersActions() throws InterruptedException{
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		ContactsPage objcontacts=new ContactsPage(driver);
		SuppliersPage objsuppliers=new SuppliersPage(driver);
		AddSuppliersPage objAddsupplier= new AddSuppliersPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickonContactsTab();
		objcontacts.clickonsupplier();
		objsuppliers.verfifypagetitle("Suppliers - Llolll");
		objAddsupplier=objsuppliers.clickaddsupplier();
	}
	
	
	
}
