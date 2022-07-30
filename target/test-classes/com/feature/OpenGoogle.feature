Feature: This is to test Google Search
Scenario:  Google search scenario
Given User is entering google.co.in
When user is typing the search term "Agniprasath"
And enters the return key
Then user should see the search result
