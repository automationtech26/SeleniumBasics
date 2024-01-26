package sequence2_LocatorBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
				
		// Locators
		/*
		 * ID
		 * XPATH
		 * CSS Selector----> we need to remove //, /, @ from the locator value of xpath, then this value will become css selector
		 * Name
		 * Class Name
		 * Tag name
		 * link Text
		 * Partial Link Text 
     	 * */
		
		
		WebDriver driver = new ChromeDriver();
	
	// This wait will be used when locator is not loaded, else use Thread sleep	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("testP");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	
	// both classnames are not required in below value
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
	
		
	//  Approach of writing css selector is add . between class names and if its ID xpath locator then add # before for converting it to CSS Selector
		driver.findElement(By.cssSelector("p.error")).getText();
		driver.findElement(By.xpath("//input[@placeholder='Name'])")).click();
	
	//  for writing css selector - simply remove //, /, @ from xpaths
		driver.findElement(By.cssSelector("input[placeOrder='Email']")).sendKeys("john@rsa.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("test@gmail.com");
	
	//Parent to child traversing in xpath	
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("782364782348");

	//	Below line will throw - ElementClickInterceptedExecption, specially in single page - angular websites
		//Add some sleep like 
		Thread.sleep(10000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
	//Parent to child traversing in CSS
		driver.findElement(By.cssSelector("form p")).getText();
		
	// regex locators when class names are getting dynamic
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-container']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("test");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("test");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
		
	
		
	}

}
