package Practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartCompare {
@Test
public void compare() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
	driver.findElement(By.name("q")).sendKeys("samsung mobile"+Keys.ENTER);
	Thread.sleep(5000);
	List<WebElement> sgmobile = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy')]"));
	
//	for(WebElement mobile:sgmobile) {
//	String name = mobile.getText();
//	System.out.println(name);	
//}
	sgmobile.get(0).click();
	String win = driver.getWindowHandle();
	Set<String> window = driver.getWindowHandles();
    for(String w:window) {
		driver.switchTo().window(w);
     if(!(w.equals(win))) {
			driver.findElement(By.xpath("//button[contains(.,'ADD TO CART')]")).click();
			Thread.sleep(2000);
			
		}
     driver.switchTo().window(w);
	}	
   driver.findElement(By.name("q")).sendKeys("apple watch"+Keys.ENTER);
   Thread.sleep(5000);
   List<WebElement> iwatch = driver.findElements(By.xpath("//div[contains(text(),'APPLE Watch Series ')]"));
   iwatch.get(0).click();
	String wa = driver.getWindowHandle();
	Set<String> wat = driver.getWindowHandles();
    for(String watch:wat) {
		driver.switchTo().window(watch);
     if(!(watch.equals(wa))&& !(watch.equals(win)) ) {
			driver.findElement(By.xpath("//button[contains(.,'ADD TO CART')]")).click();
		}
	}	
}
}