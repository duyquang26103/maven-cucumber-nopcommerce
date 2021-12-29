@login_register
Feature: Register and Login
  As a PO
  I want to login ti application
  So that verify login function work well

  Scenario Outline: Register to application
    Given I click to register link
    And I Click to Gender Radio Button
    And I Input to First Name textbox with "<FristName>"
    And I  Input to Last Name textbox with "<LastName>"
    And I Input to email textbox with data "<Email>"
    And I Input to password textbox with data "<Password>"
    And I Input to Confirm Password textbox:"<Password>"
    And I Click on Register button
    Then Verify register successfully
    When I Click on 'Logout' button

    Examples:
      | Email                   | Password | FristName | LastName |
      | automation@gmail.com.vn | 123456   | Abner     | Simba    |