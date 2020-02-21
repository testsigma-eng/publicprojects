package com.ts.pageobjects;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageOneWayObject 
{
	WebDriver driver = null;

	@FindBy(how = How.XPATH, using = "//div[text()='One way Flying']")	 
	public WebElement oneWay;

	@FindBy(how = How.XPATH, using = "//span[@id='departure_cities']")	 
	public WebElement fromCity;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu fixed_dropdown right show']")	 
	public WebElement fromDropdown;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Washington, D.C.' and parent::div[@class='dropdown-menu fixed_dropdown right show']]")	 
	public WebElement departureCity;

	@FindBy(how = How.XPATH, using = "//span[@id='arraival_cities']")	 
	public WebElement toCity;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu fixed_dropdown left show']")	 
	public WebElement toDropdown;
	
	@FindBy(how = How.XPATH, using = "//a[text()='London' and parent::div[@class='dropdown-menu fixed_dropdown left show']]")	 
	public WebElement arraivalCity;
	
	@FindBy(how = How.ID, using = "departure")	 
	public WebElement departDate;
	
	@FindBy(how = How.XPATH, using = "(//button[@class='month-next'])[1]")	 
	public WebElement nextMonthDepart;
	
	@FindBy(how = How.XPATH, using = "//td[@data-day='31']/button")	 
	public WebElement month31;
	
	@FindBy(how = How.XPATH, using = "(//button[text()='Ok'])[1]")	 
	public WebElement departOK;
	
	@FindBy(how = How.XPATH, using = "//div[@class='d-flex']")	 
	public WebElement passengerMenu;
	
	@FindBy(how = How.XPATH, using = "//div[@class='addRooomDetails']/p[text()='ADULTS (12y +)']/following::ul[1]/li[1]")	 
	public WebElement selectAdults;
	
	@FindBy(how = How.XPATH, using = "//li[text()='Economy']")	 
	public WebElement selectPremium;
	
	@FindBy(how = How.XPATH, using = "//button[text()='DONE']")	 
	public WebElement done;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")	 
	public WebElement seacrhFlights;
	
	@FindBy(how = How.XPATH, using = "(//a[text()='Book Now'])[3]")	 
	public WebElement bookFlight;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Continue']")	 
	public WebElement continueBook;
	

	public HomePageOneWayObject(WebDriver driver){	 
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public void clickOneWay(){

		try{
			oneWay.click();				
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}

	public void clickFromCity(){

		try{
			fromCity.click();				
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickDepartureCity(){

		try{
			departureCity.click();				
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickToCity(){

		try{
			toCity.click();				
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickArraivalCity(){

		try{
			arraivalCity.click();				
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickDepartDate(){

		try{
			departDate.click();				
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void chooseDepartDate(){

		try{
			nextMonthDepart.click();
			month31.click();
			departOK.click();
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickPassengerMenu(){

		try{
			passengerMenu.click();
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void choosePassengers(){

		try{
			selectAdults.click();
			selectPremium.click();
			done.click();
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickSearch(){

		try{
			seacrhFlights.click();
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickBook(){

		try{
			bookFlight.click();
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickContinue(){

		try{
			continueBook.click();
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}


}
