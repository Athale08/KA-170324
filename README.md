This project is a web browser automation framework built using Selenium WebDriver, Cucumber, and TestNG with Java. It is designed to automate scenarios on a sample "automation exercise" portal.

Technology Stack
This framework leverages a robust set of modern tools to enable efficient and scalable test automation:

Java: The primary programming language for implementing the test logic.

Selenium WebDriver: The core library for interacting with web browsers and automating user actions.

Cucumber: A BDD (Behavior-Driven Development) tool used for writing human-readable test scenarios in the Gherkin format.

TestNG: A powerful test execution framework used for writing test runner files, enabling the execution of Cucumber feature files and providing advanced features like parallel execution and reporting.

Maven: A build automation tool responsible for managing project dependencies, compiling source code, and running tests.

More Clarity: Maven simplifies the project setup by downloading all necessary libraries and plugins (.jar files) from a central repository. Instead of manually downloading each library, you simply list them in the pom.xml file. This ensures all team members use the same versions and makes the project portable and easy to manage.

Apache POI: A library used for data-driven testing. It allows the framework to read test data directly from Microsoft Excel workbooks (.xls or .xlsx), enabling the execution of the same test scenario with different data sets.

Extent Reports with Cucumber Adapter: A popular reporting library that generates visually appealing and detailed HTML test reports. The Cucumber Extent Adapter plugin seamlessly integrates Cucumber test results with Extent Reports.

More Clarity: This adapter translates Cucumber's BDD-style results (e.g., Given, When, Then steps) into a rich HTML report. The report includes crucial details like step-by-step execution status, screenshots on failure, and a summary of passed/failed tests, making it easier to analyze test runs.

Java Faker: A library used to generate realistic but random data (e.g., names, addresses, emails) for test scripts, which is particularly useful for scenarios that require unique user data to avoid conflicts.

Prerequisites and Versions
To set up and run this project, you need the following software installed:

Java Dev Kit (JDK): Version 11 or higher.

Maven: Version 3.6.1 or higher.

IntelliJ IDEA: The recommended Integrated Development Environment (IDE).

Project Structure
The project follows a standard Maven directory structure, which is organized to keep test code, resources, and configurations separate.

.github/Workflows
├── github-action-ci.yml                 # GitHub Actions YAML file for CI/CD

src/main
├── java
│   ├── drivers
│   │   └── DriverFactory.java            # Manages browser driver instances.
│   ├── appPages
│   │   ├── BasePage.java                 # Reusable methods (e.g., waits, common actions).
│   │   └── <ScreenName>Page.java          # Locators and methods for specific screens.
│   ├── utilities
│   │   ├── ConfigReader.java             # Reads data from config.properties.
│   │   ├── ExcelReader.java              # Reads data from Excel workbooks.
│   │   └── Constants.java                # Stores credentials for remote execution.
│   └── enums
│       └── DriverType.java               # Pre-defined browser types (e.g., CHROME, FIREFOX).
│       └── Env.java                      # Pre-defined environment types (LOCAL, REMOTE).
└── resources
    ├── config.properties                 # Main configuration file.
    └── log4j2.xml                        # Logging configuration.

src/test
├── java
│   ├── runners
│   │   └── TestRunner.java               # TestNG/JUnit runner class.
│   └── stepDefinitions
│       └── <StepDefinition>.java         # Implementation of Gherkin steps.
└── resources
    ├── TestData
    │   └── <TestData>.xlsx               # Excel files for data-driven tests.
    ├── features
    │   └── <FeatureName>.feature         # Cucumber feature files in Gherkin format.
    └── reports-config
        ├── cucumber.properties           # Cucumber reporting configurations.
        ├── extent-config.xml             # Customizes the Extent Report layout.
        └── extent.properties             # Configures the Extent Report output path.
Key Packages and Their Roles:
.github/Workflows: Contains GitHub Actions YAML files for Continuous Integration (CI). These files enable you to automatically execute your test suites in a cloud environment every time code is pushed to the repository. The workflow can be configured to use a Maven profile from the pom.xml, allowing for different test suites to be triggered.

