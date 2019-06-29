package com.basic.FirstRestScript;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class MyFirstCucuSD {
	
	Response res;
	
		
		@Given("^user hit the get request$")
		public void user_hit_the_get_request(){
			res = RestAssured.given().get("https://www.google.co.in/");
			
		}
	
		@Then("^user checks the \"([^\"]*)\" status code$")
			
			public void user_checks_the_status_code(String stCode){
				int statusCode = res.getStatusCode();
				//Assert.assertEquals(stCode, Integer.toString(statusCode));
			}
			
	//user checks the \"([^\"]*)\" status code	String stCode
}


	

