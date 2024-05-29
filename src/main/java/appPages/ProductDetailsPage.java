package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

/*
 * Author: Kishor Athale
 * Modules: Products Page
 * Changes: This class contains verification and actions methods which are applicable at the products page
 * of automation exercise app
 */
public class ProductDetailsPage extends BasePage {

    public WebDriver driver;  // create a constructor and webdriver

    //tagName[@attributeName='attributevalue']

    private By writeReviewInput = By.xpath("//a[text()='Write Your Review']");
    private By productDetails = By.xpath("//div[@class='product-information']");

    private By availabilityHeader = By.xpath("//b[text()='Availability:']");
    private By conditionHeader = By.xpath("//b[text()='Condition:']");
    private By brandHeader = By.xpath("//b[text()='Brand:']");

    public ProductDetailsPage(WebDriver driver) {
        super(driver);  // here 'super' keyword is used to call the parent class constructor.
        this.driver = driver;  // this keyword is used to call the instance members of the current class. 'this' means the object ref.
    }


    public void verifyIsUserOnProductDetailsPage(){
        driver.navigate().refresh();
        verifyIsElementDisplayed(writeReviewInput);
    }

    public void verifyProductDetails(){

        verifyIsElementDisplayed(productDetails);
        WebElement productInfo = driver.findElement(productDetails);
        System.out.println("Product description::"+productInfo.findElement(By.tagName("h2")).getText());
        System.out.println("Product Category::"+productInfo.findElement(By.tagName("p")).getText());
        verifyIsElementDisplayed(availabilityHeader);
        verifyIsElementDisplayed(conditionHeader);
        verifyIsElementDisplayed(brandHeader);
    }


}