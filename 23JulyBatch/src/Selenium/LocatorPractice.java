package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 driver.get("https://www.facebook.com/");
		 
		 //driver.findElement(By.id("email")).sendKeys("Supriya");
		 
		// driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("Supriya@111");
		 
		 //driver.findElement(By.name("pass")).sendKeys("Supriya@111");
		 
		//driver.findElement(By.linkText("Forgotten password? password?")).click();
		 
		 //driver.findElement(By.partialLinkText("Forgotten")).click();
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Supriya");
		
		 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Supriya@11");
		 
		 
	}

}

