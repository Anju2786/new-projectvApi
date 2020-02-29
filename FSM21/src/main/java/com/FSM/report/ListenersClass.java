package com.FSM.report;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.FSM.base.Baseclass;
import com.aventstack.extentreports.Status;




public class ListenersClass extends Baseclass implements ITestListener  {
//    @Override

	public void onTestStart(ITestResult result)   {
		System.out.println("listener class - on test start");
		testCaseName = result.getTestClass().getName().toString();
		
		new Extent_Report_Manager().createExtentReport();
		extenttest = extentreports.createTest(testCaseName);
		

	}

//    @Override
	public void onTestSuccess(ITestResult result) {
		extenttest.log(Status.PASS, testCaseName + " is pass");
		//extentreports.flush();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    
//    @Override
       public void onTestFailure(ITestResult result) {
    	   System.out.println("fail test ");
		extenttest.log(Status.FAIL, testCaseName + " is fail");
		

		//extentreports.flush();
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   }

//    @Override
	public void onTestSkipped(ITestResult result) {
		Extent_Report_Manager.extenttest.log(Status.SKIP, testCaseName + " is skipped");
		//extentreports.flush();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//    @Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

//    @Override
	public void onStart(ITestContext context) {
		System.out.println("on start ----------");
	}
//    @Override
	public void onFinish(ITestContext context) {
		
		extentreports.flush();
		
		

	}

}