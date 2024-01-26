package sequence4_HandlingInteractions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesInteractions {

	public static void main(String[] args) {
		
		
		
		/*
		 * Frames
		 * 
		 * 
		 * */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).build().perform();
		driver.switchTo().defaultContent();
		
		

	}

}
