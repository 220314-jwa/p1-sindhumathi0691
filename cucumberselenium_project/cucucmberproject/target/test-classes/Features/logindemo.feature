Feature: Test login functionality

  Scenario Outline: Check login is ssuccessful with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login 
    Then user is navigated to the homepage

 Examples:
 
|username| password|
|sindhudinesh1991@gmail.com | Ab123456|
|sindhumathi219@revature.net| ABc12345|