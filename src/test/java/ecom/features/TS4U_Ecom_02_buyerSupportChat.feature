Feature: Support Chat

@User
Scenario: Buyer should succenssfully use the support chat

Given Buyer should navigate to the baseURL
When I click on the chat icon
And I click in the compose message box
And I type the query  
And I click send icon
Then Message should have sent successfully 