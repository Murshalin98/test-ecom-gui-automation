Feature: Buyer search a product 

@User
Scenario Outline: Buyer seacrh a product by typing in seach bar

Given Buyer should navigate to the baseURL
And I click on search bar
And I enter seach "<item>" name
And I click on search icon
Then I should see the search item appear on the screen 

Examples:
|item|
|Mobile|
|Phone|