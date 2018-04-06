package webDriverPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_program {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"E:\\jar libraries\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

		// Put an Implicit wait,
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
		Thread.sleep(500);
		driver.quit();
	}
	
}
