package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	 WebElement mobile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email__']")));
	 mobile.sendKeys("9922461645");
	 
	 driver.get("https://www.facebook.com/r.php");
	 
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Supriya");
	 
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Waghmode");
	 
	 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9922461645");
	 
	 
	 
	
	
	
	
}
}