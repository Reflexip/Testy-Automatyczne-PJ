Scenario: User change page to registration
 
Given user is on Home page
When user opens Registration link
Then Registration page is shown

Given user is on Registration page
When user fills name
When user fills login
When user fills password
When user confirms password
When user fills email
When user confirms email
When user uncheck advertising
When user agree terms and conditions
When user click submit button

Scenario: User search game

When user fills search field
When user click search button
Then Game page is shown

Given user is on Game page
When user click add to basket
Then basket page is shown

Given user is on Basket page
When user removing item
When user go home page
Then Home page is shown