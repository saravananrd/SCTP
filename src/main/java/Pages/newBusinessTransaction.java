package Pages;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

import ElementUtil.ElementUtil;


public class newBusinessTransaction {
	
	private WebDriver driver;
	private ElementUtil eltUti;
	
	private By client = By.xpath("//input[@id='ctl00_cntMainData_txtAccount']");
	private By product = By.xpath("//select[@id='ctl00_cntMainData_ddlProduct']");
	private By incDate = By.xpath("//input[@name='ctl00$cntMainData$txtInceptionDate']");	 
	private By expDate = By.xpath("//input[@name='ctl00$cntMainData$txtExpirationDate']");	
	private By saveBtn = By.xpath("//a[@id='ctl00_cntMainData_btnSave']");
	
	private By createLink = By.linkText("Create");
	

	
	//Constructor:
	public  newBusinessTransaction(WebDriver driver) 	{
		this.driver=driver;		
		eltUti = new ElementUtil(driver);
	}
	
	public String bussineTracationtitle() {
		return driver.getTitle();
					
	}
	 
	public quoteRequest  dataEntry() {
		eltUti.doSendKeys(client, "Ando_Test_Saro [ATestSaro]");
		eltUti.doSendKeys(product, "NZ Business Pack[SFNZ_BIZPACK]");
		eltUti.doSendKeys(incDate, "25/08/2021");
		//driver.findElement(expDate).clear();
		//eltUti.doSendKeys(expDate, "25/08/2022");
		eltUti.doClick(saveBtn);
		eltUti.doClick(createLink);
		return new quoteRequest(driver);
	
	}
	
}
