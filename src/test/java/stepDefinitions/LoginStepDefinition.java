package stepDefinitions;

import appPages.LoginPage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utilities.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginStepDefinition {


   LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("user launches the application")
    public void user_launches_the_application() {

    }

    @And("user enters username and password to login")
    public void user_enters_username_and_password_to_login() {

        loginPage.loginToApp("prasha123@gmail.com","Pass1234s");
    }
    @And("user click on submit button")
    public void user_click_on_submit_button() {

    }
    @Then("user should be able to login to the app")
    public void user_should_be_able_to_login_to_the_app() {

    }


    @And("user enters excel data {string} and {string} and clicks on signup button")
    public void userEntersExcelDataAndAndClicksOnSignupButton(String sheetName, String rowNumber) throws IOException, InvalidFormatException {

     ExcelReader reader = new ExcelReader();

     List<Map<String, String>> testData = reader.getData(System.getProperty("user.dir") + "/src/test/resources/TestData/TestData.xlsx", sheetName);
     String username = testData.get(Integer.parseInt(rowNumber)).get("Username");
     String emailAddress= testData.get(Integer.parseInt(rowNumber)).get("EmailAddress");

     loginPage.loginToApp(username,emailAddress);


    }
}
