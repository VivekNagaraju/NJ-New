package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driverManager.WebDriverManager;
import io.cucumber.java.en.When;

public class RecruitmentStepDefinitions {
	
	WebDriver driver = WebDriverManager.getDriver();
	
	@When("User clicks on Recruitment menu item")
	public void user_clicks_on_recruitment_menu_item() {
	   WebElement recruitmentItem=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
	   recruitmentItem.click();
	}

}
