package PopUP;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		/* driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		 
		 driver.findElement(By.xpath("//button[@id='prompt']")).click();
		 
		 Thread.sleep(2000);
		 
		 Alert alt = driver.switchTo().alert();
		 
		  alt.sendKeys("Supriya");
		 // alt.accept();
		  alt.dismiss();*/
		 
		 
		 
		 
		 
		/* driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		 
		 driver.findElement(By.xpath("//button[@id='prompt']")).click();
		 Thread.sleep(2000);
		 
		 Alert alt = driver.switchTo().alert();
		 
		 alt.sendKeys("Supriya");
		 
		 alt.accept();*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[@id='prompt']")).click();
		 
		 Alert alt = driver.switchTo().alert();
		 Thread.sleep(2000);
		 alt.sendKeys("Swarup");
		 alt.accept();

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		  
		  
	}
}
