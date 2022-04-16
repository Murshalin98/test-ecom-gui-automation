Feature: Admin Login

@Admin
Scenario: Admin should login successfully from admin URL

Given Admin should navigate to the admin URL
#When I enter admin credential email and password
When I click on login button
Then I should be login in successfully
