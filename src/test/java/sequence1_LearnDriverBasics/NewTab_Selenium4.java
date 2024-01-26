package sequence1_LearnDriverBasics;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab_Selenium4 {

	/*
	 * Open new window - Tab
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		NewTab_Selenium4 ob = new NewTab_Selenium4();
	//	ob.testInNewTab();
		ob.testInNewWindow();

		

	}
	
	
	
	public void testInNewTab() {
		//open in new tab		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windowsSet = driver.getWindowHandles();
		Iterator<String> windows = windowsSet.iterator();
		String parentWindow = windows.next();
		String childWindow = windows.next();
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String nameOfCourse = driver.findElements(By.xpath(".//*[contains(@href, 'get-access-to-all-courses')]")).get(1).getText();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath(".//*[@class='form-group']//input[@name='name']")).sendKeys(nameOfCourse);
			
	}
	
	
	
	public void testInNewWindow() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowsIterator = windows.iterator();
		String parentWindow = windowsIterator.next();
		String childWIndow = windowsIterator.next();
		driver.switchTo().window(childWIndow);
		driver.get("https://rahulshettyacademy.com/");
		String nameOfCourse = driver.findElements(By.xpath(".//*[contains(@href, 'get-access-to-all-courses')]")).get(1).getText();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath(".//*[@class='form-group']//input[@name='name']")).sendKeys(nameOfCourse);
	
	}

}
