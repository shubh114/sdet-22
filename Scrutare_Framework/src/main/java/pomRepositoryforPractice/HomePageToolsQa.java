package pomRepositoryforPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageToolsQa {
	WebDriver driver;
	public HomePageToolsQa(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="toolTipButton")
	private WebElement mouse;
	
	public WebElement getMouse() {
		return mouse;
	}
	@FindBy(xpath="//div[text()='You hovered over the Button']")
	private WebElement mosehover;
	
	@FindBy(id="toolTipTextField")
	private WebElement textbox;

	public WebElement getMosehover() {
		return mosehover;
	}

	public WebElement getTextbox() {
		return textbox;
	}
}
