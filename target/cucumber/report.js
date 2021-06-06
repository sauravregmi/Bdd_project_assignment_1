$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_Login.feature");
formatter.feature({
  "line": 2,
  "name": "validate Techfios login functionality",
  "description": "",
  "id": "validate-techfios-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    }
  ]
});
formatter.before({
  "duration": 1801943497,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the \"Techfios\" login page",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Techfios",
      "offset": 16
    }
  ],
  "location": "LoginStepDef.user_is_on_the_login_page(String)"
});
formatter.result({
  "duration": 2517364084,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "2 User should able to create a new account",
  "description": "",
  "id": "validate-techfios-login-functionality;2-user-should-able-to-create-a-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@scenerio2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user clicks on Bank and Cash",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user clicks on New Account",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user should land on Accounts page",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user should fill account title as \"Debit\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user should fill description as \"New Account\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user should fill initial balance as \"50,000\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user should fill account number as \"20079\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user should fill contact person as \"James bond\"",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user should fill phone number as \"78799988\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user should fill internet banking url as \"https://bofa.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user should click on submit button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDef.user_enters_username_as(String)"
});
formatter.result({
  "duration": 2146273894,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDef.user_enters_password_as(String)"
});
formatter.result({
  "duration": 2066203708,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 3347116578,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 1357338658,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_Bank_and_Cash()"
});
formatter.result({
  "duration": 1056197817,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_clicks_on_New_Account()"
});
formatter.result({
  "duration": 1596019524,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_should_land_on_Accounts_page()"
});
formatter.result({
  "duration": 1318848269,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Debit",
      "offset": 35
    }
  ],
  "location": "LoginStepDef.user_should_fill_account_title_as(String)"
});
formatter.result({
  "duration": 1094056672,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New Account",
      "offset": 33
    }
  ],
  "location": "LoginStepDef.user_should_fill_description_as(String)"
});
formatter.result({
  "duration": 1065941845,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50,000",
      "offset": 37
    }
  ],
  "location": "LoginStepDef.user_should_fill_initial_balance_as(String)"
});
formatter.result({
  "duration": 1071745786,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20079",
      "offset": 36
    }
  ],
  "location": "LoginStepDef.user_should_fill_account_number_as(String)"
});
formatter.result({
  "duration": 1065132528,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "James bond",
      "offset": 36
    }
  ],
  "location": "LoginStepDef.user_should_fill_contact_person_as(String)"
});
formatter.result({
  "duration": 1064753040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "78799988",
      "offset": 34
    }
  ],
  "location": "LoginStepDef.user_should_fill_phone_number_as(String)"
});
formatter.result({
  "duration": 1059531335,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://bofa.com",
      "offset": 42
    }
  ],
  "location": "LoginStepDef.user_should_fill_internet_banking_url_as(String)"
});
formatter.result({
  "duration": 1065547271,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_should_click_on_submit_button()"
});
formatter.result({
  "duration": 2015763505,
  "status": "passed"
});
});