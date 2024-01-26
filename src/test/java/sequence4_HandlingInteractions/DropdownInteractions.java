package sequence4_HandlingInteractions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownInteractions {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		driver.findElement(By.xpath(".//*[@class='inputs ui-autocomplete-input']")).sendKeys("IND");
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath(".//*[@class='ui-menu-item-wrapper']"))).build().perform();
		List<WebElement> countries = driver.findElements(By.xpath(".//*[@class='ui-menu-item-wrapper']"));
		for(WebElement country : countries) {
			if(country.getText().equals("India")) {
				country.click();
			}
		}
	
		System.out.println(driver.findElement(By.xpath(".//*[@id='autocomplete']")).getAttribute("value"));
		
		

	}

}
