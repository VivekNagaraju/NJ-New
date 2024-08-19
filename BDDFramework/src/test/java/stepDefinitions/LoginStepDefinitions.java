package stepDefinitions;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import driverManager.WebDriverManager;
import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class LoginStepDefinitions {
//	WebDriver driver;
	LoginPage loginPage;
	WebDriver driver = WebDriverManager.getDriver();
	@Given("Chrome browser is launched")
	public void chrome_browser_is_launched() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome browser launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("User navigated to OrangeHRM Login Page")
	public void user_navigated_to_orange_hrm_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enters username")
	public void user_enters_username() {
		loginPage = new LoginPage(driver);
		loginPage.enterUserName("Admin");
	}

	@When("User enters password")
	public void user_enters_password() {
		loginPage.enterPassword("admin123");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.clickOnLogin();
	}

	@Then("User should be on dashboard page")
	public void user_should_be_on_dashboard_page() {
		WebElement dashboard = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span"));
		assertTrue(dashboard.isDisplayed());
	}

}
