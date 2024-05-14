package restAssuredBasics;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

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
 */
/* API 4: Post to all product list
API URL: https://automationexercise.com/api/productsList
Request Method: POST
Response Code: 405
Response Message: This request method is not supported.
 */
public class PostReq_ToAllProductList {

    public static void main(String[] args) {

        String baseURI = "https://automationexercise.com";
        String endPoint = "api/productsList";

        Response response = (Response) given()
                .baseUri(baseURI)
                .when()
                .post(endPoint);
              response.then().statusCode(200);
        System.out.println(response.prettyPrint());
    }
}