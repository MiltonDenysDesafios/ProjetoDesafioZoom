package core;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;

public class DriverFactory {
	private static WebDriver driver;

	public static WebDriver getDriver() {

		try {
			if (driver == null) {
				switch (Properties.browser) {
				case FIREFOX:
					driver = new FirefoxDriver();
					break;
				case CHROME:
					System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
					driver = new ChromeDriver();
					break;
				}
				driver.manage().window().maximize();

			}
		} catch (Exception e) {

		}

		return driver;

	}

	public static void killDriver() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
	@After
	public void finaliza() throws IOException{			
		killDriver();
		
	}
}
