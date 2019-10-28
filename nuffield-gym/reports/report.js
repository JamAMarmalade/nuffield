$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userSearchesNearestGym.feature");
formatter.feature({
  "name": "Search postcode",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I search my postocde",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to the website \"https://www.nuffieldhealth.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchSteps.i_go_to_website(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Gym tab\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_click_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I find and click on the link \"join a gym\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_find_and_click_on_the_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input \"SE1 9AA\" to the field \"Search Gym\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_input_to_the_field(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can see the link with text \"arrange a visit\"",
  "keyword": "And "
});
formatter.match({
  "location": "SearchSteps.i_can_see_the_link_with_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});