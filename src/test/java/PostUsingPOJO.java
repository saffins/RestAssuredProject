import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostUsingPOJO {

	public static void main(String[] args) {

		User user = new User("user", "lname", "user@lname.com","401","ahmedabad","gujarat");
		user.setPhone(122222);
		user.setPhone(412122);

		Response response = given().contentType(ContentType.JSON).body(user).log().all()
				.post("http://localhost:8080/api/users");
		
		response.prettyPrint();

	}

}
