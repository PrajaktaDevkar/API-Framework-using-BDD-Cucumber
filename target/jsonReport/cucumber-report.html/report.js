$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/placeValidation.feature");
formatter.feature({
  "name": "Validate place API\u0027s",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify if place is sucessfully added using AddPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "name": "Add place payload with \"\u003cname\u003e\" \"\u003clanguage\u003e\" \"\u003caddress\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User call \"AddPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API code is sucess with the status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify place_Id created map to \"\u003cname\u003e\" using \"GetPlaceAPI\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "language",
        "address"
      ]
    },
    {
      "cells": [
        "AAhouse",
        "English",
        "world cross center"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if place is sucessfully added using AddPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "name": "Add place payload with \"AAhouse\" \"English\" \"world cross center\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.add_place_payload_with(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User call \"AddPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_call_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API code is sucess with the status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_code_is_sucess_with_the_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify place_Id created map to \"AAhouse\" using \"GetPlaceAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verify_place_Id_created_map_to_using(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if delete place functionality is working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DeletePlace"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Delete place payload",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.delete_place_payload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User call \"DeletePlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_call_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API code is sucess with the status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_code_is_sucess_with_the_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
});