$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Register and Login",
  "description": "As a PO\r\nI want to login ti application\r\nSo that verify login function work well",
  "id": "register-and-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login_register"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Register to application",
  "description": "",
  "id": "register-and-login;register-to-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "I click to register link",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I Click to Gender Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Input to First Name textbox with \"\u003cFristName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I  Input to Last Name textbox with \"\u003cLastName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Input to email textbox with data \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Input to password textbox with data \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Input to Confirm Password textbox:\"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify register successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I Click on \u0027Logout\u0027 button",
  "keyword": "When "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "register-and-login;register-to-application;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password",
        "FristName",
        "LastName"
      ],
      "line": 20,
      "id": "register-and-login;register-to-application;;1"
    },
    {
      "cells": [
        "automation@gmail.com.vn",
        "123456",
        "Abner",
        "Simba"
      ],
      "line": 21,
      "id": "register-and-login;register-to-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Register to application",
  "description": "",
  "id": "register-and-login;register-to-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login_register"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I click to register link",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I Click to Gender Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I Input to First Name textbox with \"Abner\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I  Input to Last Name textbox with \"Simba\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I Input to email textbox with data \"automation@gmail.com.vn\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I Input to password textbox with data \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Input to Confirm Password textbox:\"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I Click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Verify register successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I Click on \u0027Logout\u0027 button",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageSteps.iClickToRegisterLink()"
});
formatter.result({
  "duration": 10365110800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iClickToGenderRadioButton()"
});
formatter.result({
  "duration": 306656700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abner",
      "offset": 36
    }
  ],
  "location": "RegisterPageSteps.iInputToFirstNameTextboxWith(String)"
});
formatter.result({
  "duration": 116223300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Simba",
      "offset": 36
    }
  ],
  "location": "RegisterPageSteps.iInputToLastNameTextboxWith(String)"
});
formatter.result({
  "duration": 85475600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "automation@gmail.com.vn",
      "offset": 36
    }
  ],
  "location": "RegisterPageSteps.iInputToEmailTextboxWithData(String)"
});
formatter.result({
  "duration": 82262000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 39
    }
  ],
  "location": "RegisterPageSteps.iInputToPasswordTextboxWithData(String)"
});
formatter.result({
  "duration": 86109300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 37
    }
  ],
  "location": "RegisterPageSteps.iInputToConfirmPasswordTextbox(String)"
});
formatter.result({
  "duration": 107772900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 2774030800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.verifyRegisterSuccessfully()"
});
formatter.result({
  "duration": 78302500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.iClickOnLogoutButton()"
});
formatter.result({
  "duration": 1592463500,
  "status": "passed"
});
});