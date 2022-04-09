Feature: Order Product

	Scenario: Buyer order a product successfully
		Given Buyer should navigate to the baseURL
		When I login with my user credentials
		And I click on Mens Fashion catagory
		And I click on a item
		And I click on Buy Now button
		And I click on Continue to shipping button
		And I click on Add New Address button to add delivery address
		And I enter all input address fields
		| Murshalin Ridoy | 123 Downtown | 10007 | NY | New York | 123456789 |
		And I click on create button
		And I click on radio button to set primary address
		And I click on Continue to payment button
		And I select a payment method
		And I click on confirm order button
		And I enter transaction id
		And I click on confirm button
		Then I should see "Print Invoice" button
		When I logout from the application