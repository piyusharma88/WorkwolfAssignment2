package Workwolf.Assignment_2;

import java.io.IOException;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class getRequest {

	public static void main(String[] args) throws IOException {

		RestAssured.baseURI = "https://app.adm.workwolf.com";
		given().log().all().queryParam("userId", "cb253f91-2858-46d3-993f-dd7f735a48c4")
				.get("company/shareable-links/CAN/seangio").then().log().all()
				.assertThat().statusCode(200).body("firstName", equalTo("Adam")).body("lastName", equalTo("Seangio"));

	}

}
