package core;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverFactory {
	private static WebDriver driver;
	
	@Before
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
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver.get("https://www.zoom.com.br");
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
		//killDriver();
		
	}
}