src/main/java/drivers: This package contains the DriverFactory class.

More Clarity: The DriverFactory class is responsible for creating and managing a WebDriver instance. It uses the factory design pattern to create a driver (e.g., ChromeDriver, FirefoxDriver) based on the DriverType specified in the configuration. The framework's design enables parallel execution by ensuring that each test thread gets its own, independent WebDriver instance, preventing test interference and significantly reducing execution time.

src/main/java/appPages: Houses all the Page Object Model (POM) classes.

BasePage: A parent class that contains generic, reusable methods for interacting with the browser (e.g., click(), sendKeys(), waitForElement()).

<ScreenName>Page: Specific page classes for each screen of the application. They contain web element locators and methods that perform actions unique to that screen.

src/main/java/utilities: Contains utility classes for common tasks.

ConfigReader reads properties from config.properties.

ExcelReader reads data from Excel files for data-driven testing.

Constants is used to store and manage credentials for remote execution platforms like BrowserStack and SauceLabs.

src/main/java/enums: Contains enumerated types (enums) that provide a set of predefined, constant values, making the code more readable and less prone to errors. For instance, DriverType defines valid browsers (CHROME, FIREFOX), and Env defines execution environments (LOCAL, REMOTE).

src/test/java/runners: This package holds the runner classes (TestRunner.java) that serve as the entry point for test execution. These classes are annotated with @RunWith (for JUnit) or @Test (for TestNG) and contain all the necessary configurations, such as the path to feature files, step definition glue code, reporting plugins, and Cucumber tags.

src/test/java/stepDefinitions: Contains the glue code that connects the Gherkin steps in the feature files to the actual Java implementation. The methods in these classes call the appropriate methods from the appPages classes to perform the automation actions.

src/test/resources/features: This directory stores all the .feature files written in Gherkin syntax, which define the test scenarios in a BDD format.

src/test/resources/TestData: This folder is dedicated to storing Excel files that contain test data for data-driven scenarios.

src/test/resources/reports-config: This directory contains configuration files for reporting:

cucumber.properties: Configures the behavior of Cucumber, such as enabling or disabling report publishing to the Cucumber.io portal.

extent-config.xml: Allows for detailed customization of the visual layout and style of the Extent Report.

extent.properties: Defines the output path and file names for the generated Extent Reports after each test run.

Executing Tests
Tests in this framework can be executed in three primary ways:

1. From the IDE (IntelliJ IDEA)
Navigate to the src/test/java/runners package.

Right-click on a specific runner file (e.g., TestRunner.java).

Select "Run 'TestRunner'".

IntelliJ IDEA will execute the tests defined in the runner class.

2. Using a TestNG Suite XML File
Open the TestNGSuite.xml file located in the project's root folder.

This file defines which test classes (typically the runner files) should be executed as part of a suite.

Right-click the TestNGSuite.xml file and select "Run 'TestNGSuite.xml'".

3. Using Maven Commands
Tests can be executed from the command line, which is ideal for CI/CD pipelines.

Open your terminal or command prompt.

Navigate to the project's root directory.

Use the following command, replacing <ProfileName> with the profile ID defined in pom.xml:

Bash

mvn clean install -P<ProfileName>
Example: mvn clean install -PSmokeTest

This command will trigger the test suite associated with the specified Maven profile. The pom.xml contains profiles that link to different suite XML files, allowing you to run specific sets of tests (e.g., Smoke, Regression) with a simple command.

Remote Execution
This framework is equipped with remote execution capabilities, enabling you to run tests on cloud-based platforms like BrowserStack and SauceLabs.

To enable remote execution, modify the src/main/resources/config.properties file.

Set the value for env to remote.

Ensure the browser property is set to your desired browser (e.g., chrome).

You must also provide your BrowserStack or SauceLabs credentials in the src/main/java/utilities/Constants file.

With these changes, the framework's DriverFactory will automatically connect to the specified remote execution platform and run your tests in the cloud.
