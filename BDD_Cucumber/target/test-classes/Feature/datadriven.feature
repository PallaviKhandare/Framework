Feature: testing testproject site

  Scenario Outline: validating credentials
    Given my user is on loginpage
    When user is entering "<uname>" & "<pwd>"
    Then clicks on login button
    And verifying the title

    Examples: 
      | uname   | pwd   |
      | Pallavi | 12345 |
      | Anmol   | 34567 |
      | Ajay    | 45678 |
