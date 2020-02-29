package com.FSM.report;


import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.FSM.base.Baseclass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.*;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Extent_Report_Manager extends Baseclass {
	public static String screenShotPath;

	/**
	 * createExtentReport method to initialize the extent reports
	 * 
	 * @param testname
	 */

	public void createExtentReport() {
		System.out.println("into create extent report");
		System.out.println("local date and time " + LocalDateTime.now());
		
		//String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd").format(new Date());
		extenthtmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")
				+ "/src/test/resources/reports/extent "	+ timeStamp+".html");
		
		/*chart is also showing error */
		//extenthtmlreporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		//extenthtmlreporter.config().setChartVisibilityOnOpen(true);
		extenthtmlreporter.config().setTheme(Theme.STANDARD);
		extenthtmlreporter.config().setEncoding("utf-8");
		extentreports = new ExtentReports();
		extentreports.attachReporter(extenthtmlreporter);
	

	}
}


