package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yogita {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/r.php");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yogita");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Waghmode");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("yogitawaghmode2003@gmail.com");
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Yogita@111");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("yogitawaghmode2003@gmail.com");
		Thread.sleep(2000);
		

		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(day);
		s.selectByValue("1");
		
	}

}
