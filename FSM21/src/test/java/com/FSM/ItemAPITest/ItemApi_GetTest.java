package com.FSM.ItemAPITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.FSM.base.ApiMethod;
import com.FSM.base.Baseclass;

import io.restassured.response.Response;

public class ItemApi_GetTest extends Baseclass {
	
	@Test
	public void getTest() {
	extenttest=extentreports.createTest("get test");
		
		
		
		Response res = ApiMethod.executeRequest("getAllItemByTaskId" ,REQ_PARA_FILLE_PATH, REQ_PARA_SHEET);
		System.out.println(res.prettyPrint());

		 int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
		extenttest.pass("Get test  2 success");
		
	}

}
