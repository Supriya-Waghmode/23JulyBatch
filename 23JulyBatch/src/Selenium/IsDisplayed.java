package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 
		 driver.get("https://www.facebook.com/r.php");
		
		 
		WebElement display = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		 boolean result = display.isDisplayed();
		 
		 System.out.println(result);
		 
		 if(result==true)
		 {
			 System.out.println("element is displayed");
		 }
		 
		 else
		 {
			 System.out.println("element is not displayed");
		 }
		 
		 
		 
		 
		 
		 
		/*WebElement display = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 
		 boolean result = display.isDisplayed();
		 
		 System.out.println(result);
		 
		 if(result==true)
		 {
			 System.out.println("element is displayed");
		 }
		 else
		 {
			 System.out.println("element is not displayed");
		 }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
