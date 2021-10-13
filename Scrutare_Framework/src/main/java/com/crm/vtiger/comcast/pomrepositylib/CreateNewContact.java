package com.crm.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContact {
	public CreateNewContact(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "lastname")
	private WebElement lastname;

	@FindBy(name = "firstname")
	private WebElement firstname;

	@FindBy(name = "portal")
	private WebElement portal;

	@FindBy(name = "emailoptout")
	private WebElement emailoptout;

	@FindBy(name = "donotcall")
	private WebElement donotcall;

	@FindBy(name = "reference")
	private WebElement reference;

	@FindBy(name = "notify_owner")
	private WebElement notify_owner;

	@FindBy(name = "button")
	private WebElement save;

	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getPortal() {
		return portal;
	}
	public WebElement getEmailoptout() {
		return emailoptout;
	}
	public WebElement getDonotcall() {
		return donotcall;
	}
	public WebElement getReference() {
		return reference;
	}
	public WebElement getNotify_owner() {
		return notify_owner;
	}
	public WebElement getSave() {
		return save;
	}


	public void save() {
		save.click();
	}
	public void giveFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	public void giveLastName(String lname) {
		lastname.sendKeys(lname);
	}
}
