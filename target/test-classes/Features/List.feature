Feature: To validate the login functionality

Scenario: To verify the login functionality with valid username and password

Given user has to Launch Fb and hit it

When user has to enter the username and password
|Praveen|Srikanth|1234|12-05|

And Click the login button

Then user unable to enter the  homepage
