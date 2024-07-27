package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowForLoop {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");
		
		// 2. Navigating to test site
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Navigated to practice site");
		System.out.println("Current window before wikipedia search: " + driver.getWindowHandle());
		System.out.println("Current page title: " + driver.getTitle());
		
		//3. Wikipedia Search
		// 3a. Type in wikipedia Search Box
		WebElement wikipediaSearchBx=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		wikipediaSearchBx.sendKeys("Selenium");
		
		//3b. Click on wikipedia Search Button
		WebElement wikipediaSearchBtn =driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input"));
		wikipediaSearchBtn.click();
		
		
		
		//3b2. Wait
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3c. Click on wikipedia Search Result
		WebElement wikipediaSearchResult=driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
		wikipediaSearchResult.click();
		System.out.println("Clicked on selenium in wikipedia search");
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println("Window handles: "+ windowHandles);
		Object[] windowHandlesArray=windowHandles.toArray();
		driver.switchTo().window((String)windowHandlesArray[1]);
		System.out.println("Switched to Selenium-wikipedia");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		System.out.println("Current window after wikipedia search: " + driver.getWindowHandle());
		System.out.println("Current page title: " + driver.getTitle());
		
		
		// 4. Switch to first window
		driver.switchTo().window((String)windowHandlesArray[0]);
		System.out.println("Current page title: " + driver.getTitle());
		System.out.println("Switched to first window");
		
		//5. Click on New Browser Window button
		WebElement newBrowserWindowBtn =driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button"));
		newBrowserWindowBtn.click();
		System.out.println("Clicked on New Browser Window button");
		System.out.println("Switching to your store window");
		for(String windowHandle : driver.getWindowHandles()) {
			
			do {
				
				driver.switchTo().window(windowHandle);
				System.out.println(driver.getTitle());
			} while (driver.getTitle() == "Your Store");
			
		}

	}

}
