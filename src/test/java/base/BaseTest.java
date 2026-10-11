package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

public class BaseTest {

	public WebDriver driver;
	ReadConfig readConfig;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		readConfig = new ReadConfig();
		if(browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        } else if(browser.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();

        } else if(browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else {

            throw new IllegalArgumentException(
                    "Browser not supported: " + browser);
        }
		driver.manage().window().maximize();
		driver.get(readConfig.getApplicationURL());
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
