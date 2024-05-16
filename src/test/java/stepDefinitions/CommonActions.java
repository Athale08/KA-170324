package stepDefinitions;

import drivers.DriverFactory;
import enums.BrowserType;
import enums.ExecutionEnv;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;

import java.util.Properties;
/*
 * Author: Kishor Athale
 * Modules: CommonActions class
 * Changes: This class contains common actions methods which are applicable before and after a
 * script execution of automation exercise app
 */
public class CommonActions {

    private DriverFactory driverFactory;
    private ConfigReader configReader;
    private RemoteWebDriver driver;
    private Properties properties;


//new change is done
    // more changes are made

    @Before
    public void openBrowser(){

       configReader = new ConfigReader();
       properties = configReader.getProperties();

       driverFactory = new DriverFactory();
     //  driver = driverFactory.init_Driver(properties.getProperty("env"), properties.getProperty("browser"));
        // now we will do the below using enum type
       driver = driverFactory.init_Driver(ExecutionEnv.valueOf(properties.getProperty("env").toUpperCase()), BrowserType.valueOf(properties.getProperty("browser").toUpperCase()));
       driver.get(properties.getProperty("appURL"));


    }
    @After
    public void tearDown(){

     driver.quit();

    }

}
