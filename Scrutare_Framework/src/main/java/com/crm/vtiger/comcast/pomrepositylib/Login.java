package com.crm.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="user_name")
	private WebElement userNameEdt;

	@FindBy(name="user_password")
	private WebElement userPasswordEdt;

	@FindBy(id="submitButton")
	private WebElement loginBtn;

	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getUserasswordEdt() {
		return userPasswordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void loginToApp(String url, String username, String password) {
		driver.get(url);
		userNameEdt.sendKeys(username);
		userPasswordEdt.sendKeys(password);
		loginBtn.click();

	}

}
