Feature: Admin Add Category 

@Admin
Scenario: Admin should be able to add category successfully 

Given Admin should navigate to the admin URL
#When I enter admin credential email and password
When I click on login button
And I click on category button
And I click on add category button
And I enter category name 
And I click on upload image
And I click on library tab
And I select the picture 
And I click on select file to upload picture
And I click on add button
Then It should add a new category to the website  