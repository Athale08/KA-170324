package drivers;


import enums.BrowserType;
import enums.ExecutionEnv;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import utilities.Constants;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
/*
 * Author: Kishor Athale
 * Modules: DriverFactory
 * Changes: This class contains WebDriver initialization methods for Local and Remote env which
 * are applicable to the automation exercise app
 */
public class DriverFactory {

    // parallel execution , thread safety( smooth running of code)
// To make the static WebDriver variable thread safe we will use the ThreadLocal Class in Java.
    public static ThreadLocal<RemoteWebDriver> driverRef = new ThreadLocal<>();

    // to access the driver from the thread local container, you need to 1st set the container
// with driver ref by using the set method and then get it by get method.
    public static synchronized RemoteWebDriver getDriver() {

        return driverRef.get();
    }


    // initialize the driver as below//
    //public RemoteWebDriver init_Driver(String executionEnv, String browserType) {  // this is a string type
    public RemoteWebDriver init_Driver(ExecutionEnv executionEnv, BrowserType browserType) { // this is using enum type
        try {
            if (executionEnv.equals(executionEnv.LOCAL)) {

                switch (browserType) {

                    case CHROME:
                        driverRef.set(new ChromeDriver());
                        break;
                    case FIREFOX:
                        driverRef.set(new FirefoxDriver());
                        break;
                    case EDGE:
                        driverRef.set(new EdgeDriver());
                        break;
                    case SAFARI:
                        driverRef.set(new SafariDriver());
                        break;
                    default:
                        System.out.println("The type of browser you provided is either incorrect ot not supported at the moment");
                        break;
                }

              /*  if (browserType.equalsIgnoreCase("Chrome")) {
                    driverRef.set(new ChromeDriver());

                } else if (browserType.equalsIgnoreCase("Firefox")) {

                    driverRef.set(new FirefoxDriver());

                } else if (browserType.equalsIgnoreCase("Edge")) {

                    driverRef.set(new EdgeDriver());

                } else if (browserType.equalsIgnoreCase("Safari")) {
                    driverRef.set(new SafariDriver());
                } else {

                    System.out.println("The type of browser you provided is either incorrect ot not supported at the moment");
                }*/

            } else {

                switch (browserType) {

                    case CHROME:
                        MutableCapabilities capabilities = new MutableCapabilities();
                        ChromeOptions options = new ChromeOptions();
                        options.addArguments("incognito");  // ChromeOptions for starting chrome in incognito mode

                        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                        capabilities.setCapability("browserName", "Chrome");
                        capabilities.setCapability("browserVersion", "latest");
                        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                        browserstackOptions.put("os", "OS X");
                        browserstackOptions.put("osVersion", "Monterey");
                        capabilities.setCapability("bstack:options", browserstackOptions);
                        String BS_URL = "https://" + Constants.BS_USERNAME + ":" + Constants.BS_ACCESSKEY + "@hub-cloud.browserstack.com/wd/hub";

                        driverRef.set(new RemoteWebDriver(new URL(BS_URL), capabilities));
                        break;
                    case FIREFOX:
                        FirefoxOptions browserOptions = new FirefoxOptions();
                        browserOptions.setPlatformName("Windows 11");
                        browserOptions.setBrowserVersion("latest");
                        Map<String, Object> sauceOptions = new HashMap<>();
                        sauceOptions.put("username", Constants.SAUCELABS_USERNAME);
                        sauceOptions.put("accessKey", Constants.SAUCELABS_ACCESSKEY);
                        sauceOptions.put("name", "<your test name>");
                        browserOptions.setCapability("sauce:options", sauceOptions);

                        URL SL_URL = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
                        driverRef.set(new RemoteWebDriver(SL_URL, browserOptions));
                        break;
                    case EDGE:
                        driverRef.set(new EdgeDriver());
                        break;
                    case SAFARI:
                        driverRef.set(new SafariDriver());
                        break;
                    default:
                        System.out.println("The type of browser you provided is either incorrect ot not supported at the moment");
                        break;

                }
            }


               /* if (browserType.equalsIgnoreCase("Chrome")) {

                    MutableCapabilities capabilities = new MutableCapabilities();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("incognito");  // ChromeOptions for starting chrome in incognito mode

                    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                    capabilities.setCapability("browserName", "Chrome");
                    capabilities.setCapability("browserVersion", "latest");
                    HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                    browserstackOptions.put("os", "OS X");
                    browserstackOptions.put("osVersion", "Monterey");
                    capabilities.setCapability("bstack:options", browserstackOptions);
                    String BS_URL = "https://" + Constants.BS_USERNAME + ":" + Constants.BS_ACCESSKEY + "@hub-cloud.browserstack.com/wd/hub";

                    driverRef.set(new RemoteWebDriver(new URL(BS_URL), capabilities));

                } else if (browserType.equalsIgnoreCase("Firefox")) {


                    FirefoxOptions browserOptions = new FirefoxOptions();
                    browserOptions.setPlatformName("Windows 11");
                    browserOptions.setBrowserVersion("latest");
                    Map<String, Object> sauceOptions = new HashMap<>();
                    sauceOptions.put("username", Constants.SAUCELABS_USERNAME);
                    sauceOptions.put("accessKey", Constants.SAUCELABS_ACCESSKEY);
                    sauceOptions.put("name", "<your test name>");
                    browserOptions.setCapability("sauce:options", sauceOptions);

                    URL SL_URL = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
                    driverRef.set(new RemoteWebDriver(SL_URL, browserOptions));

                } else if (browserType.equalsIgnoreCase("Edge")) {

                    driverRef.set(new EdgeDriver());

                } else if (browserType.equalsIgnoreCase("Safari")) {
                    driverRef.set(new SafariDriver());
                } else {

                    System.out.println("The type of browser you provided is either incorrect ot not supported at the momemt");
                }

            }*/

        } catch (Exception e) {
            e.printStackTrace();
        }


        getDriver().manage().window().maximize();
        //   getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return getDriver(); // here you are returning the WebDriver by using the getDriver() method.

    }

    // to check if the above is working we will create a main method and in that will create an object for DriverFactor class
    //so that we can access the init method using its ref. 'df'. Here we can directly use the getDriver method to access the methods.
    public static void main(String[] args) {
        getDriver();

        DriverFactory df = new DriverFactory();

    }


}
