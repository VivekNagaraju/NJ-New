package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");

		// 2. Navigating to test site
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println("Navigated to practice site");

		// 3. Create Actions class object
		Actions myAction = new Actions(driver);
		
		// 4. Right click on 'right click me' button
		WebElement rightClickMe=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		myAction.contextClick(rightClickMe).perform();
	}

}
