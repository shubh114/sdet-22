package com.crm.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Contacts")
	private WebElement contacts;
	@FindBy(xpath = "(//td[@valign])[4]")
	private WebElement administrator;
	@FindBy(linkText = "Sign Out")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	public WebElement getContacts() {
		return contacts;
	}
	public WebElement getAdministrator() {
		return administrator;
	}
	public void clickContacts() {
		contacts.click();
	}
	public void logOut() {
		mouseOver(driver, administrator);
		logout.click();
	}
}
