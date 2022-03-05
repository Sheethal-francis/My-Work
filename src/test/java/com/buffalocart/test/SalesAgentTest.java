package com.buffalocart.test;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.AddSalesAgPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.SalesAgentPage;
import com.buffalocart.pages.SidebarPage;
import com.buffalocart.pages.UserManagementPage;

public class SalesAgentTest extends Base {
	HomePage obhomepage;
	LoginPage objlogin;
	SidebarPage objsidebar;
	UserManagementPage objusermngt;
	SalesAgentPage objsales;
	AddSalesAgPage objaddsales;

	@Test(priority = 25, enabled = false)
	public void clickAddSalesAgent() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		SidebarPage objsidebar = new SidebarPage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		SalesAgentPage objsales = new SalesAgentPage(driver);
		AddSalesAgPage objaddsales = new AddSalesAgPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objsales = objusermngt.clickonSalesAgent("Sales Commission Agents");
		objaddsales = objsales.clickadd();

	}

	@Test(priority = 27, enabled = false)
	public void DownloadEXcelFromAction() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		SalesAgentPage objsales = new SalesAgentPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objsales = objusermngt.clickonSalesAgent("Sales Commission Agents");
		objsales.salesactionmenu();
		objsales.downloadExcel();

	}

	@Test(priority = 28, enabled = false)
	public void DownloadpdfFromAction() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		SalesAgentPage objsales = new SalesAgentPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objsales = objusermngt.clickonSalesAgent("Sales Commission Agents");
		objsales.salesactionmenu();
		objsales.downloadpdf();

	}

	@Test(priority = 29, enabled = true)
	public void GoToNextPage() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		UserManagementPage objusermngt = new UserManagementPage(driver);
		SalesAgentPage objsales = new SalesAgentPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objsales = objusermngt.clickonSalesAgent("Sales Commission Agents");
	    objsales.nextpage();
}
}
