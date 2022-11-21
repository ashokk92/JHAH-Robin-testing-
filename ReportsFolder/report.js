$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "administrator",
        "",
        "94L98adiAtmdH2Pcq36NMQ\u003d\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to login page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enters administrator and 94L98adiAtmdH2Pcq36NMQ\u003d\u003d",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});