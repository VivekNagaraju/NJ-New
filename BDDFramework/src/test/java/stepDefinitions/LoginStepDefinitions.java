package stepDefinitions;

import static org.junit.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStepDefinitions {
	WebDriver driver;
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
		WebElement usernametxtbx=driver.findElement(By.name("username"));
		usernametxtbx.sendKeys("Admin");
	}

	@When("User enters password")
	public void user_enters_password() {
		WebElement passwordtxtbx=driver.findElement(By.name("password"));
		passwordtxtbx.sendKeys("admin123");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		WebElement loginBtn=driver.findElement(By.tagName("button"));
		loginBtn.click();
	}

	@Then("User should be on dashboard page")
	public void user_should_be_on_dashboard_page() {
		WebElement dashboard = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span"));
		assertTrue(dashboard.isDisplayed());
	}

}
