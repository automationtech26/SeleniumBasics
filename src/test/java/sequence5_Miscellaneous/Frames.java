package sequence5_Miscellaneous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath(".//*[@href='/nested_frames']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath(".//*[@name='frame-middle']")));
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='content']")).getText());

	}

}
