package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		 
		 WebElement iframe = driver.findElement(By.xpath("//iframe[@id='google_esf']"));
		 
		 driver.switchTo().frame(iframe);
		 
		 driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Selenium");
		 Thread.sleep(2000);
		 
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//li[@id='Open New Window']")).click();
		 
		 
		 
		 
		 
		 
		 
	}
}
