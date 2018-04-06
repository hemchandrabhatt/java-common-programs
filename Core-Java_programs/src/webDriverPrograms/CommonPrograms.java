package webDriverPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CommonPrograms {
	WebDriver driver;

	@Test
	public void f() {
	
		System.out.println("This is first test case");
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=-kyrWoS0CK6vX9-9lfgD");
		driver.findElement(By.id("searchform")).sendKeys("selenium");

	}

	@BeforeSuite
	public void beforeSuite() {

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "E:\\jar-libraries\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		 */
		System.setProperty("webdriver.chrome.driver",
				"E:\\jar libraries\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void afterSuite() {

		// driver.quit();
	}

}
