Feature: Set a reservation as per the details provided

  Background: Make Sure Your Browser Is Open & You Are Always On mcsqaportal Page
    When user navigates to mcsqaportal url
    Then mcsqaportal website should be displayed

  @smoke
  Scenario: Login into Portal and set Reservation with a timeframe
    Given user enters username "aqa_KranthiRaj" in the ID
    When the user enters password "WeY4aS59VmEcffg" in the Password box
    When user clicks on login button
    Then user verifies the portal dashboard
    When the user clicks on Reservation from left panel
    When the user clicks on Calendar from Reservation
    When the user switches to 247 viewMode
    When the user selects All regions in region
