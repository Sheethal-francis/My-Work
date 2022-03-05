package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;
import com.buffalocart.utilities.WaitUtility;

public class AddSuppliersPage {
	WebDriver driver;

	public AddSuppliersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String _slectsuppliers = "//select[@id='contact_type']";
	@FindBy(xpath = _slectsuppliers)
	WebElement slectsuppliers;

	private final String _selectname = "name";
	@FindBy(id = _selectname)
	WebElement selectname;

	private final String _businessname = "supplier_business_name";
	@FindBy(id = _businessname)
	WebElement businessname;

	private final String _contactid = "//input[@name='contact_id']";
	@FindBy(xpath = _contactid)
	WebElement contactid;

	private final String _taxnumber = "//input[@name='tax_number']";
	@FindBy(xpath = _taxnumber)
	WebElement taxnumber;

	private final String _openingbal = "//input[@name='opening_balance']";
	@FindBy(xpath = _openingbal)
	WebElement openingbal;

	private final String _payterm = "//input[@name='pay_term_number']";
	@FindBy(xpath = _payterm)
	WebElement payterm;

	/*
	 * private final String _monthopt="//select[@name='pay_term_type']";
	 * 
	 * @FindBy(xpath=_monthopt) WebElement monthopt;
	 */

	private final String _email = "//input[@id='email']";
	@FindBy(xpath = _email)
	WebElement email;

	private final String _mobile = "//input[@id='mobile']";
	@FindBy(xpath = _mobile)
	WebElement mobile;

	private final String _alternate = "//input[@name='alternate_number']";
	@FindBy(xpath = _alternate)
	WebElement alternate;

	private final String _landline = "//input[@id='landline']";
	@FindBy(xpath = _landline)
	WebElement landline;

	private final String _city = "//input[@id='city']";
	@FindBy(xpath = _city)
	WebElement city;

	private final String _state = "//input[@id='state']";
	@FindBy(xpath = _state)
	WebElement state;

	private final String _country = "//input[@id='country']";
	@FindBy(xpath = _country)
	WebElement country;

	private final String _landmark = "//input[@id='landmark']";
	@FindBy(xpath = _landmark)
	WebElement landmark;

	private final String _custmrfld1 = "//input[@id='custom_field1']";
	@FindBy(xpath = _custmrfld1)
	WebElement custmrfld1;

	private final String _custmrfld2 = "//input[@id='custom_field2']";
	@FindBy(xpath = _custmrfld2)
	WebElement custmrfld2;

	private final String _custmrfld3 = "//input[@id='custom_field3']";
	@FindBy(xpath = _custmrfld3)
	WebElement custmrfld3;

	private final String _custmrfld4 = "//input[@id='custom_field4']";
	@FindBy(xpath = _custmrfld4)
	WebElement custmrfld4;

	private final String _button = "//button[@type='submit']";
	@FindBy(xpath = _button)
	WebElement button;

	private final String _close = "//button[@class='btn btn-default'][1]";
	@FindBy(xpath = _close)
	WebElement close;

	private final String _signout = "//a[@class='dropdown-toggle']";
	@FindBy(xpath = _signout)
	WebElement signout;

	private final String _signingout = "//a[text()='Sign Out']";
	@FindBy(xpath = _signingout)
	WebElement signingout;

	public void entersuppliers(String a) {
		WaitUtility.waitForElementToBeClickable(driver, slectsuppliers);
		PagesUtilities.clickOnElement(slectsuppliers);
		PagesUtilities.selectDropdownbyText(slectsuppliers, a);

	}

	public void enterselectname(String a) {

		PagesUtilities.enterText(selectname, a);
	}

	public void enterbusinessname(String s) {
		WaitUtility.waitForElementToBeClickable(driver, businessname);
		PagesUtilities.enterText(businessname, s);
	}

	public void entercontactid(String d) {

		PagesUtilities.enterText(contactid, d);
	}

	public void entertaxnumber(String f) {
		taxnumber.sendKeys(f);
		PagesUtilities.enterText(taxnumber, f);
	}

	public void enteropeningbal(String g) {

		PagesUtilities.enterText(openingbal, g);
	}

	public void enterpayterm(String j) {

		PagesUtilities.enterText(payterm, j);
	}

	public void enteremail(String r) {

		PagesUtilities.enterText(email, r);
	}

	public void entermobile(String k) {

		PagesUtilities.enterText(mobile, k);
	}

	public void enteralternate(String b) {

		PagesUtilities.enterText(alternate, b);
	}

	public void enterlandline(String p) {

		PagesUtilities.enterText(landline, p);
	}

	public void entercity(String o) {

		PagesUtilities.enterText(city, o);
	}

	public void enterstate(String r) {

		PagesUtilities.enterText(state, r);
	}

	public void entercountry(String t) {

		PagesUtilities.enterText(country, t);
	}

	public void enterlandmark(String e) {

		PagesUtilities.enterText(landmark, e);
	}

	public void entercustmrfld1(String y) {

		PagesUtilities.enterText(custmrfld1, y);
	}

	public void entercustmrfld2(String z) {

		PagesUtilities.enterText(custmrfld2, z);
	}

	public void entercustmrfld3(String x) {

		PagesUtilities.enterText(custmrfld3, x);
	}

	public void entercustmrfld4(String m) {

		PagesUtilities.enterText(custmrfld4, m);
	}

	public void clicktosave() {
		button.click();

	}

	public void clickclose() {
		close.click();
	}
}
