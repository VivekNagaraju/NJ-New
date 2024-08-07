package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstProgram {

	public static void main(String[] args) {
		
		// 1. Launching the Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 2. Navigating to test site
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 3. Enter Name
		// 3(a). Locating the element
		WebElement nameTxtBx = driver.findElement(By.id("name"));
		
		// 3(b). Interact with the element
		nameTxtBx.sendKeys("Vivek");
		nameTxtBx.click();
		
		// 4. Select country
		/*
		 * // 4a. Click on drop down
		WebElement countryDropDown = driver.findElement(By.id("country"));
		countryDropDown.click();
		
		//4b. Click on a country
		WebElement canada = driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]"));
		canada.click();
		 */
		WebElement countryDropDown = driver.findElement(By.id("country"));
		
		Select countrySelect = new Select(countryDropDown);
//		countrySelect.selectByIndex(3);
//		countrySelect.selectByValue("uk");
		countrySelect.selectByVisibleText("India");
		
		
//		driver.quit();

	}

}
