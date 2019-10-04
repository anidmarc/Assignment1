package com.assignment1.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.assignment1.base.Base;

public class FacebookLoginPage extends Base{

	@FindBy(id="email")
    WebElement Username;
	
	@FindBy(id="pass")
    WebElement Password;
	
	@FindBy(id="loginbutton")
    WebElement Loginbutton;
	
	
	public FacebookLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	/**The below method will capture the page title*/
	
	public String LoginPageTitle() {
		return driver.getTitle();
	}
	
	/**The below method will check if username and password is visible if visible pass the username and password from the external test data sheet*/
	
    public void loginuser(String un, String pass) {
		
    	if(Username.isDisplayed() && Password.isDisplayed() && Loginbutton.isEnabled()) {
    	System.out.println("The Username field is displaying ");
		Username.sendKeys(un);
		
		System.out.println("The Password field is displaying");
		Password.sendKeys(pass);
		
		System.out.println("The login button is displaying");
		Loginbutton.click();
		
    	} else {
    		System.out.println("The textbox fields and login button is not available");
    	}
	
}
}
