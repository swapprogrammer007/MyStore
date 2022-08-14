package mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SleeveProductPage {
	WebDriver driver;
	public SleeveProductPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement Quantity() {
		return driver.findElement(By.id("quantity_wanted"));
	}
	public void DropdownForSize() {
		
		WebElement size=driver.findElement(By.id("days"));
		Select select=new Select(size);                                       
		select.selectByValue("3");
	}
	
	public WebElement colour() {
		return driver.findElement(By.id("color_14"));
	}
	public WebElement ClickOnAddToCard() {
		return driver.findElement(By.id("//button[@name='Submit']"));
	}

}
