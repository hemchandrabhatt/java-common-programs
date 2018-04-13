package webDriverPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CommonTestExamples {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("This is first test case");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.setProperty("webdriver.gecko.driver",
				"E:\\jar-libraries\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
  }

}

System.setProperty("webdriver.gecko.driver",
		"E:\\jar-libraries\\geckodriver-v0.19.0-win64\\geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.get("https://www.amazon.in/");