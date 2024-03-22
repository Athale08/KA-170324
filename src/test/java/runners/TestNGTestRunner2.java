package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(

        features = {"src/test/resources/features/LoginTest.feature"},
        glue = {"stepDefinitions","CommonActions"},
        plugin = {"pretty",

                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

                "timeline:test-output-thread/"

        }


)
public class TestNGTestRunner2 extends AbstractTestNGCucumberTests {


    @DataProvider
    public Object[][] getScenarios(){
        return super.scenarios();
    }


}
