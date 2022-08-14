package mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TshirtPage {
	WebDriver driver;
	public TshirtPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement SleeveTshirt() {
		return driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
	} 

}
