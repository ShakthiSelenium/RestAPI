package jiraReqWithAssertions;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateJiraIssue extends RestAssureBaseClassJIRA
{
@Test(dependsOnMethods = "jiraReqWithAssertions.CreateJiraIssue.create") 
public void update()
{
	RequestSpecification body = RestAssured.given().contentType("application/json").body("{\r\n"
			+ "    \"fields\":{\r\n"
			+ "    \"description\": \"Bug creation Using REST API for testing6\"\r\n"
			+ "} }");
	Response response = body.put("/issue/"+issue_id);
	response.prettyPrint();
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
}
}
