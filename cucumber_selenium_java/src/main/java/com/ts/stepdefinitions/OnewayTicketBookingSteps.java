package com.ts.stepdefinitions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ts.pageobjects.HomePageObject;
import com.ts.pageobjects.HomePageOneWayObject;
import com.ts.pageobjects.LoginPageObject;
import com.ts.util.ConfigUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OnewayTicketBookingSteps {
	public static WebDriver driver;

	public void initDriver() throws Exception {

		System.setProperty("webdriver.chrome.driver", ConfigUtil.getInstance().getChromeDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ConfigUtil.getInstance().getImplicitlyWait(), TimeUnit.SECONDS);
	}

	@Given("User is on LogIn Page")
	public void user_is_on_LogIn_Page() throws Exception {
		initDriver() ;
		driver.get(ConfigUtil.getInstance().getConfigProps().getProperty("app.login.url"));
	}

	@When("^User enters UserName as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void user_enters_UserName_as_and_Password_as(String userName, String password) {
		LoginPageObject loginPage = new LoginPageObject(driver);
		loginPage.enteruserName(userName);
		loginPage.enterpassword(password);
		loginPage.loginLinkClick();

	}

	@Then("Validate Login Successful")
	public void validate_Login_Successful() {
		Assert.assertEquals(urlValidator("http://travel.testsigma.com/?name=admin&password=12345&action="),true);	    

	}

	@Given("^User selects flying type$")
	public void user_selects_flying_type() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickMultiWay();
	}

	@Then("User selects source location as \"([^\\\"]*)\"$")
	public void user_selects_source_location_as(String sourceLoc) {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickFromCity();
		Assert.assertEquals(elementValidator(homePage.fromDropdown),true);
		homePage.clickDepartureCity();
		Assert.assertEquals(textValidator(sourceLoc),true);
	}

	@Then("User selects destination location as \"([^\\\"]*)\"$")
	public void user_selects_destination_location_as(String destinationLoc) {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickToCity();
		Assert.assertEquals(elementValidator(homePage.toDropdown),true);
		homePage.clickArraivalCity();
		Assert.assertEquals(textValidator(destinationLoc),true);
	}
	
	@Then("User selects date of depart")
	public void user_selects_date_of_depart() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickDepartDate();
		homePage.chooseDepartDate();
	}

	@Then("User selects date of return")
	public void user_selects_date_of_return() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickReturnDate();
		homePage.chooseReturnDate();
	}

	@Then("User selects two adults with premium economy class ticket")
	public void user_selects_two_adults_with_premium_economy_class_ticket() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickPassengerMenu();
		homePage.choosePassengers();
	}

	@When("User clicks on search")
	public void user_clicks_on_search() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickSearch();
	}

	@Then("^verify flights of \"([^\"]*)\" to \"([^\"]*)\"$")
	public void verify_flights_of_to(String departCity, String arraivalCity) {
		Assert.assertEquals(textValidator(departCity),true);
		Assert.assertEquals(textValidator(arraivalCity),true);   
	}
	
	@Given("User selects flying type one way")
	public void user_selects_flying_type_one_way() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickOneWay();
	}

	@Then("User select source location as \"([^\\\"]*)\"$")
	public void user_select_source_location_as(String sourceLoc) {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickFromCity();
		Assert.assertEquals(elementValidator(homePage.fromDropdown),true);
		homePage.clickDepartureCity();
		Assert.assertEquals(textValidator(sourceLoc),true);
	}

	@Then("User select destination location as \"([^\\\"]*)\"$")
	public void user_select_destination_location_as(String destinationLoc) {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickToCity();
		Assert.assertEquals(elementValidator(homePage.toDropdown),true);
		homePage.clickArraivalCity();
		Assert.assertEquals(textValidator(destinationLoc),true);
	}

	@Then("User selects depart Date")
	public void user_selects_depart_Date() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickDepartDate();
		homePage.chooseDepartDate();
	}

	@Then("User selects one adults with Business class ticket")
	public void user_selects_one_adults_with_Business_class_ticket() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickPassengerMenu();
		homePage.choosePassengers();
	}
	@Then("^verify booking flights of \"([^\"]*)\" to \"([^\"]*)\"$")
	public void verify_booking_flights_of_to(String departCity, String arraivalCity) {
		Assert.assertEquals(textValidator(departCity),true);
		Assert.assertEquals(textValidator(arraivalCity),true); 
	}

	@Then("User clicks third flight to Book and continue")
	public void user_clicks_third_flight_to_Book_and_continue() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickBook();
		homePage.clickContinue();
	}
	
	@Then("^User verify details of journey summery \"([^\\\"]*)\"$")
	public void user_verify_details_of_journey_summery(String cities) {
		Assert.assertEquals("Expected text not found",textValidator(cities),true);
	}
	


	public boolean urlValidator(String expected) {

		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains(expected))
			return true;
		else
			return false;
	}
	
	public boolean elementValidator(WebElement expected) {
		if (expected.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean textValidator(String expected) {
		
		String text = driver.getPageSource();
		if (text.contains(expected))
			return true;
		else
			return false;
	}
}
