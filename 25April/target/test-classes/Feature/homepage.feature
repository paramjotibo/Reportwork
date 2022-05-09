Feature: user homepage contact section

Scenario: To check contact us option

Given Browser is invoked
And user is on homepage
When user clicks on contact us
Then new window pops up

@RegTest
Scenario: To enter names
Given Browser is invoked
And user is on homepage
When user clicks on contact us
Then new window pops up
And user enters the first name
And user enters the last name
And user hovers on support
And user clicks on helpcentre
