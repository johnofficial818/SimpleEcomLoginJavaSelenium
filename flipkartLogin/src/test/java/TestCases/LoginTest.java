package TestCases;

import PageObjects.LoginPage;
import PageObjects.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {
	private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver
        initializeDriver();
        driver.get("https://www.flipkart.com");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() throws InterruptedException {
        // Perform login actions
//        loginPage.closeLoginPopup();
    	loginPage.clickLoginPopup();
        loginPage.enterEmail("Email or phone number");
        loginPage.RequestOTP();
        Thread.sleep(3000);

        // Add assertions here as needed
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        closeBrowser();
    }
}
