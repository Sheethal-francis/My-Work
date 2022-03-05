package com.buffalocart.test;

import org.testng.annotations.Test;

import com.buffalocart.automationcore.Base;
import com.buffalocart.pages.AddSalesAgPage;
import com.buffalocart.pages.HomePage;
import com.buffalocart.pages.LoginPage;
import com.buffalocart.pages.SalesAgentPage;
import com.buffalocart.pages.SidebarPage;
import com.buffalocart.pages.UserManagementPage;

public class AddSalesTest extends Base {
	HomePage obhomepage;
	LoginPage objlogin;
	SidebarPage objsidebar;
	UserManagementPage objusermngt;
	SalesAgentPage objsales;
	AddSalesAgPage objaddsales;

	@Test(priority = 26, enabled = true)
	public void FillAddSales() {
		objlogin = new LoginPage(driver);
		obhomepage = new HomePage(driver);
		
		UserManagementPage objusermngt = new UserManagementPage(driver);
		SalesAgentPage objsales=new SalesAgentPage(driver);
		AddSalesAgPage objaddsales=new AddSalesAgPage(driver);
		objlogin.EnterEmail("admin");
		objlogin.EnterPassword("123456");
		objlogin.RememeberMeCheckBox();
		objlogin.clickOnLoginButton();
		objlogin.clickOnEndTourButton();
		obhomepage.clickOnSidebar();
		obhomepage.clickonusemanangement();
		objsales=objusermngt.clickonSalesAgent("Sales Commission Agents");
		objaddsales=objsales.clickadd();
		objaddsales.enterprefix("miss");
		objaddsales.enterfirstname("Manju");
		objaddsales.enterlastname("sajan");
		objaddsales.enteremail("manjusajan1234@gmail.com");
		objaddsales.entercontact("25896347");
		objaddsales.enteraddress("priyankar kollam");
		objaddsales.entersalespercentage("30%");
		objaddsales.clicktosave();
		objaddsales.clickclose();
		objaddsales.signout();
	}
	
}
