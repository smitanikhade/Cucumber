$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("functionalTests/End2End_Tests.feature");
formatter.feature({
  "name": "Automated End to End Tests",
  "description": "Description: The purpose of this feature is to test End to End integration",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he search for “dress”",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.choose_to_buy_the_first_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter personal details on checkout page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.enter_personal_details_on_checkout_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select same delivery address",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.select_same_delivery_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select payment method as “check” payment",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "place the order",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.place_the_order()"
});
formatter.result({
  "status": "skipped"
});
});