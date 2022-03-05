package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;
import com.buffalocart.utilities.WaitUtility;
import com.buffalocart.utilities.WaitUtility.LocatorType;

public class AddSalesAgPage {
	WebDriver driver;

	public AddSalesAgPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String _saleprefix = "//input[@name='surname']";
	@FindBy(xpath = _saleprefix)
	WebElement saleprefix;

	private final String _salefirstname = "first_name";
	@FindBy(id = _salefirstname)
	WebElement salefirstname;

	private final String _salelastname = "last_name";
	@FindBy(id = _salelastname)
	WebElement salelastname;

	private final String _saleemail = "email";
	@FindBy(id = _saleemail)
	WebElement saleemail;

	private final String _salecontacts = "//input[@id='contact_no']";
	@FindBy(xpath = _salecontacts)
	WebElement salecontact;

	private final String _saleaddress = "//textarea[@id='address']";
	@FindBy(xpath = _saleaddress)
	WebElement saleaddress;

	private final String _salescommissionpercentage = "cmmsn_percent";
	@FindBy(id = _salescommissionpercentage)
	WebElement salescommissionpercentage;

	private final String _salebutton = "//button[@type='submit']";
	@FindBy(xpath = _salebutton)
	WebElement salebutton;

	private final String _saleclose = "//button[@class='btn btn-default'][1]";
	@FindBy(xpath = _saleclose)
	WebElement saleclose;

	private final String _signout = "//a[@class='dropdown-toggle']";
	@FindBy(xpath = _signout)
	WebElement signout;

	private final String _signingout = "//a[text()='Sign Out']";
	@FindBy(xpath = _signingout)
	WebElement signingout;

	public void enterprefix(String p)

	{
		saleprefix.sendKeys(p);
	}

	public void enterfirstname(String e) {
		salefirstname.sendKeys(e);
	}

	public void enterlastname(String f) {
		salelastname.sendKeys(f);
	}

	public void enteremail(String e)

	{
		saleemail.sendKeys(e);
	}

	public void entercontact(String a) {
		salecontact.sendKeys(a);
	}

	public void enteraddress(String c) {
		saleaddress.sendKeys(c);
	}

	public void entersalespercentage(String s) {
		salescommissionpercentage.sendKeys(s);
	}

	public void clicktosave() {
		salebutton.click();

	}

	public void clickclose() {
		saleclose.click();
	}

	public void signout() {
		WaitUtility.waitForElement(driver, _signout, LocatorType.Xpath);
		PagesUtilities.clickOnElement(signout);
		WaitUtility.waitForElement(driver, _signingout, LocatorType.Xpath);
		PagesUtilities.clickOnElement(signingout);
	}
}
