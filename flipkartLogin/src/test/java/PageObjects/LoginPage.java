package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

    // Constructor to initialize driver
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
//    private By closeLoginPopup = By.xpath("//button[contains(text(),'✕')]");
    
    private By clickLoginPopup = By.xpath("//div[@class='H6-NpN _3N4_BX']");
    private By emailField = By.xpath("//input[@type='text' and @class='r4vIwl BV+Dqf']");
    private By RequestOTP = By.xpath("//button[text()='Request OTP']");
//    private By passwordField = By.xpath("//input[@type='password']");
//    private By loginButton = By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");

    // Actions
//    public void closeLoginPopup() {
//        driver.findElement(closeLoginPopup).click();
//    }
    
    public void clickLoginPopup() {
    	driver.findElement(clickLoginPopup).click();
    }
    
    
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    
    public void RequestOTP() {
    	driver.findElement(RequestOTP).click();
    }

//    public void enterPassword(String password) {
//        driver.findElement(passwordField).sendKeys(password);
//    }
//
//    public void clickLogin() {
//        driver.findElement(loginButton).click();
//    }
}
