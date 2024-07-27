package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SwitchToAlert {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome browser launched");
				
				// 2. Navigating to test site
				driver.get("https://testautomationpractice.blogspot.com/");
				System.out.println("Navigated to practice site");
				
				//3. Click on Alert Button 
				WebElement alertBtn=driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]"));
				alertBtn.click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.switchTo().alert().accept();
				
				driver.switchTo().alert().sendKeys(null);

	}

}
