Feature: Login user

  Scenario: Successful login user
    Then Click "Log In" button in the header
    Then Input user email
    Then Input user password
    Then Click "Log In" button
    Then Check name in the header

