package sequence2_LocatorBasics;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators6 {

	public static void main(String[] args) {

		/*
		 * Adding products in array and pick selective one
		 * 
		 * 
		 * 
		 * */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
		List<WebElement> addToCarts = driver.findElements(By.xpath(".//div[@class='product-action']/button"));
		
		String[] itemsNeeded = {"item1", "item2", "item3"};		
		
		int addToCartItemCount = 0;
		for(int i = 0; i<productNames.size(); i++) {
			
			String[] productName = productNames.get(i).getText().split(" ");
			
			if(Arrays.asList(itemsNeeded).contains(productName[0])) {
				addToCarts.get(i).click();
				addToCartItemCount++;								
			}
			
			if(addToCartItemCount == itemsNeeded.length) {
				break;
			}
		}

	}

}
