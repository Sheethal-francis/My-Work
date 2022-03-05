package com.buffalocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.buffalocart.utilities.PagesUtilities;

public class AddRolesPage {
	WebDriver driver;

	public AddRolesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private final String _rolename = "//input[@class='form-control']";
	@FindBy(xpath = _rolename)
	WebElement rolename;

	private final String _selectcheckbox = "((//ins[@class='iCheck-helper'])[2])";
	@FindBy(xpath = _selectcheckbox)
	WebElement selectcheckbox;

	private final String _selectcheckbox1 = "(//input[@class='check_all input-icheck'])[1]";
	@FindBy(xpath = _selectcheckbox1)
	WebElement selectcheckbox1;

	private final String _submit = "//button[@class='btn btn-primary pull-right']";
	@FindBy(xpath = _submit)
	WebElement submit;
	

	public void addrolename(String e) {
		PagesUtilities.enterText(rolename, e);

	}

	public void is_active() {
		if (selectcheckbox.isEnabled()) {
			if (selectcheckbox.isSelected()) {
				System.out.println("Checkbox aldready selected");
			} else {

				System.out.println("Selected the chckbox user");
			}
			selectcheckbox.click();

		} else {
			System.out.println("check box not enabled" + selectcheckbox.isEnabled());
		}

	}

	public void is_active2() {
		if (selectcheckbox1.isEnabled()) {
			if (selectcheckbox1.isSelected()) {
				System.out.println("Checkbox aldready selected");
			} else {

				System.out.println("Selected the chckbox user");
			}
			selectcheckbox1.click();

		} else {
			System.out.println("check box not enabled" + selectcheckbox1.isEnabled());
		}
	}
	public RolesPage AddRolesSubmit()
	{
	PagesUtilities.clickOnElement(submit);
	return new RolesPage(driver);
	}
}
