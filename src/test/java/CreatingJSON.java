import org.json.JSONArray;
import org.json.JSONObject;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatingJSON {

	public static void main(String[] args) {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("email", "json@object.com");
		jsonObject.put("firstName", "json");
		jsonObject.put("lastName", "object");

		JSONArray jsonArray = new JSONArray();

		jsonArray.put(111111);
		jsonArray.put("hi");

		jsonObject.put("mobile", jsonArray);

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("flatno", 1);
		jsonObject2.put("city", "ahmedabad");

		Response response = given().contentType(ContentType.JSON).body(jsonObject.toString()).log().all()
				.post("http://localhost:8080/api/users");

		response.prettyPrint();
		System.out.println(response.getStatusCode());

	}

}
