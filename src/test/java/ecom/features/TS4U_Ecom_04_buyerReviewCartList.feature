Feature: Buyer Review Cart

@User
Scenario: Buyer should able to review his cart

Given Buyer should navigate to the baseURL
When I click on the cart icon
Then My item in the cart should be visible