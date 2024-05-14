package restAssuredBasics;
/* For any request to perform we need:
1. Base URL/URI
2. End Point
3. Authentication( if required)
4. Path/Query Parameters( if required)
5. Request Payload/Body( for Post/PUT methods)
 */
/* The above information will be used in the format of given(), when() and then() methods
given()- this includes the preparation request information like- baseurl, path params, query params, headers, body etc
when()= this is action you perform using the endpoint
then()= this is where verification or assertion is done
 /*API TEST 6: Post To Search Product
 API URL: https://automationexercise.com/search
Request Method: POST
Request Parameter: search_product (For example: top, tshirt, jean)
Response Code: 200
Response JSON: Searched products list
 */

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetReq_ToSearchProduct {
    public static void main(String[] args) {
        String baseURI = "https://automationexercise.com";
        String endPoint = "search";

        Response response = given()
                .baseUri(baseURI)
                .queryParam("search_product", "tshirt")
                .when()
                .get(endPoint);
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());
    }
}
