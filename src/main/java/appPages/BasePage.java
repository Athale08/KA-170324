 package appPages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(By by) {
        driver.findElement(by).click();
    }

    public void clickElementUsingJs(By by) {
        WebElement element = driver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void inputInfo(By by, String input) {
        driver.findElement(by).sendKeys(input);
    }

    public void dropDownElement(By by, String value) {
        Select dropDown = new Select(driver.findElement(by));
        dropDown.selectByVisibleText(value);
    }

    // The below method can be used to handle Simple and Confirmation Alerts
    public void handleAlert(String decision) {
        Alert alert = driver.switchTo().alert(); // here we are ca[turing the alert by using Alert class in Selenium
        if (decision.equals("accept")) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }

    // To handle Prompt Alerts the below method is used
    public void handlePromptAlert(String input, String decision) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(input);

        if (decision.equals("accept")) {
            alert.accept();
        } else {
            alert.dismiss();
        }
    }
        // To handle iframes the below 2 methods are used
        public void handleFrame (String value){   // enter the outerframe
            driver.switchTo().frame("value");  // provide the Id or name
// now you can perform any actions like sendkeys, clicks etc
        }
        // to navigate back to the outer frame use the below method

        public void navigateBack (String value){
            driver.switchTo().defaultContent();
        }
// To handle multiple windows( 2 windows=parent and child) we will use the below methods
        public void switchToChildWindow () {
            String parentWindow = driver.getWindowHandle();  // window A
            //action that will trigger additional window

            Set<String> windows = driver.getWindowHandles();  // this will store all the open windows. Each window will have a unique id hence this is stored in Set<String>
// so to navigate to the child window we will traverse through all the windows and put a negative condition as below# windows A, B

            for (String window : windows) {
                if (!window.equals(parentWindow)) {  // NOT(!) operator is used to negate the condition so that you can navigate to child window- false of false is True

                    driver.switchTo().window(window); // this will switch to the child window
                }
                driver.switchTo().window(parentWindow); // this will bring you back to the parent window

            }


        }
        // to handle more than 2 windows where there more than 2 child windows to handle, the unique Title of each wndow is used
        public void handleMultipleWindows(String title){
        String parentWindow1 = driver.getWindowHandle();
            Set<String> windows1 = driver.getWindowHandles();
        for(String window:windows1){
            driver.switchTo().window(window);
            if(driver.getTitle().equals(title)){
                // here inside the if block you can perform the actions and once done, navigate back to the parent window.
                // so if needed you can again switch to another child window by using the title reference
                driver.switchTo().window(parentWindow1);
            }
        }
// new chanege
        }


    }
