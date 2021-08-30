package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

 

import ElementUtil.Constants;
import ElementUtil.Errors;
import Pages.newBusinessTransaction;

public class LoginPageTest extends BaseTest{
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String ptitle =loginpages.getLoginPageTitle();
		System.out.println("login page title:" + ptitle);
		Assert.assertEquals(ptitle, Constants.Login_Page_Title, Errors.Login_Error_Mesg);
	}
	
	
	@Test(priority=2)
	public void loginPageHeaderTest() {
		String Pheader =loginpages.getHeaderText();
		System.out.println("login page header:" + Pheader);
		Assert.assertEquals(Pheader, Constants.Login_Page_Header, Errors.Login_Header_Error_Mesg);
	}
	
 
	@Test(priority=3)
	public void doLoginTest(){
		//loginpages.doLogin("saro", "S@ingapore");
		//loginpages.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		newBusinessTransaction newbusTra =loginpages.doLogin(prop.getProperty("username").trim(), prop.getProperty("password").trim());
		
}
	
	
}
