
Feature: the user make a booking

  Scenario: the user make a correctly booking without use additional information
    Given that a user chose 6-Days-Around-Thailand option from the home page
    And select the option booking now
    And confirm the booking
    When select the option to pay in arrived
    Then can see the corrrectly status is Your booking status is Reserved
