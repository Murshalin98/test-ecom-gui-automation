Feature: Update Address

	Scenario: Buyer Should Update Address succesfully
	
		Given Buyer should navigate to the baseURL
#		When I login with my user credentials
		And I click on the burger icon
		And I click on my account
		And I click on the Address
		And I click on new Address
		And I enter all input address fields
		| Murshalin Ridoy123 | 890 Downtown | 10507 | NY | New York | 12349986789 |
		And I click on create button
		Then I click on the edit Icon
		And I enter my new Addresses
		| Murshalin 123 | 1190 Downtown | 12507 | NY | New York | 0099986789 |
		And I click on Update button
		Then I click on delete icon
		Then I quite browser
		