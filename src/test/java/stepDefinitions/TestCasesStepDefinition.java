package stepDefinitions;

import appPages.HomePage;
import appPages.TestCasesPage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TestCasesStepDefinition {

    TestCasesPage testCasesPage = new TestCasesPage(DriverFactory.getDriver());
    @And("user click on Test Cases button")
    public void userClickOnTestCasesButton() {
        testCasesPage.assertTestCasePageElements();
        testCasesPage.clickOnTestCaseButton();

    }

    @Then("verify if the user is navigated to the Test Cases page with the title as {string}")
    public void verifyIfTheUserIsNavigatedToTheTestCasesPageWithTheTitleAs(String ExpectedTitle) {
        testCasesPage.assertTestCasePageElements();

    }
}
