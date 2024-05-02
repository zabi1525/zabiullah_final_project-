Feature:Create New Account Test

  Scenario: Validate form title of create account page
    When User clicks on create primary account button
    Then Validate form page title "Create Primary Account Holder"
@CreateAccount_1
    Scenario: Fill up the form and create new account using map data table
      Given User clicks on create primary account button
      When User fills up the form
      |email           |novazee800@gmail.com|
      |firstName       |Nova                |
      |gender          |Male                 |
      |employmentStatus|student              |
      |title           |Mr.                  |
      |lastName        |zee               |
      |maritalStatus   |Single               |
      |dateOfBirth     |03-08-2000           |
      When user clicks on create account button
      Then Validate user navigates to sign up your account page
      Then Validate email shows as expected on the page

  @CreateAccount_2
  Scenario: Validate account creation with existing email address using map data table
    Given User navigates to account creation page
    When user fills up the form with existing credentials
      |email           |nedazer327@gmail.com|
      |firstName       |Nova                |
      |gender          |Male                 |
      |employmentStatus|student              |
      |title           |Mr.                  |
      |lastName        |zee               |
      |maritalStatus   |Single               |
      |dateOfBirth     |05-24-2000           |

    Then click on create account button


