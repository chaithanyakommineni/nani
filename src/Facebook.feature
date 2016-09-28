#Author: kommineni chaithanya

@tag
Feature: Functionality of Facebook

@tag1
Scenario: Login Functionality of Facebook
Given open browser as "firefox" And enter url as "https://www.facebook.com/"
When user enter valid username and valid password
|chaitu9655@gmail.com|chaitu965@gmail.com|
|chaitu9655@gmail.com|chaitu9655@gmail.com|
|chaitu9655@gmail.com|chaitu9655@gmail.com|
|chaithanya@gmail.com|chaithanya06193@gmail.com|
Then successfully login to facebook
