package stepDefinitions;

import appPages.HomePage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDefinition {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @And("verify whether user is on home page with title as {string}")
    public void verifyWhetherUserIsOnHomePageWithTitleAs(String ExpectedTitle) {
        homePage.verifyHomePageTitle(ExpectedTitle);
    }
    @When("user click on the {string} button")
    public void userClickOnTheButton(String title) {
        homePage.assertProductsPageElements(title);
        homePage.clickOnProductsButton();
    }
    @Then("verify user is navigated to the {string} page successfully")
    public void verifyUserIsNavigatedToThePageSuccessfully(String title) {
        homePage.navigateToProductsPage(title);
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
       homePage.clickOnContinueButtonAfterDeletingAccount();
    }


    @And("user click on logout button")
    public void userClickOnLogoutButton() {
        homePage.assertLogoutIsSuccessful();
        homePage.navigateToLoginPage();
    }


    @When("user click on the Products button")
    public void userClickOnTheProductsButton() {
        homePage.clickOnProductsButton();
    }

    @When("user Scroll down to footer")
    public void userScrollDownToFooter() {
       homePage.scrollToSubscription();
    }

    @Then("Verify text {string}")
    public void verifyText(String title) {
        homePage.verifySubscriptionText(title);
    }

    @And("user Enter {string} in input and click arrow button")
    public void userEnterInInputAndClickArrowButton(String email) {
        homePage.enterEmailAndSubmit(email);
    }

    @Then("Verify success message {string} is visible")
    public void verifySuccessMessageIsVisible(String message) {
        homePage.verifySuccessMessage(message);
    }

    @When("user Click Cart button")
    public void userClickCartButton() {
        homePage.clickOnCart();
    }

    @And("user click on {string} button")
    public void userClickOnButton() {
    homePage.clickOnTestCasesButton();
    }
}
