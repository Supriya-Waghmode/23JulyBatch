package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/r.php");
		 
		 /*WebElement att = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		 
		 String result = att.getAttribute("name");
		 System.out.println(result);*/
		 
		 
		 
		 WebElement att = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 String result = att.getAttribute("name");
		 System.out.println(result);
	}

}
