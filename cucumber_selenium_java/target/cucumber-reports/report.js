$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/TravelBooking.feature");
formatter.feature({
  "name": "Search for flights and book a one-way flying ticket",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on LogIn Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_is_on_LogIn_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters UserName as \"admin\" and Password as \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_enters_UserName_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Login Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.validate_Login_Successful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for flights with multi city flying option",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User selects flying type",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_flying_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects source location as \"LA-US\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_source_location_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects destination location as \"NY-US\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_destination_location_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects date of depart",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_date_of_depart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects date of return",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_date_of_return()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects two adults with premium economy class ticket",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_two_adults_with_premium_economy_class_ticket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search",
  "keyword": "When "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_clicks_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify flights of \"Los Angeles\" to \"New York City\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.verify_flights_of_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search for flights with one way flying option",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User selects flying type one way",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_flying_type_one_way()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select source location as \"WDC-US\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_select_source_location_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select destination location as \"LD-UK\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_select_destination_location_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects depart Date",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_depart_Date()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//td[@data-day\u003d\u002731\u0027]/button\"}\n  (Session info: chrome\u003d80.0.3987.100)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027rajesh-testsigma.local\u0027, ip: \u0027fe80:0:0:0:421:5d23:10ad:c75a%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.3\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.100, chrome: {chromedriverVersion: 80.0.3987.16 (320f6526c1632..., userDataDir: /var/folders/vx/t7cnff714jl...}, goog:chromeOptions: {debuggerAddress: localhost:59082}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 425480ea77ecc04e0859786100670f51\n*** Element info: {Using\u003dxpath, value\u003d//td[@data-day\u003d\u002731\u0027]/button}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat com.ts.pageobjects.HomePageOneWayObject.chooseDepartDate(HomePageOneWayObject.java:132)\n\tat com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_depart_Date(OnewayTicketBookingSteps.java:138)\n\tat ✽.User selects depart Date(file:///Users/rajesh/work/eclipse-workspace/cucumber_selenium_java/src/main/resources/features/TravelBooking.feature:22)\n",
  "status": "failed"
});
formatter.step({
  "name": "User selects one adults with Business class ticket",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_selects_one_adults_with_Business_class_ticket()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on search",
  "keyword": "When "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_clicks_on_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify booking flights of \"Washington, D.C.\" to \"London\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.verify_booking_flights_of_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks third flight to Book and continue",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_clicks_third_flight_to_Book_and_continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verify details of journey summery \"Washington, D.C. - London\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ts.stepdefinitions.OnewayTicketBookingSteps.user_verify_details_of_journey_summery(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});