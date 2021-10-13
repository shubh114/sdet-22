package com.crm.vtiger.GenericUtils;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/*
	 * @author anupam
	 */
	/**
	 * this method is generate random number to avoid duplicate 
	 * @return
	 */
public static String getRandomData() {
	Random random=new Random();
	int ran = random.nextInt(1000);
 return ""+ran;
}
/**
 * @author anupam
 * this method is used to generate current date
 * @return
 */
public static String getCurrentDate() {
	Date date=new Date();
	String currentdate = date.toString();
	return currentdate;
}
public static String getSystemDate() {
	Date dat=new Date();
	return dat.toString().replaceAll(" ", "_").replace(":", "_");
	}
//public static void main(String[] args) {
	//System.out.println(getSystemDate());
//}
}
