package com.crm.vtiger.GenericUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyze implements IRetryAnalyzer {
int count=0;
int retrycount=3;
	public boolean retry(ITestResult result) {
		while(count<retrycount) {
		count++;
		return true;
		}
		return false;
	}

}
