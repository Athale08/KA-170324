
# WebBrowser Automation framework using cuucmber and TestNG

This Project is based on selenium webdriver with Cucumber & TestNG using Java language

Purpose
This project was developed to automate automation exercise portal scenarios, by using the below technology stack.

Java as programming language
Cucumber for writing BDD tests using gherkin format
TestNG for writing runner files that enables executing feature files
Maven as Build management tool
Apache POI for data driven testing using excel workbook as source
Cucumber extent adapter to enable the reporting
Java Faker library to generate random data for scripts


Prerequisites & Versions
Java 11 - Java Dev Kit
Maven 3.6.1 - Dependency Manager
IntelliJ IDEA - IDE

Project Structure

.github/Workflows: Contain GitHub action yaml files , to execute the scripts on cloud using GitHub actions , where the profile name has to be entered by the user in order to pick up the profile from pom.xml and execute accordingly.

src/main/java
        ------> drivers ---> This package contains   Driverfactory       class , which basically creates the driver instance , based on the driverType provided and enables parallel execution.
       
       
        ------> appPages ---> This package contains all screen classes , where locators and methods applicable at each screen will be implemnted here. Basepage is where all resuable methods will be created.
        ------> utilities  ---> This package contains utilities like ConfigReader and ExcelReader which are responsible for reading the inout from properties and .xls formats respectively. Constants file is where you can give/edit the access credentials of BrowserStack and SauceLabs.
        ------> enums      ---> enums package contain the set of predefined values i.e Constants to enable the Remote/Local execution and also the type of browser for execution.

src/main/resources ===> this package contains the config properties file , from where COnfigReader class fetch the data and utilises for the script execution.

 
 
 
 
 src/test/java
        --------> Runners ----> This package contains Runner files either by using Junit or TestNG with all the details of feature file path, stepDefintion reference , report plugin and Tags info.
        -------> StepDefinitions ----> This package contains the implementation for all the feature files created under src/test/resources/features ---> And in step defintions will use the source code designed in appPages.
 
 
 src/test/resources
       ------>TestData ---> This folder contains excel files , from where we fetch the test data
       ------> features ---> This folder contains all the feature files written in BDD format.
       -----> config files related to report generation
       ------> cucumber.properties ---> we can enable or disable publish reports on the cucumber io portal in this file.
       ------> extent-config.xml ---> changes related to layout , report name , mode and other report details can be configured here.
       ------>extent.properties ---> after each runner execution , where to store the reports are configured here.
 


Execute Tests:
1. Test scripts can be directly executed , by navigating to src/test/runners and select runner files and right click and run as TestNG or Junit file.
2. Script can be executed alternatively from suite files available at root folder TestNGSuite.xml , where the class file kept inside the suite file gets executed.
3. Scripts can be executed using command mvn clean install -P<<profileId from the pom.xml>> eg: mvn clean install -PSmokeTest ---> this will trigger the suite xml file under the profile ID and the runner file available under the suite File gets executed.



===> Additional Info
This frameowrk is equipped with Remote execution capabilities , to execute scripts on BrowserStack and SauceLabs. In order to execute on remote change the values under src/main/resources/confi.cpnfiguration.properties ===> value to be set for env is Remote so that execution will happen in remote . And make sure to set the browser value.
