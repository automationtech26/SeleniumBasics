package sequence5_Miscellaneous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AlertHandling {

	public static void main(String[] args) {
		
		
		/*
		 * Select check box and fetch text
		 * Select same text - radio button and fetch label
		 * Enter same text in text field and click alert
		 * Navigate to alert and compare message in alert button
		 * 
		 * 
		 * 
		 * 
		 * */


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath(".//*[@id='checkbox-example']//label[2]/input")).click();
		String checkBoxText = driver.findElement(By.xpath(".//*[@id='checkbox-example']//label[2]")).getText().trim();
		System.out.println("checkBoxText: " + checkBoxText);
		
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@name='dropdown-class-example']")));
		dropdown.selectByVisibleText(checkBoxText);
		
		String selectedDropDownText = dropdown.getFirstSelectedOption().getText();
		System.out.println("selectedDropDownText: " + selectedDropDownText);
		
		
		driver.findElement(By.xpath(".//*[@name='enter-name']")).sendKeys(selectedDropDownText);
		driver.findElement(By.xpath(".//*[@id='alertbtn']")).click();
		Assert.assertTrue(driver.switchTo().alert().getText().contains(selectedDropDownText), "Text not present");

		
		
	}

}
