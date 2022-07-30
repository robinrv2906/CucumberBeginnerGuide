Feature: This Is The Login Feature 
Scenario Outline: This is an login 
	Given Go To Log In Page 
	When Enter "<userName>" and password "<password>" 
	And click  login button 
	
	Examples: 
		|userName|password|
		|Admin	 |admin123|
		|admin	 |admin13 |
