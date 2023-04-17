Feature: Login user

  @UI
  Scenario: Successful login user by UI
    Given The home page is opened
    When Click "Log In" button in the header
    When Input user email
    When Input user password
    When Click "Log In" button
#    Then Name in the header should be

#  Scenario: Successful login user by API
#    When Login user by API
