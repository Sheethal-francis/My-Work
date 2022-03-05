package com.buffalocart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;

public class HomeTest extends Base {

	LoginPage objlogin;
	HomePage obhomepage;

	@Test(priority = 6, enabled = false)
	public void verifyHomeTitle() {
		obhomepage = new HomePage(driver);
		objlogin = new LoginPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		obhomepage = objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		String actualHomeTitle = obhomepage.verifyHomeWelcomUser();
		System.out.println(actualHomeTitle);
		String expectedHomeTitle = "Welcome Aju,";
		Assert.assertEquals(actualHomeTitle, expectedHomeTitle, "wrong login page");
		System.out.println("test 6");
	}

	@Test(priority = 9, enabled = false)
	public void ClicKOnUsers() {
		obhomepage = new HomePage(driver);
		objlogin = new LoginPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		obhomepage = objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickonusemanangement();
		obhomepage.clickonUsers();
		// obhomepage.selectUsersFromDropDown("Users");
	}

	@Test(priority = 7, enabled = false)
	public void verifyDateInHomePage() {
		obhomepage = new HomePage(driver);
		objlogin = new LoginPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		String HomepageDate = obhomepage.getDateDisaplayed();
		String CurrentDate = obhomepage.getcurrentdate();
		Assert.assertEquals(HomepageDate, CurrentDate, "wrong login page");
		System.out.println("Current date is " + HomepageDate);
	}

	@Test(priority = 8, enabled = false)
	public void sidebarclick() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		obhomepage = new HomePage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
	}

	@Test(priority = 10, enabled = false)
	public void ClicKOncalculator() {
		obhomepage = new HomePage(driver);
		objlogin = new LoginPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		obhomepage = objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickoncalculator();
		System.out.println("test 10");
	}
	@Test(priority = 11, enabled = false)
	public void signoutclick() throws InterruptedException {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickonusername();
		
		objlogin=obhomepage.clickOnSignOut();
	}
	@Test(priority = 8, enabled = true)
	public void SelectContacts() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		obhomepage = new HomePage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickonContactsTab();
	}
}
