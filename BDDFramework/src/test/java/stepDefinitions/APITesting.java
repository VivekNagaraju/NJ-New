package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APITesting {
	 Response response;
	@When("I send POST request with user details as {string} and {string}")
	public void i_send_post_request_with_user_details_as_and(String name, String job) {
	    String requestBody="{\r\n"
	    		+ "    \"name\": \""+name+"\",\r\n"
	    		+ "    \"job\": \""+job+"\"\r\n"
	    		+ "}";
		response=RestAssured.given().contentType(ContentType.JSON).body(requestBody).when().post("https://reqres.in/api/users");
		
		System.out.println(response.asPrettyString());
		
	}
	@Then("the status code should be {int}")
	public void the_status_code_should_be(Integer int1) {
		int actualStatusCode=response.statusCode();
		assertEquals(201, actualStatusCode);
	}
	@Then("the response body should contain name as {string} and job as {string}")
	public void the_response_body_should_contain_name_as_and_job_as(String name, String job) {
		String actualName=response.jsonPath().getString("name");
		String actualJob = response.jsonPath().getString("job");
		
		assertEquals(name, actualName);
		assertEquals(job, actualJob);
	}


}
