package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class SwitchToWindow {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				// 2. Navigating to test site
				driver.get("https://testautomationpractice.blogspot.com/");
				
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
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//3c. Click on wikipedia Search Result
				WebElement wikipediaSearchResult=driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
				wikipediaSearchResult.click();
				
				Set<String> windowHandles=driver.getWindowHandles();
				System.out.println("Window handles: "+ windowHandles);
				Object[] windowHandlesArray=windowHandles.toArray();
				driver.switchTo().window((String)windowHandlesArray[1]);
				
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
				
				//5. Click on New Browser Window button
				WebElement newBrowserWindowBtn =driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button"));
				newBrowserWindowBtn.click();
				
				//6. Switch to open cart window
				//6a. collect the present window handles
				Set<String> windowHandles2=driver.getWindowHandles();
				System.out.println("Window handles: "+ windowHandles2);
				Object[] windowHandlesArray2=windowHandles2.toArray();
				driver.switchTo().window((String)windowHandlesArray2[2]);
				System.out.println("Current page title: " + driver.getTitle());
				
	}
}