Feature: Admin Add Product

@Admin
Scenario: Admin can add product from the admin's end

Given Admin should navigate to the admin URL
#When I enter admin credential email and password
When I click on login button
And I click on the products button
And I click on the create product

And I enter the product information and price

| Treadmill | 5 | 699.99 |

And I add product image
And I turn off free shipping option
And I click on save product button
Then I should add a product successfully