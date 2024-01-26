package sequence2_LocatorBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Locators4 {

	public static void main(String[] args) throws InterruptedException {
		
		//Dropdown and checkboxes
		
		/*
		 * Static Dropdown locator with select
		 * 
		 * 
		 * */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement currencyDropdownElement = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currencyDropdown = new Select(currencyDropdownElement);
		currencyDropdown.selectByIndex(3);
		currencyDropdown.getFirstSelectedOption().getText();
		currencyDropdown.selectByVisibleText("AED");
		currencyDropdown.getFirstSelectedOption().getText();
		currencyDropdown.selectByVisibleText("INR");
		currencyDropdown.getFirstSelectedOption().getText();
	
	
	
		
		/*
		 * 
		 * Dropdown looping
		 * 
		 * */

		driver.get("http://spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).getText();		
		for(int i = 1; i < 5; i ++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}		
		int i = 1;		
		while(i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		
		
		
		//ElementNotVisibleException - if locator is present by drowdown is hidden, then either click and open or else provide correct index
		//NoSuchElementException - when incorrect locator
		

		
		/*
		 * 
		 * Dynamic Dropdown with index
		 * testing when 2nd dropdown is displayed once 1st deopdown is selected
		 * 
		 * 
		 * */
		
		driver.findElement(By.id("1st dorpdown locator ID")).click();
		driver.findElement(By.xpath("//a[@value='BANGALORE']")).click();
		Thread.sleep(5000);
		
		//Use (2) for 2nd dropdown which is displayed
		driver.findElement(By.xpath("(//a[@value='CHENNAI'])(2)")).click();
		
		
		
		/* 
		 * Another way to select parent child relation ship for above locator, not parent child relationship traversing
		 * Not parent child traversing like following-sibling::div
		 * 
		 *
		 *
		 */
		driver.findElement(By.xpath(".//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXB']")).click();
		
		
		
		
		
		/*
		 * Auto suggestive dropdown 
		 * 
		 * 1st click that text field and then dropdown will appear then find locator then parse the list of elements
		 * */
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id(".//input[@id='autosuggest']")).click();
		Thread.sleep(5000);
		List<WebElement> elements = driver.findElements(By.cssSelector("li[role='presentation']"));
		for(WebElement element : elements) {
			if(element.getText().equalsIgnoreCase("INDIA"));
			{
				element.click();
				break;			
			}
		}
		
		
		
		
		
		
		
		
		/*
		 * Handling checkboxes
		 * 
		 * 
		 * 
		 * */
		
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath(".//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElements(By.xpath(".//input[@type='checkbox']")));
		
		
	
		
		
		
		
		/*
		 * Check calender options
		 * We can use webelements then use loop
		 * 
		 * */
	
		
		
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
			{
				System.out.println("its enabled");
				Assert.assertTrue(true);
			}
		else
			{
				Assert.assertTrue(false);
			}
	}

}
