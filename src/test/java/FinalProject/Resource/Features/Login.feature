
@Important
Feature: Making a purchase from a registered user

    Scenario: End to end process of login and making a purchase
      Given I am on the login page
      When I input valid credentials and click the Login button
      And I click on the backpack button Add to cart
      And I proceed to checkout
      And enter my data in the requested fields
      Then I should be able to finish the purchase
      And I could see a confirmation message
