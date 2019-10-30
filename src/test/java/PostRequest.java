
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Response res =
		 * given().auth().basic("sk_test_0ZxjsFkR2H6ptF6zf1IgabZq00HG5r99yV",
		 * "").param("name" , "Saffin Shivani").param("email" ,
		 * "saffin7867@gmail.com").
		 * 
		 * param("balance", 15000000).
		 * post("https://api.stripe.com/v1/customers");
		 * 
		 * System.out.println(res.asString()); System.out.println(
		 * "and the response code is " + res.statusCode());
		 */

		postUsingJSONFile();

	}

	public static void postUsingJSON() {

		HashMap<String, String> hm = new HashMap<>();

		hm.put("email", "eve.holt@reqres.in");
		hm.put("password", "pistol");

		Response response = given().contentType(ContentType.JSON).body(hm).post("https://reqres.in/api/register");

		response.prettyPrint();

	}

	public static void postUsingJSONFile() {

		HashMap<String, String> hm = new HashMap<>();

		hm.put("email", "eve.holt@reqres.in");
		hm.put("firstName", "pistol");
		hm.put("lastname", "pistol");

		Response response = given().contentType(ContentType.JSON).body(new File("./users.json"))
				.post("http://localhost:8080/api/users");

		response.prettyPrint();

		System.out.println(response.getStatusCode());

		getUsingJSON();

	}

	public static void getUsingJSON() {

		Response response = given().contentType(ContentType.JSON).get("http://localhost:8080/api/users");

		response.prettyPrint();

	}

}
