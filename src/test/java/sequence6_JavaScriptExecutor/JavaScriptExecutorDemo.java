package sequence6_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {
	
	/*
	 * JavascriptExecutor
	 * 
	 * */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor jExecutor = (JavascriptExecutor)driver;
		jExecutor.executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(5000);
		jExecutor.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
	}

}
