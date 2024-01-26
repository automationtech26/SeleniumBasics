package sequence1_LearnDriverBasics;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnDriver {

	public static void main(String[] args) {


    //for firefox
	//	System.setProperty("webdriver.gecko.driver", "path");
	//	WebDriver firefoxDriver = new FirefoxDriver();
		
		
		
		
	/*Selenium manager invokes chrome driver appropriate to browser which is introduced selenium 4
		So no need to add path of selenium driver
		System.setProperty("webdriver.chrome.driver", "path");
	*/
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		
		//Below implicit wait is global wait
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		webDriver.get("http://rahulshettyacademy.com");
		
		webDriver.getTitle();
		webDriver.getCurrentUrl();
		
		//will close only particular window which is opened in multiple tabs
		webDriver.close();		
		
		//will close all browser tabs, instances
		webDriver.quit();
		
		
	}
	
	
	/*Uncomment below code and fill data if this test class implements WebDriver
	* As it mandatory in WebDriver interface
	*/
	
/*
	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
