package sequence1_LearnDriverBasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActvities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Synchronization
		 * driver.get waits for page to load complete page
		 * driver.navigate = does not wait for complete page to load and performs next action
		 * 
		 * */
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		
		
	}

}
