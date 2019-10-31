import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import io.restassured.path.json.JsonPath;

public class ExtractValuesFromResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Response response = given().auth().basic("sk_test_0ZxjsFkR2H6ptF6zf1IgabZq00HG5r99yV", "")
				.formParam("name", "paramter").formParam("email", "param@param.com")
				.formParam("address[line1]", "new delhi").formParam("preferred_locales[0]", "English")
				.formParam("preferred_locales[1]", "Gujarati").post("https://api.stripe.com/v1/customers ");

		response.prettyPrint();

		JsonPath jsonPath = response.jsonPath();

		System.out.println(jsonPath.get("preferred_locales[1]"));
		System.out.println(jsonPath.get("address.line1"));
		System.out.println(jsonPath.getMap("$").size());

		System.out.println(jsonPath.getList("preferred_locales").size());
	}

}
