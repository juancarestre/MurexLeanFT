Feature: Murex loggin
  I as a Murex client
  Want set my credentials
  To get logged on Murex java client

  Scenario Outline: : Open the murex client and get logged using username and password
    Given The Murex java cliente is already open
    When I set my <username> and my <password>
    Then I should get logged and see the Murex group list
    Examples:
      |username|password|
      |"USER01"|"USER01"|
