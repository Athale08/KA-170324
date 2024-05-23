package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
 * Author: Kishor Athale
 * Modules: Products Page
 * Changes: This class contains verification and actions methods which are applicable at the products page
 * of automation exercise app
 */
public class ProductsPage extends BasePage {

    public WebDriver driver;  // create a constructor and webdriver

    //tagName[@attributeName='attributevalue']

    public ProductsPage(WebDriver driver) {
        super(driver);  // here 'super' keyword is used to call the parent class constructor.
        this.driver = driver;  // this keyword is used to call the instance members of the current class. 'this' means the object ref.
    }

    private By allItems = By.xpath("//div[@class='features_items']");
    private By everyItem = By.xpath("//div[@class='col-sm-4']");

    public void verifyAllProductsList() {

        WebElement allItemsDiv = driver.findElement(allItems); // here we have captured the outer Division
        List<WebElement> allItems = allItemsDiv.findElements(everyItem); // here we are capturing all
        // the items under the outer division.
        //  below we will iterate through all the elements
        for (WebElement element : allItems) {

            WebElement individualItem = element.findElement(By.xpath("//div[@class='overlay-content']"));

            System.out.println("Price::" + individualItem.findElement(By.tagName("h2")).getText()); // this is a descendant
            System.out.println("Item Name::" + individualItem.findElement(By.tagName("p")).getText()); // this is a descendant

            System.out.println("--------------------------------------------------");
        }


    }
}