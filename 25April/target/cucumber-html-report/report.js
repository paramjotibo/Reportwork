$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/homepage.feature");
formatter.feature({
  "line": 1,
  "name": "user homepage contact section",
  "description": "",
  "id": "user-homepage-contact-section",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 11,
  "name": "To enter names",
  "description": "",
  "id": "user-homepage-contact-section;to-enter-names",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@RegTest"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Browser is invoked",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user is on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user clicks on contact us",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "new window pops up",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enters the first name",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters the last name",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user hovers on support",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user clicks on helpcentre",
  "keyword": "And "
});
formatter.match({
  "location": "Def2.browser_is_invoked()"
});
formatter.result({
  "duration": 7572236800,
  "status": "passed"
});
formatter.match({
  "location": "Def2.user_is_on_homepage()"
});
formatter.result({
  "duration": 310646800,
  "status": "passed"
});
formatter.match({
  "location": "Def2.user_clicks_on_contact_us()"
});
formatter.result({
  "duration": 446569100,
  "status": "passed"
});
formatter.match({
  "location": "Def2.new_window_pops_up()"
});
formatter.result({
  "duration": 52971000,
  "status": "passed"
});
formatter.match({
  "location": "Def2.user_enters_the_first_name()"
});
formatter.result({
  "duration": 2694988000,
  "status": "passed"
});
formatter.match({
  "location": "Def2.user_enters_the_last_name()"
});
formatter.result({
  "duration": 5219322400,
  "status": "passed"
});
formatter.match({
  "location": "Def2.user_hovers_on_support()"
});
formatter.result({
  "duration": 5420017100,
  "status": "passed"
});
formatter.match({
  "location": "Def2.user_clicks_on_helpcentre()"
});
formatter.result({
  "duration": 1981447000,
  "status": "passed"
});
});