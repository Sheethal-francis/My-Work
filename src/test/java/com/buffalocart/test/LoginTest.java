package com.buffalocart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.ForgotPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;

public class LoginTest extends Base {
	LoginPage objlogin;
	HomePage obhomepage;
	ForgotPage objForgot;

	@Test(priority = 5, enabled = false)
	public void verifypageTitle() {
		objlogin = new LoginPage(driver);
		String actualTitle = objlogin.getLoginPageTitle();
		String expectedTitle = "Login - Demo POS";
		Assert.assertEquals(actualTitle, expectedTitle, "wrong login page");
		System.out.println("test 5 ");
	}

	@Test(priority = 4, enabled = false)
	public void userLoginWithValidEmailandInvalidPassword() throws Exception {
		objlogin = new LoginPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("55555");
		objlogin.RememeberMeCheckBox();
		System.out.println("test 4 ");

	}

	@Test(priority = 3, enabled = false)
	public void userLoginWithInvalidEmailandInvalidPassword() throws Exception {
		objlogin = new LoginPage(driver);
		objlogin.EnterEmail("name");
		objlogin.EnterPassword("55555");
		objlogin.RememeberMeCheckBox();
		System.out.println("test 3 ");
	}

	@Test(priority = 2, enabled = true)
	public void userLoginWithInvalidEmailandValidPassword() throws Exception {
		objlogin = new LoginPage(driver);
		objlogin.EnterEmail("name");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		String wornglogin = objlogin.wronglogintext();
		String invakidloginmg = "These credentials do not match our records.";
		Assert.assertEquals(wornglogin, invakidloginmg, "wrong login page");
		System.out.println("test 2 ");
	}

	@Test(priority = 1, enabled = false)
	public void userLoginWithValidEmailandValidPassword() throws Exception {
		objlogin = new LoginPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		System.out.println("test 1 ");

	}

}
