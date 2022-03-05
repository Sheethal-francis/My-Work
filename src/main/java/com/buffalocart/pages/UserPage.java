package com.buffalocart.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;
import com.buffalocart.utilities.RobotClassUtility;

public class UserPage {
	WebDriver driver;
	public final String _adduser = "btn btn-block btn-primary";
	@FindBy(xpath = _adduser)
	private WebElement adduser;
	public final String _searchbox = "//input[@type='search']";
	@FindBy(xpath = _searchbox)
	private WebElement searchbox;
	public final String _entryvalue = "//select[@class='form-control input-sm']";
	@FindBy(xpath = _entryvalue)
	private WebElement entryvalue;
	private final String _action = "(//i[@class='fa fa-list'])[9]";
	@FindBy(xpath = _action)
	WebElement action;
	private final String _AddUserButton = "//a[@class='btn btn-block btn-primary']";
	@FindBy(xpath = _AddUserButton)
	private WebElement AddUserButton;

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public UserPage userverifydduserbutton() {
		PagesUtilities.clickOnElement(adduser);
		return new UserPage(driver);
	}

	public void clickonsearchbox(String name) throws AWTException {
		PagesUtilities.clickOnElement(searchbox);
		PagesUtilities.enterText(searchbox, name);
		RobotClassUtility.PressEnter();
	}

	public UserManagementPage SelectEntriesList() {
		PagesUtilities.selectDropdownbyText(entryvalue, "50");
		return new UserManagementPage(driver);
	}

	public AdduserPage AddUserFunction() {
		PagesUtilities.clickOnElement(AddUserButton);

		return new AdduserPage(driver);
	}

}
