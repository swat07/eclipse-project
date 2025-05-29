package APICode;
import java.util.List;

import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APIGetMethod {
	public static void main(String[] args) {
		
		SoftAssert sAssert = new SoftAssert();
		
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification request = RestAssured.given();
		
		Response response1 = request.get("/api/users?page=2");
		request.header("token", "xyz");
		System.out.println(response1.asString());
		
		JsonPath jsonResponse = response1.jsonPath();
		System.out.println(jsonResponse.getString("page"));
		
		sAssert.assertTrue(jsonResponse.getString("data.first_name").contains("Michael"));
		
//		String emailRegex = "byron.fields@reqres.in";
		
		List<String> emails = jsonResponse.getList("data.email");
        sAssert.assertTrue(emails.contains("byron.fields@reqres.in"),"Email not found!");
        
		
//		Response response2 = request.get("/api/users/2");
//		System.out.println(response2.asString());
		
		sAssert.assertEquals(response1.getStatusCode(), 200);
//		sAssert.assertNotEquals(response2.getStatusCode(), 201);
		sAssert.assertAll();		
		 
				
	}

}
