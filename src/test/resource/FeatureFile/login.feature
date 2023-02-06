Feature: Login test

  Scenario Outline: Login test of amazon
    Given User is on the login page
    When User enters the <username> and navigates to password page
    Then User lands on the home page

    Examples: 
      | username   |
      | Physics 12 |
