Feature: Functionalities for smoke test
  Scenario: Validate home page title and primary account button
    When Validate home page title is "TEK Insurance App"
    Then Validate create primary account button is exist