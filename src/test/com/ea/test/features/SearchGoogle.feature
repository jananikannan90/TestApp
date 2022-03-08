Feature: Search Google
  #This feature file is to check whether the Google returns the expected results

  Scenario Outline: Check whether search returns the expected results
    Given I search with the keyword <Keyword>
    Then Search results should have a link to <URL>

    Examples:
      | Keyword | URL              |
      | Maui    | maui.rentals.com |
      | Britz   | britz.com        |