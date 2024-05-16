package restAssuredBasics;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

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
/* API Test1: Post to do acc auth
API URL: https://demoqa.com/swagger/#/Account/AccountV1AuthorizedPost
Request Method: POST
Response Code: 200
Response Message: True
 */
/*public class PostReq_DemoQaAccAuth {

    public static void main(String[] args) {

        String baseURI = "https://demoqa.com/";
        String requestBody = "{\n" +
                "  \"userName\": \"string\",\n" +
                "  \"password\": \"string\"\n" +
                "}";
        String endPoint = "/Account/v1/Authorized";

        Response response = (Response) given()
                .baseUri(baseURI)
                .body(requestBody)
                .when()
                .post(endPoint);
              response.then().statusCode(200);
        System.out.println(response.prettyPrint());
    }// response is 400*/


/*API Test 2: Post to generate token
    API URL: https://demoqa.com/swagger/#/Account/AccountV1GenerateTokenPost
    Request Method: POST
    Response Code: 200
    Response Message: True
 */

    public class PostReq_DemoQaAccAuth {

    public static void main(String[] args) {

        String baseURI = "https://demoqa.com/";
        String requestBody = "{\n" +
                "  \"userName\": \"string\",\n" +
                "  \"password\": \"string\"\n" +
                "}";
        String endPoint = "/Account/v1/User";

        Response response = (Response) given()
                .baseUri(baseURI)
                .body(requestBody)
                .when()
                .post(endPoint);
        response.then().statusCode(200);
        System.out.println(response.prettyPrint());


    }
}