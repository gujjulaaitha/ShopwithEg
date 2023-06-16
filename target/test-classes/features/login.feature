Feature: verify user login

@login  @login1
Scenario: verify user login with valid credentials

Given user launches shopwitheg site
When user enters valid credentials
And user clicks on login button
Then user will be navigated to landing page

@login  @login2
Scenario: verify user login with invalid credentials
Given user launches shopwitheg site
When user enters invalid credentials
And user clicks on login button
Then user will be displayed with error message