package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class KeyboardActions {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome browser launched");

				// 2. Navigating to test site
				driver.get("https://testautomationpractice.blogspot.com/");
				System.out.println("Navigated to practice site");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				// 3. Create Actions class object
				Actions myAction = new Actions(driver);
				
				// 4. Copy text from Field 1 to Field 2
				WebElement field1 = driver.findElement(By.id("field1"));
				WebElement field2 = driver.findElement(By.id("field2"));
				
				// 4a. Ctrl+a in field1
				myAction.click(field1).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
				
				// 4b. Ctrl+c in field1
				myAction.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
				
				// 4c. Ctrl+v in field2
				myAction.click(field2).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				

	}

}
