package sequence5_Miscellaneous;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CountLinksInPage {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Find total links in page
		 * Find total links in footer
		 * Open links of 1st column in new tab then fetch title from each tab		 * 
		 * 
		 * 
		 * */
		
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");


		//find total links on page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		/*
		 * .//*[@id='gf-BIG'] is limiting webdriver scope
		 * 
		 * */
		
		
		//Footer links
		System.out.println(driver.findElements(By.xpath(".//*[@id='gf-BIG']//a")).size());
		
		
		
		//Footer link 1 column
		System.out.println(driver.findElements(By.xpath(".//*[@id='gf-BIG']//td[1]/ul//a")).size());		
		List<WebElement> footerColumn1 = driver.findElements(By.xpath(".//*[@id='gf-BIG']//td[1]/ul//a"));
		for(WebElement footerLink : footerColumn1) {
			
			Actions action = new Actions(driver);
			action.moveToElement(footerLink).keyDown(Keys.CONTROL).click().build().perform();

		}
		
		
		//Open all links and fetch title of page
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Number of windows opened" +  windows.size());
	
		Iterator<String> windowIterator = windows.iterator();
		while(windowIterator.hasNext()) {
			driver.switchTo().window(windowIterator.next());
			System.out.println(driver.getTitle());
			driver.switchTo().defaultContent();
		}
	}
}
