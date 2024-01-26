package sequence5_Miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//	String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");
		
		List<WebElement> links = driver.findElements(By.xpath(".//*[@id='gf-BIG']//tr//ul//a"));
		for(WebElement link: links) {
			//Java code now - 
			HttpURLConnection conn = (HttpURLConnection)new URL(link.getAttribute("href")).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
			if(responseCode > 400) {
				System.out.println("Broken Link URL text: " + link.getText());
				System.out.println("Broken Link connection status: " + responseCode);
			//	Add assertion
				
			}
			/*
			else {
				System.out.println("URL text: " + link.getText());
				System.out.println("connection status: " + responseCode);
			}
			
			*/
		}
		
		

		
		
		/*
		200 - success
		404 - failure
		*/
		
	}

}
