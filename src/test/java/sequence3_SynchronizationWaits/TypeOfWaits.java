package sequence3_SynchronizationWaits;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TypeOfWaits {

	public static void main(String[] args) {
		/*
		 * 
		 * ImplicitWait
		 * 
		 * Is used during browser instantiation for applying globally
		 * Thereafter it will error
		 * Listening to DOM
		 * 
		 * 
		 * Advantages: 
		 * Its globally defined, means it will applied to each and every page
		 * If result is is displayed before implicit defined time then it will not wait for more time
		 * Coding is less code
		 * 
		 * 
		 * Disadvantage:
		 * If any test case need more time then it will fail
		 * Performance issues are not caught as its getting applied in all levels
		 * 
		 * 
		 * */

		
		
		
		
		
		/*
		 * 
		 * Explicit Wait
		 * 
		 * Specific wait for some test cases apart from global implicit wait
		 * So no performance issues as its targeted wait on locator
		 * 
		 * It will check for max defined time then timeout, and in case it gets before then it will go to next step
		 * It will monitor every milli second in the DOM
		 * 
		 * WebDriverWait Implements Wait interface
		 * 
		 * Disadvantage:-
		 * Coding is more
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		/*
		 * 
		 * Fluent Wait
		 * 
		 * Is also part of explicit wait
		 * But it will keep checking as per polling second defined, means at regular interval of time
		 * Means not like regular explicitWait 
		 * 
		 * Both will exit if object is displayed
		 * 
		 * FluentWait Implements Wait interface
		 * 
		 * 
		 * 
		 * Disadvantage:
		 * Code is complex, compared to above waits
		 * 
		 * 
		 * */
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		
		
		
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
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		
		
		
		//Explicit Wait
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		
		
		
		
		//Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(10))
									.pollingEvery(Duration.ofSeconds(4))
									.ignoring(NoSuchElementException.class);
	
		WebElement checkFluentWait = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
				
			}
			
		});

	//Now here we can use above element - checkFluentWait
		
		}
	
	

		
		
	}


