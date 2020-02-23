Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://www.facebook.com/"
    Then Page Title should be "Facebook - Log In or Sign Up"
    And User enters FirstName as "Harika" and LastName as "Jetpoluru"
    And close browser
