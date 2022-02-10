@tag
Feature: Verify the login page

  @mytag
  Scenario: verify with correct username & correct password
   Given user in Demo aut login page
   When user enter correct username
   And user enter correct password
   And user click on login
   Then user redirected to homepage
