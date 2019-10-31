
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class GetRequest {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Response response = given().param("limit",
	 * 3).auth().basic("sk_test_0ZxjsFkR2H6ptF6zf1IgabZq00HG5r99yV", "")
	 * .get("https://api.stripe.com/v1/customers");
	 * 
	 * String res = response.asString();
	 * 
	 * System.out.println(res); System.out.println(response.statusCode());
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Response res = given().header("Authorization", "Bearer sk_test_0ZxjsFkR2H6ptF6zf1IgabZq00HG5r99yV")
				.get("https://api.stripe.com/v1/customers");

		res.prettyPrint();
		

	}

}
