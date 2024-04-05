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



    public void navigateToLoginPage(){
//    verifyIsElementDisplayed(signUpLink); // this will verify if the element is displayed
//     verifyElementText(signUpLink, "Sign Up");  //this will assert that the text is as expected
//      verifyIsElementClickable(signUpLink); // this will assert that the element is enabled/active
        clickElement(signUpLink); // so after the above assertion then we are clicking on the element

    }



}
