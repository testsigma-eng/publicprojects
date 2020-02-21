package ts.junit.selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;

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

import junit.framework.TestCase;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestTravelBooking{
	public static WebDriver driver;

	public void initDriver() throws Exception {

		
	}
	@BeforeClass
    public static void setUpBeforeClass() throws Exception {
    	System.out.println("URL::"+ConfigUtil.getInstance().getConfigProps().getProperty("app.login.url"));

		System.setProperty("webdriver.chrome.driver", ConfigUtil.getInstance().getChromeDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ConfigUtil.getInstance().getImplicitlyWait(), TimeUnit.SECONDS);
		System.out.println("Completed executing Before class");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    	System.out.println("#####**REPORTS FILE::./target/site/surefire-report.html");
        
    	if(driver != null) {
    		driver.close();
    	}
    
    }

    @Test
	public void test01GoToLoginPage() throws Exception {
    	System.out.println("########Started executing ");
		driver.get(ConfigUtil.getInstance().getConfigProps().getProperty("app.login.url"));
	}

	@Test
	public void test02EnterUserNameAndPasswordAndLogin() {
		LoginPageObject loginPage = new LoginPageObject(driver);
		loginPage.enteruserName("admin");
		loginPage.enterpassword("12345");
		loginPage.loginLinkClick();

	}

	@Test
	public void test03ValidateLogin() {
		Assert.assertEquals(urlValidator("http://travel.testsigma.com/?name=admin&password=12345&action="),true);	    

	}

	@Test
	public void test04SelectMultiwayFlyingType() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickMultiWay();
	}

	@Test
	public void test05SelectMultiwaySource() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickFromCity();
		Assert.assertEquals(elementValidator(homePage.fromDropdown),true);
		homePage.clickDepartureCity();
		Assert.assertEquals(textValidator("LA-US"),true);
	}

	@Test
	public void test06SelectMultiwayDestination() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickToCity();
		Assert.assertEquals(elementValidator(homePage.toDropdown),true);
		homePage.clickArraivalCity();
		Assert.assertEquals(textValidator("NY-US" ),true);
	}
	
	@Test
	public void test07PickDepartureDate() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickDepartDate();
		homePage.chooseDepartDate();
	}

	@Test
	public void test08PickReturnDate() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickReturnDate();
		homePage.chooseReturnDate();
	}

	@Test
	public void test09Select2AdultsPremiumEconomyTicket() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickPassengerMenu();
		homePage.choosePassengers();
	}

	@Test
	public void test10ClickOnSearch() {
		HomePageObject homePage = new HomePageObject(driver);
		homePage.clickSearch();
	}

	@Test
	public void test11VerifyFlightSearchWithDepartureAndArrivalInput() {
		Assert.assertEquals(textValidator("Los Angeles"),true);
		Assert.assertEquals(textValidator("New York City"),true);   
	}
	
	@Test
	public void test12SelectOnewayFlightType() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickOneWay();
	}

	@Test
	public void test13SelectOnewayDepartureLocation() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickFromCity();
		Assert.assertEquals(elementValidator(homePage.fromDropdown),true);
		homePage.clickDepartureCity();
		Assert.assertEquals(textValidator("WDC-US"),true);
	}

	@Test
	public void test14SelectOnewayDestination() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickToCity();
		Assert.assertEquals(elementValidator(homePage.toDropdown),true);
		homePage.clickArraivalCity();
		Assert.assertEquals(textValidator("LD-UK"),true);
	}

	@Test
	public void test15PickOnewayDepartureDate() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickDepartDate();
		homePage.chooseDepartDate();
	}

	@Test
	public void test16SelectOneAdultWithBusinessClass() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickPassengerMenu();
		homePage.choosePassengers();
	}
	@Test
	public void test17VerifyBookingFlightsForWashingtonToLondon() {
		Assert.assertEquals(textValidator("Washington, D.C."),true);
		Assert.assertEquals(textValidator("London"),true); 
	}

	@Test
	public void test18ClickOnthirdFlightToBook() {
		HomePageOneWayObject homePage = new HomePageOneWayObject(driver);
		homePage.clickSearch();
		homePage.clickBook();
		homePage.clickContinue();
	}
	
	@Test
	public void test19VerifyJourneySummary() {
		Assert.assertEquals("Expected text not found",textValidator("Washington, D.C. - London"),true);
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
