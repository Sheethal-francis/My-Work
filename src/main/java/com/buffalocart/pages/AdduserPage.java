package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;

public class AdduserPage {
	WebDriver driver;
	public AdduserPage(WebDriver driver)
	{
		this.driver = driver;  
		PageFactory.initElements(driver, this);
	}

	private final String _prefix= "//input[@name='surname']";
	@FindBy(xpath=_prefix)
	WebElement prefix;

	private final String _firstname= "first_name";
	@FindBy(id=_firstname)
	WebElement firstname;

	private final String _lastname= "last_name";
	@FindBy(id=_lastname)
	WebElement lastname;

	private final String _email= "email";
	@FindBy(id=_email)
	WebElement email;

	private final String _role= "//select[@id='role']";
	@FindBy(xpath=_role)
	WebElement role;

	private final String _uusername= "//input[@name='username']";
	@FindBy(xpath=_uusername)
	WebElement uusername;


	private final String _password= "//input[@name='password']";
	@FindBy(xpath=_password)
	WebElement password;

	private final String _confirmpassword= "//input[@name='confirm_password']";
	@FindBy(xpath=_confirmpassword)
	WebElement confirmpassword;

	private final String _salescommissionpercentage= "cmmsn_percent";
	@FindBy(id=_salescommissionpercentage)
	WebElement salescommissionpercentage;


	private final String asc= "(//ins[@class='iCheck-helper'])[1]";
	@FindBy(xpath=asc)
	WebElement allow;

	private final String _isactive= "(//ins[@class='iCheck-helper'])[2]";
	@FindBy(xpath=_isactive)
	WebElement isactive;


	private final String _save= "submit_user_button";
	@FindBy(id=_save)
	WebElement save;

	private final String _signout= "//a[@class='dropdown-toggle']";
	@FindBy(xpath=_signout)
	WebElement signout;

	private final String _signingout= "//a[text()='Sign Out']";
	@FindBy(xpath=_signingout)
	WebElement signingout;

	
	public void EnterPrefix(String p)

	{
		prefix.sendKeys(p);
	}
	public void EnterName(String f)

	{
		firstname.sendKeys(f);
	}

	public void EnterNewLastNmae(String l)

	{
		lastname.sendKeys(l);
	}
	public void EnterNewEmailField(String e)

	{
		email.sendKeys(e);
	}
	public void EnterRolesInNewUser(String roles)

	{
		PagesUtilities.selectDropdownbyText(role, roles) ;
	}

	public void EnterNewPassword(String pas)

	{
		password.sendKeys(pas);
	}
	public void EnterConfirmPassord(String copas)

	{
		confirmpassword.sendKeys(copas);
	}
	public void sales_percentage(String s)

	{
		salescommissionpercentage.sendKeys(s);
	}	
	public void allowselected_contacts()
	{
		if(allow.isEnabled())
		{
	    
			System.out.println("Enabled");
			allow.click();
		}
		else
		{
			System.out.println(allow.isSelected());
		}
	}
	public void is_active()
	{
		if(isactive.isSelected())
		{
	    isactive.click();
		}
		else
		{
			System.out.println("NOT CLICKABLE");
		}
	}
	public void clicktosave()
	{
		save.click();
		
	}

	     

}