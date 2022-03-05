package com.buffalocart.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;
import com.buffalocart.utilities.WaitUtility;
import com.buffalocart.utilities.WaitUtility.LocatorType;

public class RolesPage {
	WebDriver driver;

	public RolesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String _rolespagesearch = "//input[@class='form-control input-sm']";
	@FindBy(xpath = _rolespagesearch)
	private WebElement rolespagesearch;
	private final String _addroles = "//a[@class='btn btn-block btn-primary']";
	@FindBy(xpath = _addroles)
	private WebElement addroles;
	private final String _signout = "//a[@class='dropdown-toggle']";
	@FindBy(xpath = _signout)
	WebElement signout;

	private final String _signingout = "//a[text()='Sign Out']";
	@FindBy(xpath = _signingout)
	WebElement signingout;

	public void Clickonsearch(String value) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		PagesUtilities.clickOnElement(rolespagesearch);
		PagesUtilities.enterText(rolespagesearch, value);
	}

	public AddRolesPage ClickonAddroles() {
		PagesUtilities.clickOnElement(addroles);
		return new AddRolesPage(driver);
	}

	public LoginPage signoutfromrolespage() {

		PagesUtilities.moveToWebElement(signout, driver);
		WaitUtility.waitForElement(driver, _signingout, LocatorType.Xpath);
		PagesUtilities.moveToWebElement(signingout, driver);
		return new LoginPage(driver);
	}
}
