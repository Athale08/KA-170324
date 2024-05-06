package rest_assured_Basics;



import static io.restassured.RestAssured.given;


public class GetMethodExample {


    public static void main(String[] args) {


        String baseURI = "https://reqres.in";
        String endpoint = "/api/users";


             given()
                .baseUri(baseURI)
                .queryParam("page","2")
                         .when()
                         .get("/api/users")
                     .then().statusCode(200);





  // given() when() then()


    }
}
