package webDriverPrograms;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverFirstProgram {

	public static void main(String[] args) {

		// System.setProperty("webdriver.gecko.driver", "");
		System.setProperty("webdriver.gecko.driver",
				"E:\\jar libraries\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		// driver.close();
		driver.get("https://www.google.com");
		// driver.close();
		WebElement element1 = driver.findElement(By
				.xpath("//*[@id='gs_htif0']"));
		element1.sendKeys("Hem Chandra Bhatt");
		element1.sendKeys(Keys.RETURN);
		// driver.switchTo().activeElement();
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		WebDriver driver1 = new FirefoxDriver();
		//WebDriverWait wait =new WebDriverWait(driver, 40);
		//driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.);
		//Thread.sleep(40);
		String str1 = driver.getTitle();
		System.out.println(str1);

		/*
		 * String mainWindow = driver.getWindowHandle(); Set<String> handles =
		 * driver.getWindowHandles(); for (String handle : handles) { //Object
		 * handler; if (!handles.equals(mainWindow)) { driver.switchTo(); String
		 * str1= driver.getTitle(); System.out.println(str1); }
		 * 
		 * 
		 * }
		 */

		/*
		 * String Parent_Window = driver.getWindowHandle(); for (String
		 * Child_Window : driver.getWindowHandles()) {
		 * driver.switchTo().window(Child_Window); String str1=
		 * driver.getTitle(); System.out.println(str1); }
		 * driver.switchTo().window(Parent_Window);
		 */
		
		File file = ((TakesScreenshot)driver1).getScreenshotAs(OutPut.file);
		
		driver.quit();
		
		WebElement table=driver.findElement(By.id(""));
	}

}
