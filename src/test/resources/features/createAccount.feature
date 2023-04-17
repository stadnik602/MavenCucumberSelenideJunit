Feature: Create account
  @UI
  Scenario: Successful create new user by UI
    Given The home page is opened
    When Open "sign-up" page
    When Click I'm a learner button
    When Input random email
    When Input first name
    When Input last name
    When Input user password
    When Click "Start learning" button
    Then Registration first name should be displayed in header
@UI
  Scenario: Check validation messages for all fields
    Given The home page is opened
    When Open "sign-up" page
    When Click "Start learning" button
    Then Validation error should be displayed below Email field
    Then Validation error should be displayed below First Name field
    Then Validation error should be displayed below Last Name field
    Then Validation error should be displayed below Password field
    Then Email validation message should be correct
    Then First Name validation message should be correct
    Then Last Name validation message should be correct
    Then Password validation message should be correct

    @API
  Scenario: Login for user whom was created by API
    When Create user by API
    Then Login user by API