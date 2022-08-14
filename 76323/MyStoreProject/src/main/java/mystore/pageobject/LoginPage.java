package mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement createAccount() {
		return driver.findElement(By.id("SubmitCreate"));
	}
	public WebElement createAccountEmailId() {
		return driver.findElement(By.id("email_create"));
	}
	
	
	
	
	

}
