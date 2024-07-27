package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome browser launched");

				// 2. Navigating to test site
				driver.get("https://demo.opencart.com/");
				System.out.println("Navigated to practice site");

				// 3. Create Actions class object
				Actions myAction = new Actions(driver);
				
				// 4. Mouse hover on Desktops
				WebElement desktops = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a"));
				myAction.moveToElement(desktops).perform();


	}

}
