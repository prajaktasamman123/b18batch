package com.basic.getRequestSD;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getRequestSD {
	
	
	Response resp;
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test(){
		System.out.println("Staring of the GET request");
		
			}
	
	@When("^user hit the get request$")
	public void user_hit_the_get_request(){
		
		resp= RestAssured.given().relaxedHTTPSValidation().when().get("http://ergast.com/api/f1/2017/circuits.json");
		
		//
		
		String respString = resp.asString();
		System.out.println(respString);
		
	}
	
	
	@Then("^user checks (\\d+) the status code$")
	public void user_checks_the_status_code(int expStatusCode){
		
		int statusCode = resp.getStatusCode();
		Assert.assertTrue(expStatusCode==statusCode);
	}
	
	@Then("^user checks the count or size$")
	public void user_checks_the_count_or_size(){
		String limitValue = resp.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitValue);
		
		//resp.then().assertThat().body("MRData.CircuitTable.circuits.circuitId",);
	}
	

}
