package driverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {
	
	@Before
    public void setUp() {
        // This will initialize the WebDriver before each scenario
        WebDriverManager.getDriver();
    }

    @After
    public void tearDown() {
        // This will close the WebDriver after each scenario
        WebDriverManager.closeDriver();
    }

}
