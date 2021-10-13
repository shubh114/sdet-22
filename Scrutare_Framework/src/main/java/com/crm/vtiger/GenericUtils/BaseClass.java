package com.crm.vtiger.GenericUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.crm.vtiger.comcast.pomrepositylib.HomePage;
import com.crm.vtiger.comcast.pomrepositylib.Login;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author shubh
 *
 */
public class BaseClass {
	public WebDriver driver;
	public static WebDriver refdriver;
	//DBUtility dblib=new DBUtility();
	FileUtility file=new FileUtility();
	WebDriverUtility util=new WebDriverUtility();
	
	/*  
	 * method will connect to database
	 */
	@BeforeSuite(groups = {"regressiontest","smoketest"})
	public void connectDB() throws Throwable {
		//dblib.connectToDB();
		System.out.println("========DB CONNECTION SUCCESSFUL========");
	}

	/*
	 * it is used to launch the browser
	 */
	@Parameters({"browser"})
	@BeforeClass(groups = {"regressiontest","smoketest"})
	public void launchBrowser(@Optional("chrome")  String browserValue) throws Throwable {
		//String browser=file.readDataFromPropertyFile("browser");
        System.out.println("Launching Browser :-"+browserValue);
		if(browserValue.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserValue.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		System.out.println("========LAUNCH BROWSER SUCCESSFUL========");
	refdriver=driver;
	}
	
	/*
	 * it is used to login to app
	 */
	@BeforeMethod(groups = {"regressiontest","smoketest"})
	public void loginToApp() throws Throwable {
		String username = file.readDataFromPropertyFile("username");
		String password = file.readDataFromPropertyFile("password");
		String url=file.readDataFromPropertyFile("url");
		Login l=new Login(driver);
		l.loginToApp(url ,username ,password);
		System.out.println("========LOGIN SUCCESSFUL========");
	}
	
	/*
	 * it is used to logout from app
	 */
	@AfterMethod(groups = {"regressiontest","smoketest"})
	public void logoutToApp() {
		HomePage h=new HomePage(driver);
	//	Assert.fail();
		h.logOut();
		System.out.println("========LOGOUT SUCCESSFUL========");
	}
	
	/*
	 * it is used to close the browser
	 */
	@AfterClass(groups = {"regressiontest","smoketest"})
	public void closeBrowser() {
		driver.close();
		System.out.println("========CLOSE BROWSER SUCCESSFUL========");
	}
	
	/*
	 * it is used to close the connection
	 */
	@AfterSuite(groups = {"regressiontest","smoketest"})
	public void closeDB() throws Throwable {
		//dblib.closeDB();
		System.out.println("========DB CONNECTION CLOSE SUCCESSFUL========");
	}
}
