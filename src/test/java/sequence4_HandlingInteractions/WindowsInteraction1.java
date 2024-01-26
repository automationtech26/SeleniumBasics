package sequence4_HandlingInteractions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsInteraction1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath(".//*[@href='/windows']")).click();		
		System.out.println(driver.findElement(By.xpath(".//*[@class='example']/h3")).getText());
		driver.findElement(By.xpath(".//*[@class='example']/h3/following-sibling::a")).click();		
		Set<String> newWindows = driver.getWindowHandles();
		Iterator<String> windows1 = newWindows.iterator();
		String parentWindow1 = windows1.next();
		String chidWindow1 = windows1.next();
		driver.switchTo().window(chidWindow1);
		System.out.println(driver.findElement(By.xpath(".//*[@class='example']/h3")).getText());
		driver.switchTo().window(parentWindow1);


	}

}
