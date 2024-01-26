package sequence2_LocatorBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {


		/*
		 * Siblings XPATH Traverse
		 * Parent to child   =  xpath/following-sibling::xpath
		 * */

		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();

		
		
		//Note - in cssSelector - we can't navigate like these in XPATH
		
		/*
		 * Traverse child to parent = 	xpath/parent::xpath
		 * */
		
		//parent to parent to grand parent to parent to child
		
		driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
		
	}

}
