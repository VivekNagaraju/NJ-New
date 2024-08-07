package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) {
		// 1. Launching the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");
		
		// 2. Navigating to test site
		driver.get("https://testautomationpractice.blogspot.com/");
		System.out.println("Navigated to practice site");
		
		//3. Fetching price from Pagination Table for a particular product
		List<WebElement> productTableRows = driver.findElements(By.xpath("//*[@id='productTable']/tbody/tr"));
		System.out.println(productTableRows);
		int productTableRowsSize = productTableRows.size();
		System.out.println("productTableRowsSize->"+productTableRowsSize);
		
		List<WebElement> pages = driver.findElements(By.xpath("//*[@id='pagination']/li"));
		int pagesCount = pages.size();
		System.out.println("pagesCount->"+pagesCount);
		
		
		String expectedProductName = "Product 7";
		boolean exitPage = false;
		for(int j=1; j<=pagesCount; j++) {
			WebElement page = driver.findElement(By.xpath("//*[@id='pagination']/li["+j+"]/a"));
			page.click();
			for(int i =1; i<=productTableRowsSize; i++) {
				
				WebElement product = driver.findElement(By.xpath("//*[@id='productTable']/tbody/tr["+i+"]/td[2]"));
				System.out.println(product.getText());
				
				if(product.getText().equalsIgnoreCase(expectedProductName)) {
					WebElement price = driver.findElement(By.xpath("//*[@id='productTable']/tbody/tr["+i+"]/td[3]"));
					System.out.println(price.getText());
					exitPage = true;
					break;
				}
			}
			if(exitPage == true) {
				break;
			}
			
		}
	}

}
	
	
