package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import ElementUtil.ElementUtil;


public class LoginPages {
	
	private WebDriver driver;
	private ElementUtil eltUti;
	 
	
	
	private By userName= By.xpath("//input[@id='txtUsername']");
	
	private By password= By.xpath("//input[@id='txtPassword']");
	private By forPassword = By.cssSelector("#btnForgotPassword");
	private By loginButton=By.xpath("//input[@id='btnLogin']");
	private By header = By.xpath("//div[@class='text']");
	
	private By newBusiness = By.xpath("//a[@class='lnkImageTextButton']");
	
	
	//**** New Business Policy Transaction
	private By client = By.cssSelector("#ctl00_cntMainData_txtAccount");
	private By product = By.cssSelector("#ctl00_cntMainData_ddlProduct");
	private By incDate = By.cssSelector("#ctl00_cntMainData_ddlProduct");
	private By expDate = By.cssSelector("#ctl00_cntMainData_ddlProduct");
	private By saveBtn = By.cssSelector("#ctl00_cntMainData_btnSave > img");
	
	//Constructor:
	public  LoginPages(WebDriver driver) 
	{
		this.driver=driver;		
		eltUti = new ElementUtil(driver);
	}
	
	//page actions://page methods functionality// behviour of the page// no assesrtion
	
	public String getLoginPageTitle() 
	{
		return driver.getTitle();
	}
	
	public String getHeaderText() {
		return driver.findElement(header).getText();
	}
	
	public boolean forPassword() {
		return driver.findElement(forPassword).isDisplayed();
	}
	
	public newBusinessTransaction doLogin(String un, String pwd) {
		
	
		 
		eltUti.doSendKeys(userName, un);
		eltUti.doSendKeys(password, pwd);
		eltUti.doClick(loginButton); 
		eltUti.doClick(newBusiness);
		return new newBusinessTransaction(driver);
		
		//**** New Business Policy Transaction
	
// 	   driver.findElement(userName).sendKeys(un);
// 		driver.findElement(password).sendKeys(pwd);
// 		driver.findElement(loginButton).click();
//           
// 		driver.findElement(newBusiness).click();		
		
		
	}
	
	

	
} 
