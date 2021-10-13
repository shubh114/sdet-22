package com.crm.vtiger.GenericUtils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;
//fully qualified name for class :-com.crm.vtiger.GenericUtils.ListenerImplem
public class ListenerImplem implements ITestListener {

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
	
	}

	public void onTestFailure(ITestResult result) {
	TakesScreenshot ss=(TakesScreenshot) BaseClass.refdriver;
	File source=ss.getScreenshotAs(OutputType.FILE);
	String sspath=System.getProperty("user.dir")+"//screenshot//"+result.getMethod().getMethodName()+"_"+JavaUtility.getSystemDate()+".PNG";
	File destination=new File(sspath);
	try {
		Files.copy(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public void onTestSkipped(ITestResult result) {
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
	
	}

}
