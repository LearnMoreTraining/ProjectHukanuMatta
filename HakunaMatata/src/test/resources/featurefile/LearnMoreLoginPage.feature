Feature: validate the login feature of learn more application

  #before
  @SC01
  Scenario: Login functionality with valid username
    #Given user should navigate to URL
    When user enter the user name "LearnMore" and password "learnmore@123"
    And user clicks the login button
    Then verify whether the user is login succefully

    #after


  #before
    @SC02
    Scenario: Validate the error message
      Given user should navigate to URL
      When user enter the user name "hello" and password "learnmore"
      And user clicks the login button
      Then validate the error
  #after

