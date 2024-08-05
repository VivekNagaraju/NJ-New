package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ValidationInSelenium {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome browser launched");
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				// 2. Navigating to test site
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				System.out.println("Navigated to Orange HRM site");
				
				//3. Validation
				WebElement loginTitle=driver.findElement(By.tagName("h5"));
				
				  if(loginTitle.isDisplayed() == true) {
				  
				  System.out.println("TEST PASSED"); }
				  else { 
					  System.out.println("TEST FAILED");
				  }
				 
				
				
	}

}
