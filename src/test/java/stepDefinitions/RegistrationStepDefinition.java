package stepDefinitions;

import appPages.HomePage;
import appPages.RegistrationPage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegistrationStepDefinition {


    HomePage homePage = new HomePage(DriverFactory.getDriver());
    RegistrationPage registrationPage = new RegistrationPage(DriverFactory.getDriver());

    @And("user click on signup or login link on homepage")
    public void userClickOnSignupOrLoginLinkOnHomepage() {
        homePage.navigateToLoginPage();

    }

    @And("user enters {string} and {string} and clicks on signup button")
    public void user_enters_and_and_clicks_on_signup_button(String username, String emailId) {
        registrationPage.enterSignUpDetails(username, emailId);
    }
    @And("user enters already registered {string} and {string} and clicks on signup button")
    public void userEntersAlreadyRegisteredAndAndClicksOnSignupButton(String username1, String emailId1) {
        registrationPage.signUpWithExistingEmailAddress(username1, emailId1);
    }
    @Then("Verify error {string} is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible(String expectedErrorMessage) throws InterruptedException {
    registrationPage.assertSignUpErrorMessage(expectedErrorMessage);
        Thread.sleep(5000);
    }

    @And("user enters {string} and {string} and {string} and {string} and {string}")
    public void user_enters_and_and_and_and(String title, String password, String day, String month, String year) throws InterruptedException {
        registrationPage.enterInitialInfo(title, password, day, month, year);
        Thread.sleep(3000);
    }

    @And("user enters {string} and {string} and {string} and {string}")
    public void user_enters_and_and_and(String fname, String lname, String address1, String address2) {
    registrationPage.enterAddressInfo(fname, lname, address1, address2);
    }

    @And("{string} and {string} and {string} and {string} and {string}")
    public void and_and_and_and(String country, String state, String city, String zipcode, String mobile) {
    registrationPage.enterAddressInfoCntd(country, state, city, zipcode, mobile);
    }
    @And("Select checkbox 'Sign up for our newsletter!'")
    public void selectCheckboxSignUpForOurNewsletter() {
        registrationPage.selectCheckboxElement1();

    }
    @And("Select checkbox for 'Receive special offers from our partners!'")
    public void selectCheckboxForReceiveSpecialOffersFromOurPartners() {
        registrationPage.selectCheckboxElement2();
    }
    @And("user click on  create account button")
    public void user_click_on_create_account_button() {
    registrationPage.clickButton();
    }


    @Then("user should be able to view the account creation confirmation as {string}")
    public void userShouldBeAbleToViewTheAccountCreationConfirmationAs(String expectedMessage) {

        registrationPage.checkIsAccountCreated(expectedMessage);
    }

    @And("user click on continue button")
    public void userClickOnContinueButton() {
    registrationPage.clickOnContinueButton();
    }



}
