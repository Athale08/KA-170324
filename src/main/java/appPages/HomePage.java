package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    public WebDriver driver;

    //tagName[@attributeName='attributevalue']

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }



    private By signUpLink = By.xpath("//a[@href='/login']");
    private By allItems = By.xpath("//div[@class='features_items']");
    private By everyItem = By.xpath("//div[@class='col-sm-4']");
    // Below we will create a specific method to assert verification
    public void assertHomePageElements(){
    verifyIsElementDisplayed(signUpLink); // this will verify if the element is displayed
    verifyElementText(signUpLink, "Sign Up");  //this will assert that the text is as expected
    }
    // Below we will create a specific method to assert the action that we perform
    public void navigateToLoginPage(){

       WebElement allItemsDiv = driver.findElement(allItems);
       List<WebElement> allItems = allItemsDiv.findElements(everyItem);

       for(WebElement element : allItems){

           WebElement individualItem = element.findElement(By.xpath("//div[@class='overlay-content']"));

           System.out.println("Price::"+individualItem.findElement(By.tagName("h2")).getText());
           System.out.println("Item Name::"+individualItem.findElement(By.tagName("p")).getText());

           System.out.println("--------------------------------------------------");
       }



     verifyIsElementClickable(signUpLink); // this will assert that the element is enabled/active
        clickElement(signUpLink); // so after the above assertion then we are clicking on the element

    }



}
