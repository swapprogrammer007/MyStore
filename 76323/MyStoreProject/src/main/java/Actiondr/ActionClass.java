package Actiondr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.lang.*;

import mystore.base.BaseClass;

public class ActionClass extends BaseClass {
	
	public static void click(WebDriver driver1, WebElement locatorName) {
	
	Actions act=new Actions(driver1);
	act.moveToElement(locatorName);
}
	public static void FindElement(WebDriver driver1 ,By locatorName  ) {
		
		driver1.findElement(locatorName);
	}
	
	public static void sendkey(WebDriver driver1, String str) {
		driver1.findElement(By.xpath(str)).sendKeys();
		
	}
}
