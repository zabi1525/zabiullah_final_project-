Feature: User Profile Test
@UserProfile_1
  Scenario: Validate user profile information in profile page using map data table

    Given user navigates to login page and enter valid CSR credential
    |username|supervisor    |
    |password|tek_supervisor|
    When user clicks on profile button
    Then Validate user profile information
    |status     |Active    |
    |User Type  |CSR       |
    |Full Name  |Supervisor|
    |UserName   |supervisor|
    |Authorities|admin     |
  @UserProfile_2
  Scenario: Validate login and logout functionality using map data table
    Given User navigates to login page and provide valid credentials
    |username|supervisor    |
    |password|tek_supervisor|

    When User clicks on sign in
    Then User clicks on profile button then logout button
    Then Validate user is taken back to home page after success logout