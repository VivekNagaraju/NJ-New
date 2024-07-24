package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		
//		driver.quit();

	}

}
