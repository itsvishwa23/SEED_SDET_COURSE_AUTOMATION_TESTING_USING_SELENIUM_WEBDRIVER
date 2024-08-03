Feature: Google Search

  # Scenario: Test Google Home Page
  #   Given the user opens the www.google.com application
  #   When the user captures the Google title
  #   Then validate the Google application
  Scenario: Search for Pune and validate the URL
    Given the user opens the Google application
    When the user searches for "Pune"
    Then the URL should contain "pune"
