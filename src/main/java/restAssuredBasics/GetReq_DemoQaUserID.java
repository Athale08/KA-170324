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
 API URL: https://demoqa.com/swagger/#/Account/AccountV1UserByUserIdGet
Request Method: GET
Request Parameter:
Response Code: 200
Response JSON: Searched products list
 */

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetReq_DemoQaUserID {
    public static void main(String[] args) {
        String baseURI = "https://demoqa.com/swagger/#/";
        String endPoint = "/Account/v1/User/{UUID}";

        Response response = given()
                .baseUri(baseURI)
                .pathParam("UserId","UUID")
                .when()
                .get(endPoint);
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());
    }
}
