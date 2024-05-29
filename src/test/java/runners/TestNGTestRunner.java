package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
/*
 * Author: Kishor Athale
 * Modules:TestNGTestRunner class
 * Changes: This class contains source of the feature file,
 * which the user will use to trigger the execution of the feature file.
 */

@CucumberOptions(

        features = {"src/test/resources/features/TC12VerifySubscriptionOnCartPageTest.feature"},// here you add the source of the feature file you wish to run.
      //  features = {"src/test/resources/features/"} // when you want to run specific feature files
        glue = {"stepDefinitions","CommonActions"}, //source of stepdefinition and common actions
        plugin = {"pretty",

                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                "timeline:test-output-thread/" // plugin is the source which generates the extent reports.

        }
        //, give a comma after the plugin and write the below tags

     //   tags = "@Test1"   // so the feature files with @Test1 will run


)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {


    @DataProvider    // this annotation is used to get all the scenarios from the feature file that is provided in the source location
    public Object[][] getScenarios(){
        return super.scenarios();
    }  // here 'super' keyword is used to call the parent class constructor.


}
