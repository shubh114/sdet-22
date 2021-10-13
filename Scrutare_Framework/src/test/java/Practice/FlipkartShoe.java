package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartShoe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.name("q")).sendKeys("samsung mobile"+Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> sgmobile = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy')]"));
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'SAMSUNG Galaxy')]/../../div[2]/div[1]/div/div"));
		for(int i=1;i<sgmobile.size();i++) {
		String name = sgmobile.get(i).getText();
		String p = price.get(i).getText();
		System.out.println(name+" ------> "+p);
		
	}
	driver.close();
}
}
