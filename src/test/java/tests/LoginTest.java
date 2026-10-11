package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.ExcelUtils;

public class LoginTest extends BaseTest {

	LoginPage loginPage;
	
	@Test
	public void loginTest() {
		String email = ExcelUtils.getCellData(0, 0);
		String pass = ExcelUtils.getCellData(0, 1);
		new LoginPage(driver).enterEmail(email);
		new LoginPage(driver).enterPassword(pass);
		new LoginPage(driver).clickLogin();
		System.out.println("Login test completed successfully.");		
	}
}
