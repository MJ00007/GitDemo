Feature: Login to Bank app


@Sanitytest
Scenario Outline: User should be able to login to bank page

Given: User is on Gmail page

When User provides "<Username>" and "<Password>"

Then User should be able to land on bank app

And User should see welcome page

Examples:
|Username|Password|
|mannojrathod789|Rathod|
