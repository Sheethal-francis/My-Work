package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;

public class SalesAgentPage {
	WebDriver driver;

	/*** PageConstructor ***/

	public SalesAgentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String _salestitle = "//section[@class='content-header']";
	@FindBy(xpath = _salestitle)
	WebElement salestitle;

	private final String _salesshow = "//select[@name='sales_commission_agent_table_length']";
	@FindBy(xpath = _salesshow)
	WebElement salesshow;

	private final String _salebutton = "//button[@class='btn btn-primary btn-modal pull-right']";
	@FindBy(xpath = _salebutton)
	WebElement salebutton;

	private final String _salesearch = "//input[@type='search']";
	@FindBy(xpath = _salesearch)
	WebElement salesearch;

	private final String _saleactions = "(//a[@class='btn buttons-collection btn-info'])";
	@FindBy(xpath = _saleactions)
	WebElement saleactions;
	private final String _DwnldExcel = "//li[@class='dt-button buttons-excel buttons-html5 bg-info']";
	@FindBy(xpath = _DwnldExcel)
	WebElement DwnldExcel;
	private final String _DwnldPdf = "//li[@class='dt-button buttons-pdf buttons-html5 bg-info']";
	@FindBy(xpath = _DwnldPdf)
	WebElement DwnldPdf;

	private final String _NxtButton = "((//a[@tabindex='0'])[5])";
	@FindBy(xpath = _NxtButton)
	WebElement NxtButton;
	private final String _signoutclick = "//a[@class='dropdown-toggle']";
	@FindBy(xpath = _signoutclick)
	WebElement signoutclick;

	private final String _signout = "//a[text()='Sign Out']";
	@FindBy(xpath = _signout)
	WebElement signout;

	public AddSalesAgPage clickadd() {

		PagesUtilities.clickOnElement(salebutton);
		return new AddSalesAgPage(driver);
	}

	public void salesactionmenu() {
		PagesUtilities.clickUsingJavaScriptExecutor(driver, saleactions);

	}

	public void sign_out() {
		PagesUtilities.clickOnElement(signoutclick);
		PagesUtilities.clickOnElement(signout);
	}

	public void downloadExcel() {
		PagesUtilities.clickUsingJavaScriptExecutor(driver, DwnldExcel);

	}

	public void downloadpdf() {
		PagesUtilities.clickUsingJavaScriptExecutor(driver, DwnldPdf);
	}

	public void nextpage() {
		PagesUtilities.scrollToFindElement(driver, NxtButton);
		PagesUtilities.clickOnElement(NxtButton);
	}
}
