package mystore.pageobject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Actiondr.ActionClass;
import mystore.base.BaseClass;

public class HomePage extends BaseClass {
	static WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement signIn() {
		return driver.findElement(By.xpath("//a[@class='login']"));
	}
	
	public WebElement SearchProduct1() {
		return driver.findElement(By.id("search_query_top"));
	}
	
	
	public WebElement Enter() {
		return driver.findElement(By.name("submit_search"));
	}
	
	
	

	

	

}
