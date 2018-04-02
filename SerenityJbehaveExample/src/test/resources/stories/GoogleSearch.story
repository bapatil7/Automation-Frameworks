#Meta:
#@smoke

Narrative:
In order to verify google search functionality

Scenario: Google search operation

Given user is logged on
When user navigates to google page
And performs search with 'selenium'
Then valid search link is displayed

