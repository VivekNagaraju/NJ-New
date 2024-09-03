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
Feature: API Testing sceanrios

  #@APITestPOSTMethod
  #Scenario: Validate the creation of user
    #When I send a POST request with user details
    #Then New user has to be created with the specified details

  @APITestPOSTMethodDDT
  Scenario Outline: Validate the creation of user
    When I send POST request with user details as "<name>" and "<job>"
    Then the status code should be 201
    And the response body should contain name as "<name>" and job as "<job>"

    Examples: 
      | name  | job     |
      | vivek | trainer |
      
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
