package APICode;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class practice1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification request = RestAssured.given();
		
		Response response1 = request.get("/api/users?page=2");
		System.out.println(response1.asString());
		
		
		
		
		
		
	}

}
