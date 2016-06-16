#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""
## (Comments)

#Sample Feature Definition Template
@tag
Feature: Title of your feature
	I want to use this template for my feature file

@tag1
Scenario: Login system  with incorrect data
Given I am on home page
When I input my account is "abc"
And click button Next
Then I should see alert message "Sorry, Google doesn't recognize that email."

@tag2
Scenario: Login system  with incorrect data (password empty)
Given I am on home page
When I input my account is "hongvank4b"
And click button Next
And click button signIn
Then Alert message is "Please enter your password."

@tag3
Scenario: Login system  with incorrect data (password incorrect)
Given I am on home page
When I input my account is "hongvank4b"
And click button Next
And I input password is "123456"
And click button signIn
Then Alert message is "The email and password you entered don't match."

