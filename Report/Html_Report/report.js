$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature/OpenGoogle.feature");
formatter.feature({
  "line": 1,
  "name": "This is to test Google Search",
  "description": "",
  "id": "this-is-to-test-google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Google search scenario",
  "description": "",
  "id": "this-is-to-test-google-search;google-search-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is entering google.co.in",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is typing the search term \"Agniprasath\"",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enters the return key",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user should see the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenGoogleDef.user_is_entering_google_co_in()"
});
formatter.result({
  "duration": 17688637800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Agniprasath",
      "offset": 32
    }
  ],
  "location": "OpenGoogleDef.user_is_typing_the_search_term(String)"
});
formatter.result({
  "duration": 907836300,
  "status": "passed"
});
formatter.match({
  "location": "OpenGoogleDef.enters_the_return_key()"
});
formatter.result({
  "duration": 5276721800,
  "status": "passed"
});
formatter.match({
  "location": "OpenGoogleDef.user_should_see_the_search_result()"
});
formatter.result({
  "duration": 1464779100,
  "status": "passed"
});
});