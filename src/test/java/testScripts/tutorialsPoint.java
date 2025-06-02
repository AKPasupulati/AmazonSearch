package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tutorialsPoint {
	WebDriver driver;
	@BeforeTest
	public void WebDriverIntillization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://market.tutorialspoint.com/course/java-and-oop-concepts-with-interview-tips/index.asp");
		
	}
	@Test
	public void searchBox() {
		WebElement searchBox= driver.findElement(By.id("search-strings"));
		searchBox.sendKeys("Java");
		WebElement searchIcon= driver.findElement(By.xpath("//*[@class='svg-inline--fa fa-magnifying-glass fs-6']"));
		searchIcon.click();
	}
	@AfterTest
	public void quitDriver() {
		driver.quit();
	}
	

}
