package basics;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ElementClickInterceptedException;

public class ExplicitWaits {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");

		// 2. Navigating to test site
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Navigated to practice site");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//3. Wikipedia Search
		// 3a. Type in wikipedia Search Box
		WebElement wikipediaSearchBx=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		wikipediaSearchBx.sendKeys("Selenium");
		
		//3b. Click on wikipedia Search Button
		WebElement wikipediaSearchBtn =driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input"));
		wikipediaSearchBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement wikipediaSearchResult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")));
		wikipediaSearchResult.click();
		
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println("Window handles: "+ windowHandles);
		Object[] windowHandlesArray=windowHandles.toArray();
		driver.switchTo().window((String)windowHandlesArray[1]);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)).ignoring(TimeoutException.class);
		
		try {
			WebElement seleniumSoftware = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[1]/a"));
			seleniumSoftware.click();
		} catch (ElementClickInterceptedException e) {
			
			
//			WebElement popUpClose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"vector-dark-mode-launch-banner\"]/div/div[2]/header/button")));
//			popUpClose.click();
			
			WebElement popUpClose = fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"vector-dark-mode-launch-banner\"]/div/div[2]/header/button")));
			popUpClose.click();
			
			System.out.println("PopUp closed");
			
			WebElement seleniumSoftware = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[1]/a"));
			seleniumSoftware.click();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			WebElement seleniumIDE = driver.findElement(By.xpath("//*[@id=\"toc-Selenium_IDE\"]/a/div/span[2]"));
			seleniumIDE.click();
		} catch (ElementClickInterceptedException e) {
			
			
//			WebElement popUpClose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"vector-dark-mode-launch-banner\"]/div/div[2]/header/button")));
//			popUpClose.click();
			
			WebElement popUpClose = fluentWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"vector-dark-mode-launch-banner\"]/div/div[2]/header/button")));
			popUpClose.click();
			
			System.out.println("PopUp closed");
			
			WebElement seleniumIDE = driver.findElement(By.xpath("//*[@id=\"toc-Selenium_IDE\"]/a/div/span[2]"));
			seleniumIDE.click();
		}
	}

}
