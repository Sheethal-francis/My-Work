package com.buffalocart.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.HelperMethodUtility;
import com.buffalocart.utilities.PagesUtilities;

public class ContactsPage {
	WebDriver driver;

	public ContactsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public final String _Contactstab = "//span[text()='Contacts']";
	@FindBy(xpath = _Contactstab)
	private List<WebElement> Contactstab;

	public final String _supplierButton = "//a[text()=' Suppliers']";
	@FindBy(xpath = _supplierButton)
	private WebElement supplierButton;

	public SuppliersPage clickonsuppliers(String value) {
		HelperMethodUtility.SelectMenu(Contactstab, value);
		return new SuppliersPage(driver);
	}

	public void clickonsupplier() {
		PagesUtilities.clickOnElement(supplierButton);
	}

}
