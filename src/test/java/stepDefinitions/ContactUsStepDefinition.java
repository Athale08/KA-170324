package stepDefinitions;

import appPages.ContactUsPage;
import appPages.HomePage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ContactUsStepDefinition {

    HomePage homePage1 = new HomePage(DriverFactory.getDriver());
    ContactUsPage contactUsPage = new ContactUsPage(DriverFactory.getDriver());

    @And("user click on contactus button")
    public void user_click_on_contactus_button() {
        homePage1.clickOnContactUsButton();

    }
    @And("Verify {string} is visible")
    public void verifyGETINTOUCHIsVisible(String title) {
        contactUsPage.verifyGetInTouchHeader(title);

    }
    @And("user enters the {string} and {string} and {string} and {string}")
    public void userEntersTheAndAndAnd(String name, String email, String subject, String message) {
    contactUsPage.enterGetInTouchDetails(name,email,subject,message);
    }
    @And("user click on the submit button")
    public void userClickOnTheSubmitButton() {
        contactUsPage.clickOnSubmitButton();
    }
    @And("user click on the OK button inside the pop-up")
    public void userClickOnTheOKButtonInsideThePopUp() throws InterruptedException {
        contactUsPage.acceptAlert();
    }
    @Then("user should be able to view the success message confirmation as {string}")
    public void userShouldBeAbleToViewTheSuccessMessageConfirmationAs(String formConfMsg) {
        contactUsPage.verifySuccessMessage(formConfMsg);
    }
    @When("user click on cancel button")
    public void userClickOnCancelButton() throws InterruptedException {
        contactUsPage.dismissAlert();
    }
    @Then("verify user stays on the same page and {string} is visible")
    public void verifyUserStaysOnTheSamePageAndGETINTOUCHIsVisible(String expectedTitle) {
        contactUsPage.verifyGetInTouchHeader(expectedTitle);
    }

    @And("user click on the Home button")
    public void userClickOnTheHomeButton() {
    contactUsPage.clickOnHomeButton();
    }
}
