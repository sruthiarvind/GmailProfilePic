Feature: photo uploading
  As user 
  I want to be able to go to gmail page
  So that i can upload a photo in the gmail page

  Background: 
    Given I am on gmail home page
    When I populate login details

  Scenario: login in to gmail
    Then I check page title is inbox

  @wip
  Scenario: changing photo
    * I am on inbox page
    * I click on change photo
    Then I must be able to upload a photo
