package Factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	public static String highlight;
	private OptionManager optionsManager;
	
	
	//Method is used to initilize driver
	//21/08/2021
	
	public WebDriver initDriver(Properties prop) {
		
		
		String browserName =prop.getProperty("browser");	
	
		 highlight =prop.getProperty("highlight");
		
		System.out.println("browser name is:" + browserName);
		optionsManager = new OptionManager(prop);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(optionsManager.getChromeOptions());
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(optionsManager.getfirefoxOptions());			
		}else if(browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			
		}
		else {
			System.out.println("please pass the right browserName : " + browserName);
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		driver.get(prop.getProperty("url"));
		return driver;
		
				
	}
	// This method is used Initilaize the properities on the basis of given env names
	
	public Properties initProperties() {
		Properties prop = null;
		FileInputStream ip = null;
//		String env =System.getProperty("env");
//		
//		if (env==null) {
//			System.out.println(".... Running in Prod environment");
//		}
	
				 
	try {
		ip = new FileInputStream("../SCTP/src/test/resources/Config/ConfigProperties");

	 
		prop = new Properties();
		prop.load(ip);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
			
		
	}
	return prop;
	

}
	
	public void getScreenShot() {
		
		File gsshot =((TakesScreenshot)driver()).getScreenshotAs(OutputType.FILE);
		
	}

	private TakesScreenshot driver() {
		// TODO Auto-generated method stub
		return null;
	}



}
