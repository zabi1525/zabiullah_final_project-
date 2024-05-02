
Feature: Accounts Page Test
  Background:
    Given User Clicks on login button
    Given User Fills out the login form "supervisor" and "tek_supervisor" and sign in
    When User Navigates to Customer Service Portal and clicks on Account button

  Scenario: Validate Accounts Page behavior
    Then Validate five row or page is default


    Scenario: Validate data in page ten in accounts page

      When User changes show per page to ten
      Then Validate table records of page ten


  Scenario: Validate data in page twenty-five in accounts page

    When User changes show per page to twenty-five
    Then Validate table records of page twenty-five

  Scenario: Validate data in page fifty in accounts page

    When User changes show per page to fifty
    Then Validate table records of page fifty





