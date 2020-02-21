package com.ts.pageobjects;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {	
	 
	    WebDriver driver = null;
	 
		@FindBy(how = How.NAME, using = "name")	 
		public WebElement userName;
	 
		@FindBy(how = How.NAME, using = "password")	 
		public WebElement password;
		
		@FindBy(how = How.NAME, using = "action")	 
		public WebElement login;
	 
		public LoginPageObject(WebDriver driver){	 
			this.driver = driver; 
			PageFactory.initElements(driver, this);
			}
		
		public void enteruserName(String fieldValue){
			
			try{
				userName.sendKeys(fieldValue);				
			}catch(ElementNotVisibleException e){
				System.out.println(e.getMessage());
			}
		}
		public void enterpassword(String fieldValue){
					
					try{
						password.sendKeys(fieldValue);				
					}catch(ElementNotVisibleException e){
						System.out.println(e.getMessage());
					}
				}
		public void loginLinkClick() {
			login.click();
}
	 
	}
