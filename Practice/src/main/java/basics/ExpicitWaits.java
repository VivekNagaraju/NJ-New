package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpicitWaits {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome browser launched");

				// 2. Navigating to test site
				driver.get("https://testautomationpractice.blogspot.com/");
				System.out.println("Navigated to practice site");
				
				//3. Wikipedia Search
				// 3a. Type in wikipedia Search Box
				WebElement wikipediaSearchBx=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
				wikipediaSearchBx.sendKeys("Selenium");
				
				//3b. Click on wikipedia Search Button
				WebElement wikipediaSearchBtn =driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input"));
				wikipediaSearchBtn.click();
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
				WebElement  wikipediaSearchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"wikipedia-search-result-link\\\"]/a")));


	}

}
