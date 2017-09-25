$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myFeature.feature");
formatter.feature({
  "line": 1,
  "name": "dummy feature",
  "description": "",
  "id": "dummy-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "dummy scenario",
  "description": "",
  "id": "dummy-feature;dummy-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I navigate to the website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I populate the search criteria",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "submit the search",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I am on the result",
  "keyword": "Then "
});
formatter.match({
  "location": "SimpleTest.i_navigate_to_the_website()"
});
formatter.result({
  "duration": 3633779576,
  "status": "passed"
});
formatter.match({
  "location": "SimpleTest.i_populate_the_search_criteria()"
});
formatter.result({
  "duration": 600969079,
  "status": "passed"
});
formatter.match({
  "location": "SimpleTest.submit_the_search()"
});
formatter.result({
  "duration": 1385906494,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 2653053,
  "status": "passed"
});
});