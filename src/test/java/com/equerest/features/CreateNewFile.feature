@LoginProfile
  Feature: Login Profile
    As an employee of the company
  I want to login my employee profile using my credentials
  In order to collaborate with my colleagues

  Background: User navigates to COmpany home page
    Given I am on the "Company home" page on URL "www.mycompany.com"
    Then I should see "Log In as Employee" message

    Scenario: Successful login
      When I fill in "Username" with <username>
      And I fill in "Password" with <password>
      And I click on the "Login" button
      And I should see "<warning>" message

