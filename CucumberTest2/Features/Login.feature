#Author: aravind.balaji009@gmail.com
#Keywords Summary : Facebook testing

@tag
Feature: Login
  I want to use this template for my feature file

  @tag1
  Scenario: Login button visbile
    Given Browser is Started
    And User is on Facebook page
    Then Login button should be visible and clickable
    
   @tag2
   Scenario: User taken to login page
   Given User is on Facebook page already
   And User clicks on login button
   Then User should be taken to login page
   
   @tag3
   Scenario: Succesful login
   Given User gives valid user name and password
   And Clicks on login button
   Then User should be taken to homepage

