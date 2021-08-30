package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ElementUtil.ElementUtil;

public class quoteRequest {
	private WebDriver driver;
	private ElementUtil eltUti;
	
	public  quoteRequest(WebDriver driver) 
	{
		this.driver=driver;		
		eltUti = new ElementUtil(driver);
	}
	
	private By uatCheckbox = By.xpath("//input[@id='QuoteRqController_to_ANDO_UAT']");
	private By phoneNumber = By.xpath("//input[@id='QuoteRqController_ExecutivePhone']");
	private By holdingUnderWriter = By.xpath("//select[@class='select-field ']");
	private By nextBtn = By.xpath("//a[text()='Next']");
	
	
	
	
	
	
	public selectRisk quotePageEntry() {
		eltUti.doClick(uatCheckbox);
		eltUti.doSendKeys(phoneNumber, "121212121");
		eltUti.doSelectByValue(holdingUnderWriter, "Ando");
		eltUti.doClick(nextBtn);
		
		 return new selectRisk(driver);
	}

}
