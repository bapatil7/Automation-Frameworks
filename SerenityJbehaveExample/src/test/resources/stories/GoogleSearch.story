Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario:  1.selenium search operation
#Given browser is initialized
When user navigates to google page
And performs search with 'selenium'
Then valid search link is displayed

Scenario:  2.hsbc search operation
When user navigates to google page
And performs search with 'hsbc'
Then valid search link is displayed

Scenario:  3.selenium search operation with examples
When user navigates to google page
And performs search with is <searchText>					 
Then valid search link is displayed

Examples:     
|searchText|
|selenium|

Scenario:  4.selenium search operation with table
When user navigates to google page
And performs search with is <searchText>					 
Then valid search link is displayed

Examples:
test.table
