package stepDefinitions;

import appPages.HomePage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeStepDefinition {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("user is on login page")
    public void user_is_on_login_page() {
        homePage.navigateToLoginPage();
    }


    @And("verify whether user is on home page")
    public void verifyWhetherUserIsOnHomePage() {

        homePage.assertTitle("");
    }

    @And("verify whether user is on home page with title as {string}")
    public void verifyWhetherUserIsOnHomePageWithTitleAs(String expectedResult) {

        homePage.checkIsUserOnHomePage(expectedResult);
    }

    @Then("user will be logged in as {string}")
    public void userWillBeLoggedInAs(String name) {
        homePage.checkUserLoginName(name);
    }

    @And("user can delete account")
    public void userCanDeleteAccount() {
    homePage.clickOnDeleteAccountButton();
    }

    @Then("user should see the account deletion confirmation")
    public void userShouldSeeTheAccountDeletionConfirmationAndClickContinueButton() {
    }
}
