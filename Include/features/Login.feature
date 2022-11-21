Feature: Login feature

  Scenario Outline: Test login with valid credentials
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button
    Then close the browser

    Examples: 
      | username      |  | password                 |
      | administrator |  | 94L98adiAtmdH2Pcq36NMQ== |
