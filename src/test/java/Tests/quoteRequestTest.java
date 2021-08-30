package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ElementUtil.Constants;
import ElementUtil.Errors;
import Pages.quoteRequest;
import Pages.selectRisk;

public class quoteRequestTest extends BaseTest {
	
	
	@BeforeClass
	
	public void newBusSetUp() {
		//selectRisk seleRisk = new selectRisk(driver);		
		qRequest = new quoteRequest(driver);
		newbusinesstransaction = loginpages.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Quote Page****");
		
	}
 
	 
//	@Test
//	public void newPageTitle() {
//		String ptitle = newbusinesstransaction.bussineTracationtitle();
//		System.out.println("newbusinesstransaction page title:" + ptitle);
//		Assert.assertEquals(ptitle, Constants.NB_Page_Title, Errors.NB_Error_Mesg);
//		
//		
//	}
	
	@Test
	public void dataEntryNewBusiness() {
		//selectRisk selRisk= qRequest.quotePageEntry();
		qRequest.quotePageEntry();
		
	}
	
	
	
//	@Test(priority=1)
//	public void loginPageTitleTest(String client, String product, String incDate, String expDate, String saveBtn) {	
//		newbusinesstransaction.entryNewBusinessTransaction(client, product, incDate, expDate, saveBtn);
//		
//
//	}
	
	}
