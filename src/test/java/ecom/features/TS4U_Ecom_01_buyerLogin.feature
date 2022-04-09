Feature: Buyer Login

Scenario: Buyer should login successfully with valid credentials

Given Buyer should navigate to the baseURL
When I click on the user icon
And I enter the registered email address and password
And I click on the Log in button
Then I should be able to login successfully


