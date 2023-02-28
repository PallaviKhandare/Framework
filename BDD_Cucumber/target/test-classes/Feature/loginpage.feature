Feature: testing testproject site

  Scenario: testing login functionality
    Given user on loginpage
    When user enters username
    And user enters password
    And user clicks on login
    And verify the title
