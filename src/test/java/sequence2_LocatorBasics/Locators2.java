package sequence2_LocatorBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {
	
	/*
	 * Tagname
	 * 
	 * */
	
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("test");
		driver.findElement(By.name("inputPassword")).sendKeys("test12");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		
	// Identify locators based on unique tag name locators
			
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "test message for expected data");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container']h2")).getText(), "text message expected one");
		
		driver.findElement(By.xpath(".//*[text()='Log Out']")).click();
		driver.close();
		
	}

}
