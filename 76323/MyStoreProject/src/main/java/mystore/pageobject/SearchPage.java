package mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement SearchProduct() {
		return driver.findElement(By.id("search_query_top"));
	} 
	public WebElement Search() {
		return driver.findElement(By.xpath("//button[@name='submit_search']"));
	}
	

}
