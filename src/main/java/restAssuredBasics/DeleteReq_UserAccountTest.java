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
/* API 8: DELETE METHOD To Delete User Account
API URL: https://automationexercise.com/api/deleteAccount
Request Method: DELETE
Request Parameters: email, password
Response Code: 200
Response Message: Account deleted
 */
public class DeleteReq_UserAccountTest {

    public static void main(String[] args) {

        String baseURI = "https://automationexercise.com";
        String requestBody = "{ \"email\":\"k@k.com\",\n" +
                "\"password\":\"Reward2551\"\n" +
                "}";
                String endPoint = "api/deleteAccount";

        Response response = (Response) given()
                .baseUri(baseURI)
                .body(requestBody)
                .when()
                .delete(endPoint);
              response.then().statusCode(200);
        System.out.println("Account deleted");
        System.out.println(response.prettyPrint());
    }
}
// this throws 415 status code as the server rejects the request to delete the account either due to incorrect payload format or auth issue.