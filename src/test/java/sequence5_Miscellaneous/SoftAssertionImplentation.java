package sequence5_Miscellaneous;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssertionImplentation {

	public static void main(String[] args) throws IOException {
		
		SoftAssert softAssert = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("Path//.screenshot.jpg"));
		
		
		List<WebElement> links = driver.findElements(By.xpath(".//*[@id='gf-BIG']//tr//ul//a"));
		for(WebElement link: links) {

			//Add JAVA Code here
			HttpURLConnection connection = (HttpURLConnection)new URL(link.getAttribute("href")).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int statusCode = connection.getResponseCode();
			if(statusCode > 400) {
				System.out.println("Broken Link URL text: " + link.getText());
				System.out.println("Broken Link connection status: " + statusCode);
				softAssert.assertTrue(statusCode < 400, "Broken Link URL text: " + link.getText() + " " + "Broken Link connection status: " + statusCode);
			}

		}
		softAssert.assertAll();
	}

}
