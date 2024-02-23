Feature: Automating Spicejet.com

  @Spicejet
  Scenario: Extract the dropdown values
    # Given user should navigate to URL
      When user extract the currency dropdown values

    @dynamic
  Scenario: dynamic dropdown
    Given user select the from and to value

      @Table
  Scenario: Table handling
    Given handle the table
