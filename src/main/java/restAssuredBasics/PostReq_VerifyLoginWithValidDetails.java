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
/* The above information will be used in the format of given(), when() and then() methods using the Response class from RestAssured lib
given()- this includes the preparation request information like- baseurl, path params, query params, headers, body etc
when()= this is action you perform using the endpoint
then()= this is where verification or assertion is done
 */
/* API 7: POST To Verify Login with valid details
API URL: https://automationexercise.com/api/verifyLogin
Request Method: POST
Request Parameters: email, password
Response Code: 200
Response Message: User exists!
 */
public class PostReq_VerifyLoginWithValidDetails {

    public static void main(String[] args) {

        String baseURI = "https://automationexercise.com";
        String requestBody = "{ \"email\":\"k@k.com\",\n" +
                "\"password\":\"Reward2551\"\n" +
                "}";
                String endPoint = "login";

        Response response = (Response) given()
                .baseUri(baseURI)
                .body(requestBody)
                .when()
                .post(endPoint);
              response.then().statusCode(200);
        System.out.println("User Exists");
        System.out.println(response.prettyPrint());
    }
}