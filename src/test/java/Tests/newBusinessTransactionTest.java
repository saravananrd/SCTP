package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ElementUtil.Constants;
import ElementUtil.Errors;
import Pages.quoteRequest;

public class newBusinessTransactionTest extends BaseTest {
//	
//	@BeforeClass
//	
//	public void newBusSetUp() {
//		newbusinesstransaction = loginpages.doLogin(prop.getProperty("username"), prop.getProperty("password"));
//		
//	}
	
	public newBusinessTransactionTest(WebDriver driver) {
		 
	}

	@Test
	public void newPageTitle() {
		String pbtitle = newbusinesstransaction.bussineTracationtitle();
		System.out.println("newbusinesstransaction page title:" + pbtitle);
		//Assert.assertEquals(ptitle, Constants.NB_Page_Title, Errors.NB_Error_Mesg);
		 Assert.assertTrue(pbtitle.contains("New Business"));
		
		
	}
	
	@Test
	public void dataEntryNewBusiness() { 
		quoteRequest qRequest = newbusinesstransaction.dataEntry();
		
	}

	@Test
	public quoteRequestTest nagigateToRegisterPage() {
		 
		return new quoteRequestTest(driver);
	}
	
	
	
//	@Test(priority=1)
//	public void loginPageTitleTest(String client, String product, String incDate, String expDate, String saveBtn) {	
//		newbusinesstransaction.entryNewBusinessTransaction(client, product, incDate, expDate, saveBtn);
//		
//
//	}
	
	}
