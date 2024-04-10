package appPages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactUsPage extends BasePage {

    public WebDriver driver; // create a constructor and webdriver

    public ContactUsPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
// locate the elements
    private By contactUsLink = By.xpath("//a[@href='/contact_us']");
    private By textName = By.xpath("//input[@data-qa='name']");
    private By textEmail = By.xpath("//input[@data-qa='email']");
    private By textSubject = By.xpath("//input[@data-qa='subject']");
    private By textMessage = By.id("message");
    private By submitButton = By.xpath("//input[@data-qa='submit-button']");



    // Below we will create a specific method to assert verification

    public void assertContactUsPageElements(){
        verifyIsElementDisplayed(contactUsLink);
        verifyElementText(contactUsLink, "Contact us");
        verifyIsElementDisplayed(textName);
        verifyIsElementDisplayed(textEmail);
        verifyIsElementDisplayed(textSubject);
        verifyIsElementDisplayed(textMessage);
        verifyIsElementDisplayed(submitButton);
        verifyElementText(submitButton, "Submit");
    }
    public void enterGetInTouchDetails(String name, String email, String subject, String message) {


        Faker faker = new Faker();

        verifyIsElementClickable(contactUsLink);   // assert the action
        clickElement(contactUsLink);

       // driver.findElement(textName).sendKeys(name + faker.name().name());

        verifyIsElementClickable(textName);   // assert the action
        inputInfo(textName, name + faker.name().name());

       // driver.findElement(textEmail).sendKeys(email + faker.name().firstName() + "kishoretraining123@gmail.com");

        verifyIsElementClickable(textEmail);   // assert the action
        inputInfo(textEmail, email + faker.name().firstName() + "kishoretraining123@gmail.com");

       // driver.findElement(textSubject).sendKeys(subject);

        verifyIsElementClickable(textSubject);  // assert the action
        inputInfo(textSubject, subject);

        //driver.findElement(textMessage).sendKeys(message + faker.letterify("HelloWorld"));

        verifyIsElementClickable(textMessage);  // assert the action
        inputInfo(textMessage, message + faker.letterify("HelloWorld") );


    }
    public void clickOnSubmitButton(){

        verifyIsElementClickable(submitButton);  // assert the action
        clickElement(submitButton);
    }



}
