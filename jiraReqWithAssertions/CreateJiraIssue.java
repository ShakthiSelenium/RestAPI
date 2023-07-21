package jiraReqWithAssertions;

import org.testng.annotations.Test;
import org.hamcrest.Matchers;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateJiraIssue extends RestAssureBaseClassJIRA {
	
	@Test
	public void create() {
		
	RequestSpecification body = RestAssured.given().contentType("application/json").when().body("{\"fields\": { \r\n"
			       +"\"project\": {\r\n"
			       +"\"key\": \"TES\"\r\n"
			        +"},"
			        +"\"summary\": \"create issue1 in RA project by Shakthi\",\r\n"
			        +"\"description\": \"Bug creation Using REST API for testing1\",\r\n"
			       +"\"issuetype\": {\r\n"
			        +"\"name\": \"Task\"\r\n"
			        +"}\r\n"
			   +"}\r\n"
			+"}\r\n");
		//send request
		Response response = body.post("/issue/");
		response.prettyPrint();	
		int statusCode = response.getStatusCode();
		
		System.out.println("create Request Response "+statusCode);
		 issue_id = response.jsonPath().get("id"); 
		System.out.println("Value of Issue id ===" +issue_id );
		
		//Assert Status code
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		
		//Assert Short Description
		//response.then().assertThat().body("result.description",Matchers.containsString("RA project by Shakthi"));
		response.then().assertThat().body("key",Matchers.containsString("TES"));
	}

}
