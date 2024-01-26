package sequence5_Miscellaneous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		/*
		 * Java alerts
		 * 
		 * */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.id("name")).sendKeys("test");
		driver.findElement(By.cssSelector("id='alertBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmBtn")).click();
		driver.switchTo().alert().dismiss();

		
		
		
		
	}

}
