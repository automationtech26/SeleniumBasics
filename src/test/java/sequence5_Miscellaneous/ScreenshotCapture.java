package sequence5_Miscellaneous;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture {

	public static void main(String[] args) throws IOException {

		ScreenshotCapture ob = new ScreenshotCapture();
		ob.captureFullPageScreenshot();
					
	}
	
	
	//Capture full page screenshot - 
	public void captureFullPageScreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://google.com");
		driver.manage().deleteAllCookies();	
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\eclipseWorkspace\\SeleniumBasics\\Screenshot\\Screenshot.png"));
		
	}
	
	
	
	

}
