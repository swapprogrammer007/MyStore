package mystore.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mystore.base.BaseClass;
import mystore.pageobject.FillDetailsPage;
import mystore.pageobject.HomePage;
import mystore.pageobject.LoginPage;
import mystore.pageobject.ProceedToCheck;
import mystore.pageobject.SignInPage;
import mystore.pageobject.SleeveProductPage;
import mystore.pageobject.TshirtPage;

public class LoginTestCases extends BaseClass {
	HomePage homePage;
	LoginPage loginPage;
	FillDetailsPage filldetails;
	mystore.pageobject.SearchPage searchpage;
	TshirtPage tshirtpage;
	SleeveProductPage sleeveproduct;
	ProceedToCheck proceedtocheck;
	
	WebDriver driver;
	
	@BeforeTest
	void beforetest() {
		driver=initilizeDriver();
		homePage=new HomePage(driver);
		loginPage=new LoginPage(driver);
		filldetails=new FillDetailsPage(driver);
		searchpage=new mystore.pageobject.SearchPage(driver);
		tshirtpage=new TshirtPage(driver);              
		sleeveproduct=new SleeveProductPage(driver);
		proceedtocheck=new ProceedToCheck(driver);     
		
	}
	
	@Test
	void verifyNewRegistration() {
		driver.get("http://automationpractice.com/index.php");
		homePage.signIn().click();
		loginPage.createAccountEmailId().sendKeys("maneswapnil885@gmail.com");
		loginPage.createAccount().click();
	}
	
	@Test
	void FillDetails() {
		filldetails.Title().click();
		filldetails.FirstName().sendKeys("Swapnil");
		filldetails.LastName().sendKeys("Mane");
		filldetails.Password().sendKeys("Swapnil@123");
		filldetails.DropdownForDate();
		filldetails.DropdownForMonth();
		filldetails.DropdownForYear();
		filldetails.FirstName1().sendKeys("Swapnil");
		filldetails.LastName1().sendKeys("Mane");
		filldetails.Company().sendKeys("Hexaware Technology");
		filldetails.Addres().sendKeys("keshav Nagar,Pune");
		filldetails.City().sendKeys("Pune");
		filldetails.DropdownForSate();
		filldetails.pincode().sendKeys("411036");
		filldetails.DropDownForCountry();
		filldetails.MoblieNo().sendKeys("9130520388");
		filldetails.AssignAnAddress().sendKeys("Keshav Nagar,pune.");
		filldetails.Submit().click();
		
	}
	
	@Test
	void SearchPage() {
		searchpage.SearchProduct().sendKeys("T-shirt");
		searchpage.Search().click();
			
	}
	
	@Test
	void tshirtpage() {
		tshirtpage.SleeveTshirt().click();
		
	}
	
	@Test
	void SleeveProductPage() {
		sleeveproduct.Quantity().sendKeys("2");
		sleeveproduct.DropdownForSize();
		sleeveproduct.colour().click();
		sleeveproduct.ClickOnAddToCard().click();
		
	}
	
	@Test
	void ProceedToCheck() {
		proceedtocheck.ClickOnProceedToCheck().click();
		
	}
	
	
	
	
	

}
