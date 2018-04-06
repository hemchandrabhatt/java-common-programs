package webDriverPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomisingXPathAndCssSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"E:\\jar libraries\\geckodriver-v0.19.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//WebElement e1 = driver.findElement(By.xpath("html/body[1]/div[1]/div[3]/form[1]//div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		//WebElement e1 = driver.findElement(By.cssSelector("html>body:nth-child(2)>div:nth-child(1)>div:nth-child(5)>form:nth-child(5)>div:nth-child(2)>div:nth-child(2)>div:nth-child(1)>div:nth-child(1)>div:nth-child(2)>div:nth-child(2)>div:nth-child(1)>div:nth-child(2)>div:nth-child(1)>input:nth-child(1)"));
		//e1.sendKeys("Hem Chandra Bhatt");
	
		//e1.sendKeys(Keys.RETURN);
		
		

	}

}
