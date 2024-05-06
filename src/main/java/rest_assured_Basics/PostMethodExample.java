package rest_assured_Basics;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class PostMethodExample {

    public static void main(String[] args) {

       String requestBody = "{\n" +
               "    \"name\": \"morpheus\",\n" +
               "    \"job\": \"leader\"\n" +
               "}";
       String baseURI = "https://reqres.in";

      given()
              .baseUri(baseURI)
              .contentType(ContentType.JSON)
              .body(requestBody)
              .when()
              .post("/api/users")
              .then()
              .log().all()
              .statusCode(201);



    }
}
