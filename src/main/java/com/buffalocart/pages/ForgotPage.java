package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;


public class ForgotPage {
	WebDriver driver;
	/***page constructor***/
	public ForgotPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	/***web elements***/
	private final String _resetemail="//input[@id='email']";
	@FindBy(xpath=_resetemail)
	private WebElement resetemail;
	private final String _resetpswdbutton="button[class='btn btn-primary']";
	@FindBy(css=_resetpswdbutton)
	private WebElement resetpswdbutton;
	private final String _errormessage="//span[@class='help-block']/strong";
	@FindBy(xpath=_errormessage)
	private WebElement errormessage;
	private final String _successmessage="//div[@class='alert alert-success']";
	@FindBy(xpath=_successmessage)
	private WebElement successmessage;
	
	
	
	/***web elements***/
	public void enterEmail(String emailaddress)
	{
		PagesUtilities.enterText(resetemail, emailaddress);
	}
	public void clickonpswdreset()
	{
		PagesUtilities.clickOnElement(resetpswdbutton);
	}
	public String invalidusermsg()
	{
		return PagesUtilities.getElementText(errormessage);
	}

	public String successmsg()
	{
		return PagesUtilities.getElementText(successmessage);
	}
}
