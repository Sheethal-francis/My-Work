package com.buffalocart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.ForgotPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;

public class ForgotTest extends Base {
	LoginPage objlogin;
	HomePage obhomepage;
	ForgotPage objForgot;

	@Test(priority = 12, enabled = true)
	public void resetemail() {
		ForgotPage objForgot = new ForgotPage(driver);
		objlogin = new LoginPage(driver);
		objForgot = objlogin.clickonforgotlink();
		objForgot.enterEmail("sheethalfrancis3@gmail.com");
		objForgot.clickonpswdreset();
		String resetsuccessmsg = objForgot.successmsg();
		String expectedsuccessmsg = "We have e-mailed your password reset link!";
		Assert.assertEquals(resetsuccessmsg, expectedsuccessmsg, "error message is different");
		System.out.println("Test11");
	}

	@Test(priority = 13, enabled = true)
	public void resetemailidinvalid() {
		ForgotPage objForgot = new ForgotPage(driver);
		objlogin = new LoginPage(driver);
		objForgot = objlogin.clickonforgotlink();
		objForgot.enterEmail("kkkkkks3@gmail.com");
		objForgot.clickonpswdreset();
		String invalidemailid = objForgot.invalidusermsg();
		String expectederrormsg = "We can't find a user with that e-mail address.";
		Assert.assertEquals(invalidemailid, expectederrormsg, "error message is different");
		System.out.println("Test12");
	}
}
