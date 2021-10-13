package com.crm.vtiger.comcast.pomrepositylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class ContactInformation extends WebDriverUtility {
	public ContactInformation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class=\"dvHeaderText\"]")
	private WebElement text;
	@FindBy(xpath = "//span[@class=\"small\"]")
	private WebElement text1;
	public WebElement getText() {
		return text;
	}
	public WebElement getText1() {
		return text1;
	}
	public String readText() {
		String s=text.getText();
		return s;
	}
	public String readText1() {
		return text1.getText();
	}

}
