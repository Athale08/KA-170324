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
 */
/*
API_Test 3: Get User Account Details by Email
API URL: https://automationexercise.com/api/getUserDetailByEmail
Request Method: GET
Request Parameters: email   Note- here only key is given so you need to provide the values as shown below in line40.
Response Code: 200
Response JSON: User Detail
 */

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class GetReq_UserAccDetailsByEmail {
    public static void main(String[]args) {

        String baseURI = "https://automationexercise.com";
        String endPoint = "api/getUserDetailByEmail";


        Response response = given()
                .baseUri(baseURI)
                .queryParam("email","k@k.com")
                
                .when()
                .get(endPoint);
                     response.then().statusCode(200);
        System.out.println(response.prettyPrint());
       /* System.out.println(response.statusCode());

        if(response.statusCode()==200){
            System.out.println("Test has Passed");
        }
        else{
            System.out.println("Test has Failed");

        }*/

    }


}
