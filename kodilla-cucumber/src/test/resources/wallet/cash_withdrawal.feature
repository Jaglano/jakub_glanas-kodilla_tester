Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When  I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Successful withdrawal of 0$ from a wallet in credit
    Given I have deposited $1000 in my wallet
    When I request $0
    Then $0 should be dispensed

  Scenario: Successful withdrawal of 5000$ from a wallet in credit
    Given I have deposited $1000 in my wallet
    When I request $5000
    Then $5000 should be dispensed