package sequence6_JavaScriptExecutor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		

		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("window.scrollBy(0, 500)");
		
		// rows:  .//table[@id='product']//tr
		
		//columns: .//*[@id='product']//tbody/tr/th
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath(".//table[@id='product']//tr"));
		System.out.println(rows.size());
		
		List<WebElement> columns = driver.findElements(By.xpath(".//*[@id='product']//tbody/tr/th"));
		System.out.println(columns.size());
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='product']//tbody/tr[3]")).getText());
		
		

	}

}
