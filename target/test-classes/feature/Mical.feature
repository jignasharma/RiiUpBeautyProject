Feature: Open browser
@Test
  Scenario: user ope browser successfully
    Given user open browser
    When  user enter URL
    Then  user open browser successfully

  @Category

  Scenario Outline: user clicks on all category
    Given           user is on homepage
    When            user select "<category>"
    Then            user should be able to navigate "<related category page>"
    Examples:

             | category   | related category page |
             | About Us   | /pages/about-us       |
             | Shop       | /collections/all      |
             | Shipping   |  /pages/shipping       |
             | Returns    | /pages/returns         |
             | Contact Us | /pages/contact-us      |




