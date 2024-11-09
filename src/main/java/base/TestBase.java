package base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class TestBase {
	
	
	
	protected String baseUri = "https://reqres.in/api";

    // Method to get the RequestSpecification with common headers
    public RequestSpecification getRequestSpecification(String requestBody) {
    	
        return RestAssured.given()
                .baseUri(baseUri)
                .header("Content-Type", "application/json")
                .body(requestBody);
    }

}
