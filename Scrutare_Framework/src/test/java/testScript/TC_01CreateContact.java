package testScript;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01CreateContact {
	@Test
	public void createContact() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("s kumar");
		driver.findElement(By.xpath("(//td[@class='dvtCellInfo'])[5]/img")).click();
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> w = wh.iterator();
		String parent = w.next();
		String child = w.next();
		driver.switchTo().window(child);
		driver.findElement(By.id("2")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.id("title")).sendKeys("dd");
		driver.findElement(By.name("fax")).sendKeys("456");
		driver.findElement(By.xpath("(//td[@class=\"dvtCellInfo\"])[14]/img")).click();

	}
}
