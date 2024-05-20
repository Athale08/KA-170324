Feature: Validation of Contact Us Form

  Scenario Outline: Validate the Contact Us Form
    Given user launches the application
    And verify whether user is on home page with title as "Automation Exercise"
    And user click on contactus button
    And Verify "Get In Touch" is visible
    And user enters the "<name>" and "<email>" and "<subject>" and "<message>"
    And user click on the submit button
    And user click on the OK button inside the pop-up
    Then user should be able to view the success message confirmation as "Success! Your details have been submitted successfully."
    And user click on the Home button
    Then verify whether user is on home page with title as "Automation Exercise"

# Failure reasons
 # ====> getText() to be used only when element in the dom having text inside the tags eg: <p>We really appreciate your response to our website.<p>
 # ====> if the text is in between the dom elements then you would need to use getAttribute().trim()
 # ====> performing verify elements , all at one eg: verifying home page element , on contactus page
 # ====> wrong references taken in the
 # ====> when some value is being taken as reference in feature file , make use of mandatorily


    Examples:
    |name | |email| |subject| |message|
    |     | |     | |Good Morning|   |       |






 