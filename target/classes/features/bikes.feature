Feature: Bike Store Tests
  @bb-bikeCount
  Scenario: Count total bikes on bike store page

    Given I have navigated to the Bike store page "http://localhost:8000/"
    When I count the number of bikes
    Then the total number of bikes on the page are verified

##########################################################################################################################################################################################################################################
  @bb-bikeInformation
  Scenario Outline: Display all the bike information including name, Description and class

    Given I have navigated to the Bike store page "http://localhost:8000/"
    When I click the information of "<bikeNumber>"
    Then I check the bike name, bike description, bike class of "<bikeNumber>" are displayed

  Examples:
  | bikeNumber|
  | 1|
  | 2|
  | 3|
  | 1|
  | 4|
  | 5|
  | 6|
  | 7|


  ##########################################################################################################################################################################################################################################
  @bb-bikeSorting
  Scenario Outline: Display all the bike according to the sorting order

    Given I have navigated to the Bike store page "http://localhost:8000/"
    When I filter the bikes page by "<filter1>","<filter2>","<filter3>"
    Then I verify that the bikes are sorted based on bike class "<filter1>","<filter2>","<filter3>"

  Examples:
  | filter1|filter2|filter3|
 | endurance|     |       |
  | race     |     |       |
  | comfort  |     |       |
  |endurance|race|     |
  |race     |comfort|  |
  |endurance|comfort|  |
  |endurance|comfort|race|
 ##########################################################################################################################################################################################################################################
