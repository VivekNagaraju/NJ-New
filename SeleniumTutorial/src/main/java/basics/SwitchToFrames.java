package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SwitchToFrames {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");
		
		// 2. Navigating to test site
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Navigated to practice site");
		
		// 3. Switch to child Frame
		driver.switchTo().frame("frame-one796456169");
		System.out.println("Switched to child frame");
		
		// 4. Enter name inside frames
		WebElement nameTxtField=driver.findElement(By.id("RESULT_TextField-0"));
		nameTxtField.sendKeys("Vivek");
		System.out.println("Entered name inside child frame");
		
		// 4.2 Select Gender
		WebElement genderMale=driver.findElement(By.xpath("//*[@id=\"q2\"]/table/tbody/tr[2]/td/label"));
		genderMale.click();
		
		/*
		 * // 5. Switch to parent frame driver.switchTo().parentFrame();
		 * 
		 * // 6. Enter name in parent frame WebElement nameTxtBx =
		 * driver.findElement(By.id("name")); nameTxtBx.sendKeys("Vivek");
		 */

	}

}
