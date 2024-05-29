package stepDefinitions;

import appPages.ProductDetailsPage;
import drivers.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ProductDetailStepDefinition {


    ProductDetailsPage productDetailsPage = new ProductDetailsPage(DriverFactory.getDriver());

    @And("User is landed onto the product detail page")
    public void userIsLandedOntoTheProductDetailPage() {

        productDetailsPage.verifyIsUserOnProductDetailsPage();
    }

    @Then("Verify that detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {

        productDetailsPage.verifyProductDetails();
    }
}
