package jiraReqWithAssertions;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteJiraIssue extends RestAssureBaseClassJIRA
{
	@Test(dependsOnMethods = "jiraReqWithAssertions.UpdateJiraIssue.update")
	void delete()
	{
		Response delete = RestAssured.delete("/issue/"+issue_id);
		int statusCode = delete.getStatusCode();
		System.out.println(statusCode);
	}
	
}
