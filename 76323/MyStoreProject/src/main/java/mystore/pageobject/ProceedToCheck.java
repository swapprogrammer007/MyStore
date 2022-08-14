package mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProceedToCheck {
	WebDriver driver;
	public ProceedToCheck(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement ClickOnProceedToCheck() {
		return driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	}


}
