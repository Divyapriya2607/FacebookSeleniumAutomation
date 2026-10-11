package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "pass")
	WebElement password;
	
	@FindBy(xpath= "//div[@role = 'button']")
	WebElement loginBtn;
	
	public void enterEmail(String email) {
		this.email.sendKeys(email);
	}
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	public void clickLogin() {
		loginBtn.click();
	}
}
