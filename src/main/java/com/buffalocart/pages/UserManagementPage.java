package com.buffalocart.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.HelperMethodUtility;
import com.buffalocart.utilities.PagesUtilities;

public class UserManagementPage {
	WebDriver driver;

	/*** PageConstructor ***/

	public UserManagementPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	/*** WebElements ***/

	private final String _userManagementSubmenu = "//li[@class='treeview  active']//i[contains(@class,'fa fa')]//following-sibling::span[@class='title']";
	@FindBy(xpath = _userManagementSubmenu)
	private List<WebElement> userManagementSubmenu;
	private final String _usermanagemnet = "//span[@class='title']";
	@FindBy(xpath = _usermanagemnet)
	private WebElement usermanagement;
	private final String _users = "( //span[@class='title'])[2]";
	@FindBy(xpath = _users)
	private WebElement users;
	public final String _entryvalue = "//select[@class='form-control input-sm']";
	@FindBy(xpath = _entryvalue)
	private WebElement entryvalue;
	


	/*** UserActionMethods ***/

	public UserPage clickOnUsersSubMenu(String option) {
	HelperMethodUtility.SelectMenu(userManagementSubmenu, option);
	return new UserPage(driver);
	}
	public UserPage clickonUsers() {
		// TODO Auto-generated method stub
		PagesUtilities.clickOnElement(users);
		return new UserPage(driver);
		
	}
	public void clickonentries() {
	// TODO Auto-generated method stub
	PagesUtilities.clickOnElement(entryvalue);
}
	public RolesPage clickonRoles(String option1) {
		HelperMethodUtility.SelectMenu(userManagementSubmenu, option1);
		return new RolesPage(driver);
	}
	public SalesAgentPage clickonSalesAgent(String option2) {
		HelperMethodUtility.SelectMenu(userManagementSubmenu, option2);
		return new SalesAgentPage(driver);
	}
	
}
