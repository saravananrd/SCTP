package Factory;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionManager {
	
		 	
		private Properties prop;
		private ChromeOptions co;
		private FirefoxOptions ff;
		
		public OptionManager(Properties prop) {
			this.prop = prop;
		}
		
		public ChromeOptions getChromeOptions() {
			co=new ChromeOptions();
			if(Boolean.parseBoolean(prop.getProperty("headless").trim()))  co.addArguments("--headless");			
			if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) co.addArguments("--incognito");		
			return co;
				}
		
		
		public FirefoxOptions getfirefoxOptions() {
			ff=new FirefoxOptions();
			if(Boolean.parseBoolean(prop.getProperty("headless").trim()))  ff.addArguments("--headless");			
			if(Boolean.parseBoolean(prop.getProperty("incognito").trim())) ff.addArguments("--incognito");		
			return ff;
				}

	}


