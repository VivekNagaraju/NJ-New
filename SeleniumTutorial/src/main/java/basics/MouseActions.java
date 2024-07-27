package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class MouseActions {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");

		// 2. Navigating to test site
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Navigated to practice site");

		// 3. Create Actions class object
		Actions myAction = new Actions(driver);

		// 4. Double Click on CopyText Button
		WebElement copyTxtBtn = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
//		myAction.doubleClick(copyTxtBtn).perform();
		
		// scrolling
		myAction.scrollToElement(copyTxtBtn).perform();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myAction.scrollByAmount(0, 300).perform();
		
		

		
		  // 5. Drag and drop 
		WebElement source=driver.findElement(By.id("draggable"));
		  WebElement target=driver.findElement(By.id("droppable"));
		  myAction.dragAndDrop(source, target).perform();
		 

		/*
		 * // 5. Drag and drop by offset WebElement
		 * source=driver.findElement(By.id("draggable")); myAction.dragAndDropBy(source,
		 * 100, 50).perform();
		 */

	}

}
