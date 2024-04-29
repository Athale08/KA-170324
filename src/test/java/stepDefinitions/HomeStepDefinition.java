package stepDefinitions;

import appPages.HomePage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeStepDefinition {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @And("verify whether user is on home page with title as {string}")
    public void verifyWhetherUserIsOnHomePageWithTitleAs(String ExpectedTitle) {
        homePage.assertHomePageElements();
    }
    @Given("user is on login page")
    public void user_is_on_login_page() {
        homePage.navigateToLoginPage();
    }



    @Then("user should be logged in the app")
    public void userShouldBeLoggedInTheApp() {
    homePage.assertLoginIsSuccessful();
    }


    @And("user can delete account")
    public void userCanDeleteAccount() {
    homePage.assertClickDeleteAccountButton();
    }

    @Then("user should see the account deletion confirmation")
    public void userShouldSeeTheAccountDeletionConfirmationAndClickContinueButton() {
        homePage.assertClickDeleteAccountButton();
        homePage.clickOnContinueButtonAfterDeletingAccount();
    }



}
