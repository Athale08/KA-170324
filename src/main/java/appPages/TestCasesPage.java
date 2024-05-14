package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * Author: Kishor Athale
 * Modules: Test Cases Page
 * Changes: This class contains verification and actions methods which are applicable at Test cases page
 * of automation exercise app
 */
     public class TestCasesPage extends BasePage {

     public WebDriver driver; // create a constructor and webdriver

    public TestCasesPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // locate the elements
    private By testCaseButton = By.xpath("//a[normalize-space()='Test Cases']");
    private By testCaseTitle = By.xpath("//b[normalize-space()='Test Cases']");


    // Verification method to assert all elements available on this page

    public void assertTestCasePageElements(){

        verifyIsElementDisplayed(testCaseButton);
        verifyElementText(testCaseTitle, "TEST CASES");

    }

    public void clickOnTestCaseButton(){
        verifyIsElementClickable(testCaseButton);
        clickElement(testCaseButton);
    }

}
