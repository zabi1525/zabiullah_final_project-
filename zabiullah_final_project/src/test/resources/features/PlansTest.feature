Feature: Plans Page Test
@PlansPage_1
  Scenario: Validate 4 rows of data are present after navigating to plans page

    Given User clicks on login button
    When User fills form "supervisor" and "tek_supervisor"
    When User clicks on sign in option
    Then user navigates to plans page
    Then Validate 4 rows of data are present
@PlansPage_2
  Scenario: Validate creation and expiration date in plans page

    Given User press on login button
    Given User fills up form "supervisor" and "tek_supervisor"
    When User presses on sign in button
    When User navigates to plans page
    Then Validate creation date is today's date
    Then Validate expiration date is a day after