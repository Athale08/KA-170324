package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

    private By allItems = By.xpath("//div[@class='productinfo text-center']");

    private By viewOrder1 = By.xpath("//a[@href='/product_details/1']");
    private By everyItem = By.xpath("//div[@class='col-sm-4']");

    private By inputSearch = By.id("search_product");
    private By submitSearch = By.id("submit_search");
    private By pageTitle = By.xpath("//h2[@class='title text-center']");

    public void verifyAllProductsList() {


        List<WebElement> allProducts = driver.findElements(allItems); // here we are capturing all
        // the items under the outer division.
        //  below we will iterate through all the elements
        for (WebElement element : allProducts) {

            System.out.println("Price::" + element.findElement(By.tagName("h2")).getText()); // this is a descendant
            System.out.println("Item Name::" + element.findElement(By.tagName("p")).getText()); // this is a descendant

            System.out.println("--------------------------------------------------");
        }


    }


    public void clickOnViewOrderForFirstItem(){
     //   clickElementUsingJs(viewOrder1); getting ads right after this step hence using manual redirection
        driver.get("https://automationexercise.com/product_details/1");
    }

    public void searchProduct(String item){
        driver.findElement(inputSearch).sendKeys(item);
        driver.findElement(submitSearch).click();
    }


    public void verifySearchResultsTitle(String expectedTitle){
        verifyElementContainsText(pageTitle,expectedTitle);
    }
    public void verifySearchResults(String searchResult){

        List<WebElement> allProducts = driver.findElements(allItems);

        for (WebElement element : allProducts) {

          if(element.findElement(By.tagName("p")).getText().contains(searchResult)){
              Assert.assertTrue(true);
          }

          else{
             Assert.assertTrue(false);
          }

        }

    }
}