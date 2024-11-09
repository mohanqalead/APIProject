package utils;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class APIUtils {
	
	
	public static int validateStatusCode(Response response){
		return response.getStatusCode();		
        
    }

    // Method to validate specific key in the response body
    public static String validateResponseBody(Response response, String key) {
        return  response.jsonPath().getString(key);
       
    }

}
