Feature: Bike Store Tests
  @bb-bikeCount
  Scenario: Count total bikes on bike store page

    Given I have navigated to the Bike store page "http://localhost:8000/"
    When I count the number of bikes
    Then the total number of bikes are displayed

##########################################################################################################################################################################################################################################
  @bb-bikeInformation
  Scenario: Display all the bike informarion includig name, Description and class

    Given I have navigated to the "Bike store" page
    When I check the informarion of bike "number"
    Then the bike name, bike description, bike class are displayed

  Examples:
  | number|
  | 1|
  | 2|
  | 3|
  | 4|
  | 5|
  | 6|
  | 7|
  ##########################################################################################################################################################################################################################################
  @bb-bikeSorting
  Scenario: Display all the bike according to the sorting order

    Given I have navigated to the "Bike store" page
    When I filter the bikes page by ''filter1"
    Then the filtered bikes name, bikes description, bikes class are displayed

  Examples:
  | filter1|
  | endurance|
  | Race|
  | Class|
 ##########################################################################################################################################################################################################################################
