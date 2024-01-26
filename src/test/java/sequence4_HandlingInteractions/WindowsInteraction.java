package sequence4_HandlingInteractions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsInteraction {

	public static void main(String[] args) {


		/*
		 * 
		 * handling windows using windowsHandlers
		 * 
		 * */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window = windows.iterator();
		String parentWindow = window.next();
		String childWindow = window.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		driver.switchTo().window(parentWindow);
		

	}

}
