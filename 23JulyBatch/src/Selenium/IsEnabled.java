package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/r.php");
		 
		boolean result = driver.findElement(By.xpath("(//button[@type='submit'])[1]")).isEnabled();
		 
		 System.out.println(result);
		 
		 if(result==true)
		 {
			 System.out.println("element is enabled");
		 }
		 else
		 {
			 System.out.println("element is disabled");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		  /* WebElement enable = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));	
		   
		   boolean result = enable.isEnabled();
		   System.out.println(result);
		   
		   
		if(result==true)
		{
		System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}*/
		   
		   
		
	}
	
	
}
