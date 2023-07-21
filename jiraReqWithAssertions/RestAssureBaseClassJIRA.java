package jiraReqWithAssertions;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;

public class RestAssureBaseClassJIRA {	
	
	public static String issue_id;
	
	@BeforeMethod
	public void base() {
		//Endpoint url
		RestAssured.baseURI ="https://rajashakthimurali.atlassian.net/rest/api/2";
		
		//Authorization
		RestAssured.authentication = RestAssured.preemptive().basic("rajashakthimurali@gmail.com","ATATT3xFfGF0iAtWVRtbBUerROXTHW0lluvH6onij5270qy968cR-ssucJqk-yuGaYMvUOeFXeo-jivlTeiszelqs9DnIHlxJIsNgAldhSjULzp91jG_7DZ7q8PwtJfRBZV9YSb_S8Wcr0DMW1m6Q8AfrwifLhdCIlLH5SZ6kqEYrfRyiMU1aPw=F314F345");
	}
		
	
	
	

}
