package com.basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Testinggoogle {
	
	public static void main(String args[]){
		
		
		Response res = RestAssured.given().get("https://www.google.co.in/");
		int statcode = res.statusCode();
		
		System.out.println("Status code :" +statcode );
		
		//Assert.assertEquals(200, statcode);
		
	}
	
	
}
