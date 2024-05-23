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
    private By testCaseButton = By.xpath("//a[@href='/test_cases']");
    private By testCaseTitle = By.xpath("//b[contains(text(),'Test Cases')]");


    // Verification method to assert all elements available on this page

    public void assertTestCasePageElements(String expectedTitle){

        verifyElementContainsText(testCaseButton,expectedTitle);
        verifyIsElementClickable(testCaseButton);


    }
    public void clickOnTestCaseButton(){
        clickElement(testCaseButton);

    }
    public void verifyTestCasesHeader(String expectedTitle){
        verifyElementContainsText(testCaseTitle, expectedTitle);

    }

}
