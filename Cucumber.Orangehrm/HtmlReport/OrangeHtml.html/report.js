$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Orangehrm.feature");
formatter.feature({
  "line": 1,
  "name": "Adding New Employee Details And Verify The List In Orangehrm Application",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "adding-new-employee-details-and-verify-the-list-in-orangehrm-application;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Launch The URL",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Enter The Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Cick On The Loing Button And It Navigate Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_URL()"
});
formatter.result({
  "duration": 8795229500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Username_In_Username_Field()"
});
formatter.result({
  "duration": 923268400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 125847400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Cick_On_The_Loing_Button_And_It_Navigate_Home_Page()"
});
formatter.result({
  "duration": 94694300,
  "status": "passed"
});
});