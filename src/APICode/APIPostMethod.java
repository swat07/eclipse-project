package APICode;
import org.json.JSONObject;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIPostMethod {

	public static void main(String[] args) {
		
		SoftAssert sAssert = new  SoftAssert();
		
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-type" , "application/json");
		
		//RequestPayload creation 
		JSONObject body = new JSONObject();
		body.put("name", "morpheus");
//		body.put("job", "leader");
		
		request.body(body);
		Response response = request.post("/api/users/");
		
		System.out.println(response.asString());
		System.out.println(response.getTime());
		
		sAssert.assertTrue(response.getTime() < 2000);
		
		sAssert.assertEquals(response.getStatusCode(), 201);
		sAssert.assertAll();
		
		
		
		
		
		
		
		
	}

}
