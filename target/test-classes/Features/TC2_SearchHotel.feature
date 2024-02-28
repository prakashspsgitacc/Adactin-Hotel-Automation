Feature: Verify adactin hotel search details

  Scenario Outline: Search adactin hotel with all fields
    Given User should be in the AdactinHotel login page
    When User should perform login "<username>","<password>"
    Then User should verify after login success message "Hello Prakashmnr1993!"
    And User should search hotel with all fields "<location>","<hotels>","<roomType>","<numOfRooms>","<checkInDate>","<checkOutDate>","<adultRoom>" and "<childRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | username       | password  | location | hotels       | roomType | numOfRooms | checkInDate | checkOutDate | adultRoom | childRoom |
      | Prakashmnr1993 | India@123 | London   | Hotel Hervey | Deluxe   | 1-One      | 03/01/2023  | 04/01/2023   | 2-Two     | 0-None    |
