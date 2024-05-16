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
/* API 9:  POST To Create/Register User Account
API URL: https://automationexercise.com/api/createAccount
Request Method: POST
Request Parameters: name, email, password, title (for example: Mr, Mrs, Miss), birth_date, birth_month, birth_year, firstname, lastname, company, address1, address2, country, zipcode, state, city, mobile_number
Response Code: 201
Response Message: User created!
 */
public class PostReq_ToCreateNewUserAccount {

    public static void main(String[] args) {

        String baseURI = "https://automationexercise.com";
        String requestBody = "{\n" +
                "\"name\": \"Tom\",\n" +
                "\"email\": \"t@t.com\",\n" +
                "\"password\": \"Sam004\",\n" +
                "\"title\": \"Mr\",\n" +
                "\"birth_date\": \"04\", \n" +
                "\"birth_month\": \"05\",\n" +
                "\"birth_year\": \"1980\",\n" +
                "\"firstname\": \"Tom\", \n" +
                "\"lastname\": \"Smith\", \n" +
                "\"company\": \"ABC\",\n" +
                "\"address1\": \"123 anyhwere\",\n" +
                "\"address2\": \"456 anytown\",\n" +
                "\"country\": \"Uganda\",\n" +
                "\"zipcode\": \"12345\",\n" +
                "\"state\": \"Miranda\",\n" +
                "\"city\": \"Seaworld\",\n" +
                "\"mobile_number\": \"011123456\"\n" +
                "}";
                String endPoint = "/api/createAccount";

        Response response = (Response) given()
                .baseUri(baseURI)
                .body(requestBody)
                .when()
                .post(endPoint);
              response.then().statusCode(201);
        System.out.println("User Created");
        System.out.println(response.prettyPrint());
    }
}
//This is giving 415-When an HTTP 415 status code appears, it means that the server refused to accept a
// request from the browser. This error code usually happens because the payload (what the browser sends)
// isn't in the right format. It can also occur due to Content-Type and Content-Encoding headers being rejected
// by the server.