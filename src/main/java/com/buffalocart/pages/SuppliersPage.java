package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.buffalocart.utilities.PagesUtilities;

public class SuppliersPage {

	WebDriver driver;

	public SuppliersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String _contactstitle = "//section[@class='content-header']";
	@FindBy(xpath = _contactstitle)
	WebElement contactstitle;

	private final String _contactsshow = "//select[@name='contact_table_length']";
	@FindBy(xpath = _contactsshow)
	WebElement contactsshow;

	private final String _button = "//button[@class='btn btn-block btn-primary btn-modal']";
	@FindBy(xpath = _button)
	WebElement button;// 
	private final String _Supplieractionbutton = "((//button[@class='btn btn-info dropdown-toggle btn-xs'])[1])";
	@FindBy(xpath = _Supplieractionbutton)
	WebElement Supplieractionbutton;



	private final String _search = "//input[@type='search']";
	@FindBy(xpath = _search)
	WebElement search;

	public void verfifypagetitle(String TitleSuP) {
		String pageTitle = PagesUtilities.getPageTitle(driver);
		Assert.assertEquals(pageTitle, TitleSuP);
	}

	public void ViewsupplierActions(String value) throws InterruptedException {
		
		PagesUtilities.clickOnElement(Supplieractionbutton);
		PagesUtilities.selectDropdownbyText(Supplieractionbutton, value);

	}
	
	public AddSuppliersPage clickaddsupplier()
	{
		
		PagesUtilities.clickOnElement(button);
		return new AddSuppliersPage(driver);
	}
}