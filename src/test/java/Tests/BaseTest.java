package Tests;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Factory.DriverFactory;
import Pages.LoginPages;
import Pages.newBusinessTransaction;
import Pages.quoteRequest;
import Pages.selectRisk;



public class BaseTest {
	
	WebDriver driver;
	DriverFactory df;
	Properties prop;
 	 
	
	LoginPages loginpages;
	newBusinessTransaction newbusinesstransaction;  	 
	quoteRequest qRequest;
	selectRisk sRisk;
	
	@BeforeTest
	public void setUp() {
		df= new DriverFactory();
		prop = df.initProperties();		
		driver = df.initDriver(prop);	
		loginpages = new LoginPages(driver);
	}
	
// 	@AfterTest
// 	public void teadDown() {
// 		driver.quit();
// 	}
	

}
