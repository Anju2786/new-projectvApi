package com.FSM.ItemAPITest;

import org.testng.Assert;

import com.FSM.base.ApiMethod;
import com.FSM.base.Baseclass;

import io.restassured.response.Response;

public class ItemApi_GetTest_negativeTest extends Baseclass{
	public void getTestNegative() {
		extenttest=extentreports.createTest("get test");
		
		
		
		Response res = ApiMethod.executeRequest("getAllItemByTaskId" ,REQ_PARA_FILLE_PATH, REQ_PARA_SHEET);
		System.out.println(res.prettyPrint());

		 int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode /*actual value*/, 201 /*expected value*/, "Correct status code returned");
		
	//extenttest.fail("Get test  2 fail");
	}

}
