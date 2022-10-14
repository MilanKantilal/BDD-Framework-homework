Feature: Nopcommerce User Registration

  Background:
  Given User should able to open browser
    And Enter URL

    Scenario: Nopcommerce valid Register Test
     When User click on the register link
     Then User should be on register page
     And Verify register page title

     Then User should be able to select gender male or female
     Then User should able enter firstname and lastname
     Then User should abele to select date of Date of BirthDay,BirthMonth and BirthYear
     Then User enter valid email address

     Then User enter company name
     Then User able to tick the Newsletter tick-box
     Then User enter the password

      And User enter the password to confirm
      And User finally able to click on register button
      And User should be on register successfully
      Then User can close the browser



