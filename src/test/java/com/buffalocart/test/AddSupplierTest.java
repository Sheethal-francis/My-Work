package com.buffalocart.test;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.AddSuppliersPage;
import com.buffalocart.pages.ContactsPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.SuppliersPage;

public class AddSupplierTest extends Base {
	HomePage obhomepage;
	LoginPage objlogin;
	SuppliersPage objsuppliers;

	@Test(priority = 31, enabled = true)
	public void viewSuppliersActions() throws InterruptedException {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		ContactsPage objcontacts = new ContactsPage(driver);
		SuppliersPage objsuppliers = new SuppliersPage(driver);
		AddSuppliersPage objAddsupplier = new AddSuppliersPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickonContactsTab();
		objcontacts.clickonsupplier();
		objAddsupplier = objsuppliers.clickaddsupplier();
		objAddsupplier.entersuppliers("Customers");
		objAddsupplier.enterselectname("Tom");
		objAddsupplier.enterbusinessname("CAR");
		objAddsupplier.entercontactid("456789");
		objAddsupplier.entertaxnumber("14782TV");
		objAddsupplier.enteropeningbal("789");
		objAddsupplier.enterpayterm("cash");
		objAddsupplier.enteremail("Tom123@gmail.com");
		objAddsupplier.entermobile("7898524");
		objAddsupplier.enteralternate("398521");
		objAddsupplier.enterlandline("78845000");
		objAddsupplier.entercity("Kannur");
		objAddsupplier.enterstate("kerala");
		objAddsupplier.entercountry("india");
		objAddsupplier.enterlandmark("MMM kkk");
		objAddsupplier.entercustmrfld1("Okay");
		objAddsupplier.entercustmrfld2("best");
		objAddsupplier.entercustmrfld3("bad");
		objAddsupplier.entercustmrfld4("good");
		objAddsupplier.clicktosave();
		objAddsupplier.clickclose();

	}
}