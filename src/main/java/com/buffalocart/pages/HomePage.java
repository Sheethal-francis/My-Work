package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.DateUtility;
import com.buffalocart.utilities.PagesUtilities;

public class HomePage{

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	//sidebar is the home tab in home page//
	private final String _sidebar = "ul.sidebar-menu";
	@FindBy(css = _sidebar)
	private WebElement sidebar;
	private final String _usermanagemnet = "//span[text()='User Management']";
	@FindBy(xpath = _usermanagemnet)
	private WebElement usermanagement;
	private final String _homewelcome = "//section[@class='content-header']";
	@FindBy(xpath = _homewelcome)
	private WebElement homewelcome;
	private final String _DateInHome = "//strong[text()='01/20/2022']";
	@FindBy(xpath = _DateInHome)
	private WebElement DateInHome;
	private final String _calculator = "//button[@id='btnCalculator']";
	@FindBy(xpath = _calculator)
	private WebElement calculator;
	private final String _bellicon = "//a[@id='show_unread_notifications']";
	@FindBy(xpath = _bellicon)
	private WebElement bellicon;
	private final String _todaysprofit = "//i[@class='fa fa-money fa-lg']";
	@FindBy(xpath = _todaysprofit)
	private WebElement todaysprofit;
	private final String _touricon = "//button[@id='start_tour']";
	@FindBy(xpath = _touricon)
	private WebElement touricon;
	private final String _profitclose = "/button[@class='touricon']";
	@FindBy(xpath = _profitclose)
	private WebElement profitclose;
	private final String _users = "(//span[@class='title'])[2]";
	@FindBy(xpath = _users)
	private WebElement users;
	private final String _endtour = "//button[text()='End tour']";
	@FindBy(xpath = _endtour)
	private WebElement endtour;
	private final String _Signout = "//a[text()='Sign Out']";
	@FindBy(xpath = _Signout)
	private WebElement Signout;
	private final String _username = "//span[text()='Aju Mathew']";
	@FindBy(xpath = _username)
	private WebElement username;
	public final String _Contactstab = "//span[text()=\"Contacts\"]";
	@FindBy(xpath = _Contactstab)
	private WebElement Contactstab;

	/*** action methods **/

	public String verifyHomeWelcomUser() {
		 return PagesUtilities.getElementText(homewelcome);
		
	}

	public SidebarPage clickOnSidebar() {
		PagesUtilities.clickOnElement(sidebar);
		return new SidebarPage(driver);
	}

	public void selectUsersFromDropDown(String text) {
		PagesUtilities.selectDropdownbyText(usermanagement, text);
	}

	public String getDateDisaplayed() {
		return PagesUtilities.getElementText(DateInHome);
	}

	public void clickoncalculator() {
		PagesUtilities.clickOnElement(calculator);
	}

	public void clickonprofittoady() {
		PagesUtilities.clickOnElement(todaysprofit);
		PagesUtilities.clickOnElement(profitclose);
	}
	public void clickonapplicationtour() {
		PagesUtilities.clickOnElement(touricon);
		PagesUtilities.clickOnElement(endtour);
	}
	public void clickonusemanangement() {
		PagesUtilities.clickOnElement(usermanagement);
	}

	public void clickonUsers() {
		// TODO Auto-generated method stub
		PagesUtilities.clickOnElement(users);
	}
public String getcurrentdate() {
	return DateUtility.getCurrentDate();
}
public LoginPage clickOnSignOut() {
	PagesUtilities.clickOnElement(Signout);
	return new LoginPage(driver);
}

public void clickonusername() {
	// TODO Auto-generated method stub
	PagesUtilities.clickOnElement(username);
}
public void clickonContactsTab() {
	// TODO Auto-generated method stub
	PagesUtilities.clickOnElement(Contactstab);
}
}