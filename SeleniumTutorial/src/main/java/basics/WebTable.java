package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome browser launched");
				
				// 2. Navigating to test site
				driver.get("https://testautomationpractice.blogspot.com/");
				System.out.println("Navigated to practice site");
				
				/*
				 * //3. Fetching data from each cell of Web Table for(int i = 2; i<=7; i++) {
				 * for(int j = 1; j<=4; j++) { WebElement cell =
				 * driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+
				 * "]/td["+j+"]")); System.out.println(cell.getText());
				 * 
				 * }
				 * 
				 * }
				 */
				
				/*
				 * //3. Fetching data from first cell in each row of Web Table for(int i = 2;
				 * i<=7; i++) {
				 * 
				 * WebElement book =
				 * driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+
				 * "]/td[1]")); System.out.println(book.getText());
				 * 
				 * 
				 * 
				 * }
				 */
				
				/*
				 * //3. Fetching book name and price from Web Table for every book for(int i =
				 * 2; i<=7; i++) {
				 * 
				 * WebElement book =
				 * driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+
				 * "]/td[1]")); System.out.println(book.getText());
				 * 
				 * WebElement price =
				 * driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+
				 * "]/td[4]")); System.out.println(price.getText());
				 * 
				 * 
				 * 
				 * }
				 */
				
				//3. Fetching book name and price from Web Table for particular book
				String expectedBookName = "Master In Selenium";
				for(int i = 2; i<=7; i++) {
					
						WebElement book = driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+"]/td[1]"));
						System.out.println(book.getText());
						
						if(book.getText().equalsIgnoreCase(expectedBookName)) {
							WebElement price = driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+i+"]/td[4]"));
							System.out.println(price.getText());
							break;
						}
						

				}

	}

}
