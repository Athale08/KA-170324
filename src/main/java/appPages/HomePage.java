package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
 * Author: Kishor Athale
 * Modules: Home Page
 * Changes: This class contains verification and actions methods which are applicable at Home page
 * of automation exercise app
 */
public class HomePage extends BasePage {

    public WebDriver driver; // create a constructor and webdriver

       public HomePage(WebDriver driver) {
        super(driver);  // here 'super' keyword is used to call the parent class constructor.
        this.driver = driver;  // this keyword is used to call the instance members of the current class. 'this' means the object ref.
    }
// Locate the elements
    //tagName[@attributeName='attributevalue']
    private By homePageTitle = By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']");
    private By productsButton = By.xpath("//a[@href=\"/products\"]");
    private By testCasesButton = By.xpath("//a[contains(text(),'Test Cases')]");
    private By allProducts = By.xpath("//h2[@class=\"title text-center\"]");
    private By contactUsLink = By.xpath("//a[@href='/contact_us']");
    private By signUpLink = By.xpath("//a[@href='/login']");
    //private By allItems = By.xpath("//div[@class='features_items']");
    //private By everyItem = By.xpath("//div[@class='col-sm-4']");
    private By loggedInAs = By.xpath("//a[contains(text(),'Logged in as')]");
    private By deleteAccount = By.xpath("//a[@href='/delete_account']");
    private By accountDeletedPage = By.xpath("//b[text()='Account Deleted!']");
    private By continueButton2 = By.xpath("//a[@data-qa='continue-button']");
    private By logoutButton = By.xpath("//a[@href='/logout']");

    private By subscriptionText = By.xpath("//h2[text()='Subscription']");
    private By subscriptionInput = By.id("susbscribe_email");
    private By subscriptionButton = By.id("subscribe");
    private By subscriptionMessage = By.xpath("//*[text()='You have been successfully subscribed!']");

    private By cartLink = By.xpath("//a[@href='/view_cart']");

    // Below we will create a specific method to assert verification
    public void assertHomePageElements() {
        verifyIsElementDisplayed(signUpLink); // this will verify if the element is displayed
      //  verifyElementText(signUpLink, "Signup / Login");  //this will assert that the text is as expected
        verifyIsElementDisplayed(homePageTitle);
    }
    public void assertProductsPageElements(String expectedTitle) {
        verifyElementContainsText(productsButton, expectedTitle);
        verifyIsElementClickable(productsButton);
    }
    public void clickOnProductsButton(){

        driver.navigate().refresh();
       //clickElement(productsButton); //somehow this is not working , hence tried workaround below
        driver.get("https://automationexercise.com/products");
    }
    public void navigateToProductsPage(String expectedTitle){

        verifyElementContainsText(allProducts, expectedTitle);

    }
    public void clickOnTestCasesButton(){
        verifyIsElementDisplayed(testCasesButton);
        clickElement(testCasesButton);
    }
    public void clickOnContactUsButton(){
        verifyIsElementDisplayed(contactUsLink);
        clickElement(contactUsLink);
    }

    public void assertLoginIsSuccessful() {
        verifyIsElementDisplayed(loggedInAs);

    }
    public void assertLogoutIsSuccessful(){
        verifyIsElementDisplayed(logoutButton);
        verifyIsElementClickable(logoutButton);
        clickElement(logoutButton);
    }

    public void assertClickDeleteAccountButton() {
        clickElement(deleteAccount);
        verifyIsElementDisplayed(accountDeletedPage);

    }

    public void clickOnContinueButtonAfterDeletingAccount() {
        verifyIsElementClickable(continueButton2);
        clickElement(continueButton2);
    }
        // two methods need to be created for logged in as and delete account. Actions first and
        // then assertions.
        // Below we will create a specific method to assert the action that we perform
        public void navigateToLoginPage() {

       /*WebElement allItemsDiv = driver.findElement(allItems); // here we have captured the outer Division
       List<WebElement> allItems = allItemsDiv.findElements(everyItem); // here we are capturing all
       the items under the outer division.
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


    public void verifyHomePageTitle(String expectedTitle){

        assertTitle(expectedTitle);
    }

    public void scrollToSubscription(){
        scrollIntoView(subscriptionText);
    }


    public void verifySubscriptionText(String title){
        verifyElementText(subscriptionText,title);
    }
    public void enterEmailAndSubmit(String email){
        inputInfo(subscriptionInput,email);
        clickElement(subscriptionButton);
    }

    public void verifySuccessMessage(String message){
        verifyElementText(subscriptionMessage, message);
    }

    public void clickOnCart(){

        clickElement(cartLink);
    }


    }



