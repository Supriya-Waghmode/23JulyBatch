package Selenium;


import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		  Thread.sleep(3000);
		  
		  Point d=new Point(100,400);
		  
		  driver.manage().window().setPosition(d);
		  
		  

		
	}

}
