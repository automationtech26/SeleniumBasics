package sequence5_Miscellaneous;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture_Selenium4 {

	public static void main(String[] args) throws IOException {

		ScreenshotCapture_Selenium4 ob = new ScreenshotCapture_Selenium4();

		ob.captureLocatorScreenshot();
				
	}
	
	
	
	
	
	//Capture locator screenshot - 
	public void captureLocatorScreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
				
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		File screenshot = driver.findElement(By.xpath(".//*[@class='form-group']//input[@name='name']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\eclipseWorkspace\\SeleniumBasics\\Screenshot\\Screenshot.png"));
		
	}
	

}
