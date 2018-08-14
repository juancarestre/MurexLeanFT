Feature: Murex loggin
  I as a Murex client
  Want set my credentials
  To get logged on Murex java client

  @First
  Scenario Outline:  Open the murex client and get logged using username and password
    Given The Murex java cliente is already open
    When I set my <username> and my <password>
    Then I should get logged and see the Murex group list
    Examples:
      |username|password|
      |"USER1"|"PASS1"|
  @Second
  Scenario Outline: Enter to the <group>
    Given The Murex java cliente is already logged
    When I enter to <group>
    Then I should see the initial murex page logged as <user>
    Examples:
      | group | user |
      |"FO_TRD_BOG"| "USER1" |
  @Third
  Scenario Outline: search <ContractNumber> in TradeQuery page
    Given Im in the TradeQuery page
    When I search for <ContractNumber>
    Then I should see the trade with <ContractNumber> id
    Examples:
      | ContractNumber |
      | "USER1" |