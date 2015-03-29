Feature: About Testers

In order to get a high paid job
As a Tester
I want to learn Automation

Scenario Outline: I am a Manual Tester
Given I am a "<testerType>" Tester
When I apply for a job
Then I got a "<jobType>" paid job
And I am "<satsifactionLevel>" satisfied with my salary
But my parents are "<parentsSatsisfactionLevel>" satisfied

Examples:
|   testerType    |    jobType     |     satsifactionLevel     |     parentsSatsisfactionLevel    |
|   Manual        |    less        |     not                   |     average                     |
|   Automation    |    high        |     very                  |     highly                      |