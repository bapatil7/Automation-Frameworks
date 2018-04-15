Feature: Tools Qa Demo				 

@ignore
Scenario: Successful Login with Valid Credentials using dataTable
Given User is on Home Page
When User Navigate to LogIn Page
And User enters Credentials to LogIn
| testuser_1 | Test@153 |
Then Message displayed Login Successfully

Scenario: Successful Login with Valid Credentials using maps in datatable 
Given User is on Home Page
When User Navigate to LogIn Page
And User enters LogIn Credentials
| Username   | Password |
| testuser_1 | Test@153 |
| testuser_2 | Test@154 |
Then Message displayed Login Successfully


Scenario Outline: Successful Login with Valid Credentials using examples
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
Examples:
    | username   | password |
    | testuser_1 | Test@153 |
    | testuser_2 | Test@153 |
    


    