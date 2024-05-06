package rest_assured_Basics;

import static io.restassured.RestAssured.given;

public class DeleteMethodExample {

    public static void main(String[] args) {


        String baseURI = "https://reqres.in";
        String endPoint = "/api/users/2";


        given().
                baseUri(baseURI).
                when()
                .delete(endPoint)
                .then()
                .log().all()
                .statusCode(204);

    }
}
