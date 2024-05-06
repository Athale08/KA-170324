package rest_assured_Basics;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class PutMethodExample {

    public static void main(String[] args) {



        String requestBody = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        String baseURI = "https://reqres.in";
        String endPoint = "/api/users/2";

        given()
                .baseUri(baseURI)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .put(endPoint)
                .then()
                .log().all()
                .statusCode(200);


    }
}
