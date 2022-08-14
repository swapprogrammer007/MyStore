package mystore.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.sun.tools.javac.launcher.Main;



public class FillDetailsPage {
	WebDriver driver;
	
	public FillDetailsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	

	public WebElement Title() {
		WebElement Title= driver.findElement(By.xpath("//input[@id='id_gender1']"));
		Title.click();
		return Title;
		
	}
	public WebElement FirstName() {
		return driver.findElement(By.id("customer_firstname"));
	}
	public WebElement LastName() {
		return driver.findElement(By.id("customer_lastname"));
	}
	public WebElement Password() {
		return driver.findElement(By.id("passwd"));
	}
	public void DropdownForDate() {
	
			WebElement date=driver.findElement(By.id("days"));
			Select select=new Select(date);                                        //dropdown for Date error
			select.selectByValue("9");
			
		}
	public void DropdownForMonth() {
		
		WebElement month=driver.findElement(By.id("months"));
		Select select=new Select(month);                                        //dropdown for month error
		select.selectByValue("4");
		
	}
	public void DropdownForYear() {
		
		WebElement year=driver.findElement(By.id("years"));     
		Select select=new Select(year);                                        //dropdown for Year error
		select.selectByValue("1998");
		
	}
	public WebElement FirstName1() {
		return driver.findElement(By.id("firstname"));
	}
	public WebElement LastName1() {
		return driver.findElement(By.id("lastname"));
	}
	public WebElement Company() {
		return driver.findElement(By.id("company"));
	}
	
	public WebElement Addres() {
		return driver.findElement(By.id("address1"));
	}
	public WebElement City() {
		return driver.findElement(By.id("city"));}
	public void DropdownForSate() {
		WebElement state=driver.findElement(By.id("id_state"));
		Select select=new Select(state);                                        //dropdown for state error
		select.selectByValue("5");
		
	}
	public WebElement pincode() {
		return driver.findElement(By.id("postcode"));
	}
	
	public void DropDownForCountry() {
		WebElement country=driver.findElement(By.id("id_country"));
		Select select=new Select(country);                                        //dropdown for country error
		select.selectByValue("21");
		
	}
	public WebElement MoblieNo() {
		return driver.findElement(By.id("phone_mobile"));
	}
	public WebElement AssignAnAddress() {
		return driver.findElement(By.id("other"));
	}
	public WebElement Submit() {
		return driver.findElement(By.id("submitAccount"));
	}
	
}
