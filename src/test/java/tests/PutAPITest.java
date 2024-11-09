package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import io.restassured.response.Response;
import utils.APIUtils;

public class PutAPITest extends TestBase{
	
	@Test
	public void testPutRequest() {
		
		// Define the payload for PUT request
        String requestBody = "{\n" +
                             "  \"name\": \"API Demo\",\n" +
                             "  \"job\": \"API Tester\"\n" +
                             "}";

        // Build the request using the method from BaseTest
        Response response = getRequestSpecification(requestBody)
                            .when()
                            .put("/users/2");
        response.then().log().all();

        // Validate the HTTP Status Code      
        Assert.assertEquals(APIUtils.validateStatusCode(response), 200);

        // Validate Response Body
        Assert.assertEquals(APIUtils.validateResponseBody(response, "name"), "API Demo");
        Assert.assertEquals(APIUtils.validateResponseBody(response, "job"), "API Tester");
        	
		
	}

}
