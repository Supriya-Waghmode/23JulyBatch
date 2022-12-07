package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
		
		
	}
	
	
}
