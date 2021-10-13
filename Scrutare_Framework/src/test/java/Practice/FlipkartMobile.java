package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobile {

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	driver.findElement(By.name("q")).sendKeys("samsung mobile"+Keys.ENTER);
	Thread.sleep(5000);
	List<WebElement> sgmobile = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy')]"));
	
	for(WebElement mobile:sgmobile) {
	String name = mobile.getText();
	System.out.println(name);
	
}
driver.close();
}
}
