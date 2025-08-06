Feature: Facebook Login

 Scenario Outline: Valid login redirects user to homepage
    Given user is on Facebook login page
    When user enters username and password
    Then user should be redirected to the homepage


    Examples:
    |user name|password|
    |jh       |97      |



