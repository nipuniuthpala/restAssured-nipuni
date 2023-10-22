package common_method;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class common_method_get_api {
	public static int responsestatuscode_extractor(String baseURI,String req_body)
	{
		RestAssured.baseURI=baseURI;
		int response_statuscode = given().header("Content-Type","application/json").body(req_body)
				.when().get(baseURI).then().extract().statusCode();
		return response_statuscode;
	}
	


}
