package testScript;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.IPathConstant;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_01CreateOrganisation {

	@Test
	public void createOrganisation() throws Throwable {
		FileUtility file=new FileUtility();
		String username = file.readDataFromPropertyFile("username");
		String password = file.readDataFromPropertyFile("password");
		String url=file.readDataFromPropertyFile("url");
		WebDriverUtility util=new WebDriverUtility();
//		FileInputStream file1=new FileInputStream(IPathConstant.EXCELPATH);
//		Workbook workbook = WorkbookFactory.create(file1);
//		double phone = workbook.getSheet("organisation").getRow(1).getCell(3).getNumericCellValue();
		ExcelUtility excel=new ExcelUtility();
		String orgname = excel.getExcelData("organisation", 1, 1);
		String website = excel.getExcelData("organisation", 1, 2);
		String phone = excel.getExcelData("organisation", 1, 3);
		String tickerSymbol = excel.getExcelData("organisation", 1, 4);
		String fax = excel.getExcelData("organisation", 1, 5);
		String otherPhone	 = excel.getExcelData("organisation", 1, 6);
		String employees = excel.getExcelData("organisation", 1, 7);
		String email = excel.getExcelData("organisation", 1, 8);
		String otherEmail = excel.getExcelData("organisation", 1, 9);
		String ownership = excel.getExcelData("organisation", 1, 10);
		String sICCode = excel.getExcelData("organisation", 1, 11);
		String annualRevenue = excel.getExcelData("organisation", 1, 12);
		String billingPOBox = excel.getExcelData("organisation", 1, 13);
		String shippingPOBox = excel.getExcelData("organisation", 1, 14);
		String billingCity = excel.getExcelData("organisation", 1, 15);
		String shippingCity = excel.getExcelData("organisation", 1, 16);
		String billingState = excel.getExcelData("organisation", 1, 17);
		String shippingState = excel.getExcelData("organisation", 1, 18);
		String billingPostalCode = excel.getExcelData("organisation", 1, 19);
		String shippingPostalCode = excel.getExcelData("organisation", 1, 20);
		String billingCountry = excel.getExcelData("organisation", 1, 21);
		String shippingCountry= excel.getExcelData("organisation", 1, 22);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to(url);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Organizations")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(orgname+JavaUtility.getRandomData());
		driver.findElement(By.name("website")).sendKeys(website);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[3]")).sendKeys(phone);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[4]")).sendKeys(tickerSymbol);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[5]")).sendKeys(fax);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[6]")).sendKeys(otherPhone);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[7]")).sendKeys(employees);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[8]")).sendKeys(email);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[9]")).sendKeys(otherEmail);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[10]")).sendKeys(ownership);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[11]")).sendKeys(sICCode);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[12]")).sendKeys(annualRevenue);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[13]")).sendKeys(billingPOBox);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[14]")).sendKeys(shippingPOBox);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[15]")).sendKeys(billingCity);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[16]")).sendKeys(shippingCity);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[17]")).sendKeys(billingState);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[18]")).sendKeys(shippingState);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[19]")).sendKeys(billingPostalCode);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[20]")).sendKeys(shippingPostalCode);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[21]")).sendKeys(billingCountry);
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[22]")).sendKeys(shippingCountry);
		WebElement list1 = driver.findElement(By.name("industry"));
		//Select s1=new Select(list1);
		//s1.selectByIndex(3);
		util.selectOption(list1, 3);
		WebElement list2 = driver.findElement(By.name("accounttype"));
		//Select s2=new Select(list2);
		//s2.selectByIndex(3);
		util.selectOption(list2, 2);
		driver.findElement(By.name("button")).click();
		Thread.sleep(6000);

		WebElement out = driver.findElement(By.xpath("(//td[@valign])[4]"));
		//Actions a=new Actions(driver);
		//a.moveToElement(out).perform();
		util.mouseOver(driver, out);
		driver.findElement(By.linkText("Sign Out")).click();    	}
}

