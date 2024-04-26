package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
 * Author: Kishor Athale
 * Modules: Home Page
 * Changes: This class contains verification and actions methods which are applicable at Home page of automation exercise app
 */
public class HomePage extends BasePage {

    public WebDriver driver;

    //tagName[@attributeName='attributevalue']

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    private By homePageTitle = By.xpath("//span[text()='Automation']");
    private By signUpLink = By.xpath("//a[@href='/login']");
    //private By allItems = By.xpath("//div[@class='features_items']");
    //private By everyItem = By.xpath("//div[@class='col-sm-4']");
    private By loggedInAs = By.xpath("//a[text()='Logged in as']");
    private By deleteAccount = By.xpath("//a[@href='/delete_account']");
    private By accountDeletedPage = By.xpath("//b[text()='Account Deleted!']");
    // Below we will create a specific method to assert verification
    public void assertHomePageElements() {
        verifyIsElementDisplayed(signUpLink); // this will verify if the element is displayed
        verifyElementText(signUpLink, "Signup / Login");  //this will assert that the text is as expected
        verifyIsElementDisplayed(homePageTitle);
    }
    public void assertLoginIsSuccessful(){
            verifyIsElementDisplayed(loggedInAs);

    }
    public void assertClickDeleteAccountButton(){
        clickElement(accountDeletedPage);
        verifyIsElementDisplayed(deleteAccount);
        verifyElementText(accountDeletedPage,"ACCOUNT DELETED");
    }
    // two methods need to be created for logged in as and delete account. Actions first and then assertions.
    // Below we will create a specific method to assert the action that we perform
    public void navigateToLoginPage(){

       /*WebElement allItemsDiv = driver.findElement(allItems); // here we have captured the outer Division
       List<WebElement> allItems = allItemsDiv.findElements(everyItem); // here we are capturing all the items under the outer division
//  below we will iterate through all the elements
       for(WebElement element : allItems){

           WebElement individualItem = element.findElement(By.xpath("//div[@class='overlay-content']"));

           System.out.println("Price::"+individualItem.findElement(By.tagName("h2")).getText()); // this is a descendant
           System.out.println("Item Name::"+individualItem.findElement(By.tagName("p")).getText()); // this is a descendant

           System.out.println("--------------------------------------------------");
       }*/



     verifyIsElementClickable(signUpLink); // this will assert that the element is enabled/active
        clickElement(signUpLink); // so after the above assertion then we are clicking on the element

    }









}
