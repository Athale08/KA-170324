package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * Author: Kishor Athale
 * Modules: Login Page
 * Changes: This class contains verification and actions methods which are applicable at login page of automation exercise app
 */
public class LoginPage extends BasePage {

    public WebDriver driver;

    //tagName[@attributeName='attributevalue']

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
// here we used the local and instance variable to share the driver across pages.This is setting up your constructor.
// now we will locate the elements by using 'By' class. But as we dont want it to be used outside this class we will make it private.
    private By textEmailAddress = By.xpath("//input[@data-qa = 'login-email']");
    private By textPassword = By.xpath("//input[@data-qa = 'login-password']");
    private By buttonLogin = By.xpath("//button[@data-qa = 'login-button']");

    private By loginLable = By.xpath("//h2[text()='Login to your account']");

    private By  signUpHeader = By.xpath("//h2[text()='New User Signup!']");
    private By invalidLoginInputValidationText = By.xpath("//p[text()='Your email or password is incorrect!']");



    public void verifyLoginElementsAndTexts(){
        verifyElementText(loginLable, "Login to your account"); //verify the label
        verifyAttributePlaceholderText(textEmailAddress,"Email Address"); //verify the hint text
        verifyAttributePlaceholderText(textPassword,"Password"); //verify the hint text
    }
    // Below we will create a specific method to assert verification

    public void assertLoginPageElements(){
        // verification for EmailAddress
        verifyIsElementDisplayed(textEmailAddress);
        verifyIsElementClickable(textEmailAddress);

        // verification for Password
        verifyIsElementDisplayed(textPassword);
        verifyIsElementClickable(textPassword);

        //verification for Login Button
        verifyIsElementDisplayed(buttonLogin);
        verifyElementText(buttonLogin, "Login");
    }
    // now we will create a method to open the login page and give two parameters.
    public void loginToApp(String email,String password){

        //driver.findElement(textEmailAddress).sendKeys(email);

        inputInfo(textEmailAddress, email);

        //driver.findElement(textPassword).sendKeys(password);

        inputInfo(textPassword, password);

        verifyIsElementClickable(buttonLogin);  // this is action assertion
        clickElement(buttonLogin);

    }

    public void checkTheSignUpTitle(String expectedTitle){

        verifyElementText(signUpHeader,expectedTitle);
    }
    public void verifyInvalidLoginInput(String expectedTitle){
        verifyIsElementDisplayed(invalidLoginInputValidationText);

    }




}
