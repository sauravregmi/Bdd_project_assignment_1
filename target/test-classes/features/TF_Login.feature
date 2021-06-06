@LoginFeature 
Feature: validate Techfios login functionality 

Background: 
	Given User is on the "Techfios" login page 
@scenario1 @smoke 
Scenario: 1 User should be able to login with the valid credentials 
	When user enters username as "demo@techfios.com" 
	When user enters password as "abc123" 
	And user clicks on signin button 
	Then user should land on Dashboard page 
@scenerio2 
Scenario: 2 User should able to create a new account 
	When user enters username as "demo@techfios.com" 
	When user enters password as "abc123" 
	And user clicks on signin button 
	Then user should land on Dashboard page 
	When user clicks on Bank and Cash 
	And user clicks on New Account 
	Then user should land on Accounts page 
	Then user should fill account title as "Debit"   
	Then user should fill description as "New Account" 
	Then user should fill initial balance as "50,000"
	Then user should fill account number as "20079" 
	Then user should fill contact person as "James bond"                  
	Then user should fill phone number as "78799988"
	Then user should fill internet banking url as "https://bofa.com"        
	And user should click on submit button 
	
	
    