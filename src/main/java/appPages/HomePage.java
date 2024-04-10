package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public WebDriver driver;

    //tagName[@attributeName='attributevalue']

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }



    private By signUpLink = By.xpath("//a[@href='/login']");
    // Below we will create a specific method to assert verification
    public void assertHomePageElements(){
    verifyIsElementDisplayed(signUpLink); // this will verify if the element is displayed
    verifyElementText(signUpLink, "Sign Up");  //this will assert that the text is as expected
    }
    // Below we will create a specific method to assert the action that we perform
    public void navigateToLoginPage(){

     verifyIsElementClickable(signUpLink); // this will assert that the element is enabled/active
        clickElement(signUpLink); // so after the above assertion then we are clicking on the element

    }



}
