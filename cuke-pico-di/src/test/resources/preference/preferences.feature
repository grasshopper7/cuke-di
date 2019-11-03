Feature: User Preferences

  Scenario: Collect font, border details
    Given User at preference selection page
    When User selects font details
    | style  | courier |
    | color  | red     |
    | weight | bold    |
    When User selects border details
    | style  | dashed |
    | color  | orange |
    | width  | dark   |
    Then Confirm user selections
