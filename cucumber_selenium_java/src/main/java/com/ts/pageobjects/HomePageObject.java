package com.ts.pageobjects;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject 
{
	WebDriver driver = null;

	@FindBy(how = How.XPATH, using = "//div[text()='Multi city']")	 
	public WebElement multiWay;

	@FindBy(how = How.XPATH, using = "//span[@id='departure_cities']")	 
	public WebElement fromCity;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu fixed_dropdown right show']")	 
	public WebElement fromDropdown;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Los Angeles' and parent::div[@class='dropdown-menu fixed_dropdown right show']]")	 
	public WebElement departureCity;

	@FindBy(how = How.XPATH, using = "//span[@id='arraival_cities']")	 
	public WebElement toCity;
	
	@FindBy(how = How.XPATH, using = "//div[@class='dropdown-menu fixed_dropdown left show']")	 
	public WebElement toDropdown;
	
	@FindBy(how = How.XPATH, using = "//a[text()='New York City' and parent::div[@class='dropdown-menu fixed_dropdown left show']]")	 
	public WebElement arraivalCity;
	
	@FindBy(how = How.ID, using = "departure")	 
	public WebElement departDate;
	
	@FindBy(how = How.XPATH, using = "(//button[@class='month-next'])[1]")	 
	public WebElement nextMonthDepart;
	
	@FindBy(how = How.XPATH, using = "(//button[@class='month-next'])[2]")	 
	public WebElement nextMonthReturn;
	
	@FindBy(how = How.XPATH, using = "//td[@data-day='1']/button")	 
	public WebElement monthFirst;
	
	@FindBy(how = How.XPATH, using = "(//button[text()='Ok'])[1]")	 
	public WebElement departOK;
	
	@FindBy(how = How.ID, using = "return")	 
	public WebElement returnDate;
	
	@FindBy(how = How.XPATH, using = "(//td[@data-day='7']/button)[2]")	 
	public WebElement monthSeventh;
	
	@FindBy(how = How.XPATH, using = "(//button[text()='Ok'])[2]")	 
	public WebElement returnOK;
	
	@FindBy(how = How.XPATH, using = "//div[@class='d-flex']")	 
	public WebElement passengerMenu;
	
	@FindBy(how = How.XPATH, using = "//div[@class='addRooomDetails']/p[text()='ADULTS (12y +)']/following::ul[1]/li[2]")	 
	public WebElement selectAdults;
	
	@FindBy(how = How.XPATH, using = "//li[text()='Premium Economy']")	 
	public WebElement selectPremium;
	
	@FindBy(how = How.XPATH, using = "//button[text()='DONE']")	 
	public WebElement done;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Search')]")	 
	public WebElement seacrhFlights;


	public HomePageObject(WebDriver driver){	 
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	public void clickMultiWay(){

		try{
			multiWay.click();				
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
			monthFirst.click();
			departOK.click();
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void clickReturnDate(){

		try{
			returnDate.click();			
		}catch(ElementNotVisibleException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void chooseReturnDate(){

		try{
			nextMonthReturn.click();
			monthSeventh.click();
			returnOK.click();
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

}
