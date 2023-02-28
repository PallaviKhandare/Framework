Feature: testing testproject site

  Scenario: testing login functionality with DataTable
    Given user on login page
    When user enters username & password
      | Pallavi | 12345 |
    Then Clicks on login button
    And user enters personal info
      | Address | Pune          |
      | Email   | abc@gmail.com |
      | phone   |    9322185060 |
