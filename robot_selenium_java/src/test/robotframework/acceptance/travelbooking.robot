*** Settings ***
Library  Selenium2Library
Library  OperatingSystem
Documentation
...    Flight booking tests.
Suite teardown    Close all browsers



***Variables***
${LOGIN URL}      http://travel.testsigma.com/login
${BROWSER}        Chrome
${LOGIN_REDIRECT}    http://travel.testsigma.com/?name=admin&password=12345&action=
${dep_drop_down}    //span[@id='departure_cities']
${dest_drop_down}    //span[@id='arraival_cities']
*** Test Cases ***
Successful Login with Valid Credentials 
    Initialize browser with log-in page
	log-in to application
	validate login success
	
Search for flights with multi city flying option
    Click Element    //div[text()='Multi city']
    User selects source location as "LA-US"
    User selects destination location as "NY-US" 
    User selects date of depart
    User selects date of return
    User selects two adults with premium economy class ticket
    Click Element    //button[contains(text(),'Search')]
    verify flights of "Los Angeles" to "New York City"	
Scenario: Search for flights with one way flying option
    Click Element    xpath=//div[text()='One way Flying']
    User select source location as "WDC-US"
    User select destination location as "LD-UK" 
    User selects depart Date
    User selects one adults with Business class ticket
    User clicks on search
    verify booking flights of "Washington, D.C." to "London"
    User clicks third flight to Book and continue
    User verify details of journey summery "Washington, D.C. - London"
  

*** Keywords ***
User clicks third flight to Book and continue
    Click Element    xpath=(//a[text()='Book Now'])[3]
    Click Element    xpath=//a[text()='Continue']    
User verify details of journey summery "Washington, D.C. - London"
    ${myHtml} =    Get Source
    Should Contain  ${myHtml}    Washington, D.C. - London
User select source location as "WDC-US"
    Click Element    ${dep_drop_down}
    Click Element    xpath=//a[text()='Washington, D.C.' and parent::div[@class='dropdown-menu fixed_dropdown right show']] 
User select destination location as "LD-UK" 
    Click Element    ${dest_drop_down}
    Click Element    //a[text()='London' and parent::div[@class='dropdown-menu fixed_dropdown left show']]
User selects depart Date
    Click Element    id=departure
    Click Element    xpath=(//button[@class='month-next'])[1]
    Click Element    xpath=//td[@data-day='28']/button
    Click Element    xpath=(//button[text()='Ok'])[1]
User selects one adults with Business class ticket
    Click Element    xpath=//div[@class='d-flex']
    Click Element    xpath=//div[@class='addRooomDetails']/p[text()='ADULTS (12y +)']/following::ul[1]/li[1]
    Click Element    xpath=//li[text()='Economy']
    Click Element    xpath=//button[text()='DONE']
User clicks on search
    Click Element    xpath=//button[contains(text(),'Search')]
verify booking flights of "Washington, D.C." to "London"
    ${myHtml} =    Get Source
    Should Contain  ${myHtml}    Washington, D.C.
    Should Contain  ${myHtml}    London

verify flights of "Los Angeles" to "New York City"	
    ${myHtml} =    Get Source
    Should Contain  ${myHtml}    Los Angeles
    Should Contain  ${myHtml}    New York City
User selects two adults with premium economy class ticket
    Click Element    //div[@class='d-flex']
    Click Element    //div[@class='addRooomDetails']/p[text()='ADULTS (12y +)']/following::ul[1]/li[2]
    Click Element    //li[text()='Premium Economy']
    Click Element    //button[text()='DONE']
User selects date of return
    Click Element    id=return
    Click Element    xpath=(//button[@class='month-next'])[2]
    Click Element    xpath=(//td[@data-day='7']/button)[2]
    Click Element    xpath=(//button[text()='Ok'])[2]
User selects date of depart
    Click Element    id=departure
    Click Element    xpath=(//button[@class='month-next'])[1]
    Click Element    xpath=(//td[@data-day='1'])/button
    Click Element    xpath=(//button[text()='Ok'])[1]

User selects source location as "LA-US"
    Click Element    ${dep_drop_down}
    Click Element    //a[text()='Los Angeles' and parent::div[@class='dropdown-menu fixed_dropdown right show']]
    
User selects destination location as "NY-US" 
    Click Element    ${dest_drop_down}
    Click Element    //a[text()='New York City' and parent::div[@class='dropdown-menu fixed_dropdown left show']]
    
Initialize browser with log-in page
    set selenium implicit wait    30
    Open Browser    about:blank    ${BROWSER}
    Maximize Browser Window
    Go To    ${LOGIN URL}
    Title Should Be    Simply Travel
log-in to application
    Input Text  name=name    admin
	Input Password  name=password    12345
	Click Button  name=action
validate login success
    ${URL}=    Get Location
    Should Be Equal As Strings    ${URL}    ${LOGIN_REDIRECT}