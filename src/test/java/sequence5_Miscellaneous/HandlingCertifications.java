package sequence5_Miscellaneous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingCertifications {

	public static void main(String[] args) {

		
		ChromeOptions options = new ChromeOptions();
	
		//Accept unsecure certificates
		options.setAcceptInsecureCerts(true);
		
		
		//Add extensions
		//options.addExtensions("file path");

		
		//Handling Proxies
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("other varients also, check with your security team, etc for which proxy string");
		options.setCapability("proxy", proxy);
		
		
		
		//Pop up blocker like for location blocking
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		
		
		
		//Path of default directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", prefs);
		options.setExperimentalOption("prefs", prefs);
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		

	}

}
