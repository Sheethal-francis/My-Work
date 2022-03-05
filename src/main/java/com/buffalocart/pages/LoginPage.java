package com.buffalocart.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;
public class LoginPage {
	WebDriver driver;

	/**** page constructor ***/
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/**** web elements ***/
	private final String _loginemail = "username";
	@FindBy(id = _loginemail)
	private WebElement loginemail;
	private final String _loginpswd = "password";
	@FindBy(id = _loginpswd)
	private WebElement loginpswd;
	private final String _wrongloginmsg = "//strong[text()='These credentials do not match our records.']";
	@FindBy(xpath = _wrongloginmsg)
	private WebElement wrongloginmsg;
	private final String _loginbtn = "button[type='submit']";
	@FindBy(css = _loginbtn)
	private WebElement loginbtn;
	private final String _checkbox = "input[name='remember']";
	@FindBy(css = _checkbox)
	private WebElement checkbox;
	private final String _panelheading = "div[class='panel-heading']";
	@FindBy(css = _panelheading)
	private WebElement panelheading;
	private final String _endtour = "//button[text()='End tour']";
	@FindBy(xpath = _endtour)
	private WebElement endtour;
	private final String _forgotlink = "//a[@class='btn btn-link']";
	@FindBy(xpath = _forgotlink)
	private WebElement forgotlink;
    
	
	/**** login action methods ***/
	public String getLoginPageTitle() {
		return PagesUtilities.getPageTitle(driver);
	}

	public void EnterEmail(String emailid) {
		// TODO Auto-generated method stub
		PagesUtilities.enterText(loginemail, emailid);
	}

	public void EnterPassword(String password) {
		PagesUtilities.enterText(loginpswd, password);
	}

	public void RememeberMeCheckBox() {
		PagesUtilities.clickOnElement(checkbox);
	}

	public HomePage clickOnLoginButton() { // click on login and return home page
		PagesUtilities.clickOnElement(loginbtn);
		return new HomePage(driver);
	}

	public void clickOnEndTourButton() { // click on login and return home page
		PagesUtilities.clickOnElement(endtour);
	}
		
		public String wronglogintext()
		{
			return PagesUtilities.getElementText(wrongloginmsg);
		}

		
	public ForgotPage clickonforgotlink()
	{
	PagesUtilities.clickOnElement(forgotlink);
	return new ForgotPage(driver);
	}

	
	
}