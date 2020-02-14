Feature: Search for flights and book a one-way flying ticket

Scenario: Successful Login with Valid Credentials 
	Given User is on LogIn Page
	When User enters UserName as "admin" and Password as "12345" 
	Then Validate Login Successful
	
Scenario: Search for flights with multi city flying option
  Given User selects flying type
  Then User selects source location as "LA-US"
  Then User selects destination location as "NY-US" 
  Then User selects date of depart
  Then User selects date of return
  Then User selects two adults with premium economy class ticket
  When User clicks on search
  Then verify flights of "Los Angeles" to "New York City"
  
Scenario: Search for flights with one way flying option
  Given User selects flying type one way
  Then User select source location as "WDC-US"
  Then User select destination location as "LD-UK" 
  Then User selects depart Date
  Then User selects one adults with Business class ticket
  When User clicks on search
  Then verify booking flights of "Washington, D.C." to "London"
  Then User clicks third flight to Book and continue
  Then User verify details of journey summery "Washington, D.C. - London"
 
  