package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			prop.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public String getApplicationURL() {
		return prop.getProperty("url");
	}
}
