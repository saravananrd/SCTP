package Pages;

import org.openqa.selenium.WebDriver;

import ElementUtil.ElementUtil;

public class selectRisk {
	private WebDriver driver;
	private ElementUtil eltUti;
	

	public selectRisk(WebDriver driver) {
		this.driver=driver;		
		eltUti = new ElementUtil(driver);
	}


	 

}
