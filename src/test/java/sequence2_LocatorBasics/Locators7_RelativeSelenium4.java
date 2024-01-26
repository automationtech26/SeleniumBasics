package sequence2_LocatorBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Locators7_RelativeSelenium4 {
	
	/*   Selenium version - 4
	 * Using above locator  
	 * 						with    above
	 * 						with 	below	
	 * 						with 	left of	
	 * 						with	right of		
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement textbox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(textbox)).getText());
		
		
		
		WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();

		
		
		WebElement iceCreamLabel = driver.findElement(By.xpath(".//*[@for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();
	
	
		WebElement radioButton = driver.findElement(By.xpath(".//*[@value='option1']"));
		driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).click();
		
	
	
	}

}
