package stepDefinitions;

import appPages.ProductsPage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductsStepDefinition {

    ProductsPage productsPage = new ProductsPage(DriverFactory.getDriver());

    @And("the products list is visible")
    public void theProductsListIsVisible() {

        productsPage.verifyAllProductsList();

    }

    @When("user Click on View Product of first product")
    public void userClickOnViewProductOfFirstProduct() {
        productsPage.clickOnViewOrderForFirstItem();
    }

    @When("user enter {string} in search input and click search button")
    public void userEnterInSearchInputAndClickSearchButton(String item) {
        productsPage.searchProduct(item);
    }

    @Then("verify {string} as title of page")
    public void verifyAsTitleOfPage(String expectedTitle) {
        productsPage.verifySearchResultsTitle(expectedTitle);
    }

    @And("{string} is visible in the search results")
    public void isVisibleInTheSearchResults(String item) {
        productsPage.verifySearchResults(item);
    }
}
