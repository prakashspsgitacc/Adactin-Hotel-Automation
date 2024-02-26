Feature: AdactinHotel login fuctionality validation

  Scenario Outline: AdactinHotel login valid credentials testing
    Given User should be in the AdactinHotel login page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Prakashmnr1993!"

    Examples: 
      | username       | password  |
      | prakashmnr1993 | India@123 |

  Scenario Outline: AdactinHotel login with invalid credentials testing
    Given User should be in the AdactinHotel login page
    When User should perform login "<username>","<password>"
    Then User should verify after login invalid credential error message contains "Invalid Login details or Your Password might have expired. "

    Examples: 
      | username       | password |
      | prakashmnr1993 | india23  |
