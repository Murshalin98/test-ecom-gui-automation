Feature: Admin Add Campaigns

@Admin
Scenario: Admin can add a campaign from the admin panel

Given Admin should navigate to the admin URL
#When I enter admin credential email and password
When I click on login button
And I click on campaign button
And I click on create new campaign
And I enter the campaign name
And I upload the campaign image
And I select the date for campaign
And I click on the create button
Then I should have a new campign in the website