package com.FSM.base;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.time.LocalDateTime;



@Listeners(com.FSM.report.ListenersClass.class)
public class Baseclass implements iConstants {

	public static ExtentReports extentreports;
	public static ExtentTest extenttest;
	
	
	public static ExtentHtmlReporter extenthtmlreporter;
	public String testCaseName;
	public EventFiringWebDriver edr;
	

	/**
	 * to initialize the URI,port and authentication
	 */
	@BeforeSuite
	public void config() throws Throwable {
		baseURI = BASE_URI;
		// port=4444;
		// given().auth().basic(userName,password);
//		extenthtmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")
//				+ "\\src\\test\\resources\\reports\\extent" + LocalDateTime.now() + ".html");
//		extenthtmlreporter=new ExtentHtmlReporter(new File("C:\\Users\\Anjusajith.Nair\\git\\repository2\\FSM\\src\\test\\resources\\reports\\FSM.html")); 
//		extentreports=new ExtentReports();
//		extentreports.attachReporter(extenthtmlreporter);
	}
	
//	@AfterMethod
	public void aftermethod() {
//		extentreports.flush();
		
	}
	
	
	
}
