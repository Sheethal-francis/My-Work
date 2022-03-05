package com.buffalocart.test;

import java.util.List;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.SidebarPage;

public class SidebarTest extends Base {

	HomePage obhomepage;
	LoginPage objlogin;
	SidebarPage objsidebar;

	@Test(priority = 14, enabled = true)
	public void sidebarclick() throws InterruptedException {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		SidebarPage objsidebar = new SidebarPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		List<String> sidebarlist = objsidebar.getsidebaroptions();
		System.out.println("side bar menu is " + sidebarlist);
	}

}
