Feature: Add to cart Summer dresses
  In order to be redirect to Authentication create Account and sign in Page
  As a user on a retail website
  I want to add any summer dresses to cart and proceed to checkout

  Scenario: Add product to Cart
    Given a user navigate to Automation practice site
    When a user click on Dresses
    And a user click on Summer dresses
    And a user click on any dresses
    And a user select any Size for the dress
    And a user click on any colour
    And a user click on Add to cart button
    Then Item is added to cart and a successful message is displayed
    And a user click on proceed to checkout button
    And a user also click on proceed to checkout button on the shopping cart page
    Then the user is redirect to Authentication create Account and sign in Page
