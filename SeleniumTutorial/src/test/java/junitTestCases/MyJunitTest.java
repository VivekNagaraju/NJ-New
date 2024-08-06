package junitTestCases;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyJunitTest {

	@Test
	public void testOrangeHRMNavigation() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		// 1. Launching the Chrome browser
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 2. Navigating to test site
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Navigated to Orange HRM site");
		
		//3. Validation
		WebElement loginTitle=driver.findElement(By.tagName("h5"));
//		assertTrue(loginTitle.isDisplayed());
		assertFalse(loginTitle.isDisplayed());
	}
	
	@Test
	public void testOrangeHRMLogin() {
		// 1. Launching the Chrome browser
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome browser launched");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				// 2. Navigating to test site
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				System.out.println("Navigated to Orange HRM site");
				
				//3. Enter username, password and click on  login button
				WebElement usernametxtbx=driver.findElement(By.name("username"));
				usernametxtbx.sendKeys("Admin");
				
				WebElement passwordtxtbx=driver.findElement(By.name("password"));
				passwordtxtbx.sendKeys("admin123");
				
				WebElement loginBtn=driver.findElement(By.tagName("button"));
				loginBtn.click();
				
				
		
	}

}
