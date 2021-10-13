package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

import pomRepositoryforPractice.HomePageToolsQa;

public class ToolsQa {
@Test
public void print() throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/tool-tips");
	HomePageToolsQa h=new HomePageToolsQa(driver);
	WebDriverUtility web=new WebDriverUtility();
	web.mouseOver(driver, h.getMouse());
	Thread.sleep(4000);
	String text = h.getMosehover().getText();
	Thread.sleep(4000);
	h.getTextbox().sendKeys(text);
}
}
