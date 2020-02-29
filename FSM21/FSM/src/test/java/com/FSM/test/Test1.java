package com.FSM.test;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import com.FSM.base.ApiMethod;
import com.FSM.base.Baseclass;


import io.restassured.response.Response;


	public class Test1 extends Baseclass {
		 
		
	private Object object;
	@Test(priority=1)
	public void getTest() {
//		extenttest=extentreports.createTest("get test");
		
		
		//System.out.println("File path = " + REQ_PARA_FILLE_PATH);
		Response res = ApiMethod.executeRequest("getAllItemByTaskId" ,REQ_PARA_FILLE_PATH, REQ_PARA_SHEET);
		System.out.println(res.prettyPrint());

		 int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
//		extenttest.pass("Get test  2 success");
	}
	
	@Test(priority=2)
	public void getTestNegative() {
//		extenttest=extentreports.createTest("get test");
		
		
		//System.out.println("File path = " + REQ_PARA_FILLE_PATH);
		Response res = ApiMethod.executeRequest("getAllItemByTaskId" ,REQ_PARA_FILLE_PATH, REQ_PARA_SHEET);
		System.out.println(res.prettyPrint());

		 int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode /*actual value*/, 201 /*expected value*/, "Correct status code returned");
		
	//extenttest.fail("Get test  2 fail");
	}
	@Test(priority=3)
	public void postTest()  {
		//extenttest=extentreports.createTest("Post Add New Login Details ");
		Response response = ApiMethod.executeRequest("AddNewLoginDetails", REQ_PARA_FILLE_PATH, REQ_PARA_SHEET);
		//extenttest.pass("Add New Login Details");
		
		
		/* if I am paaing response variable Iam getting null pointer exception, if not using response variable the test is getting pass  */
		
		System.out.println("response"+response.asString());
		System.out.println("Status code"+response.getStatusCode());

		
		Assert.assertEquals(200, response.getStatusCode());

		System.out.println(response.prettyPrint());
		//Assert.assertEquals(200, res.getStatusCode());

}
}