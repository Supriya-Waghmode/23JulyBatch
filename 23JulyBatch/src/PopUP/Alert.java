package PopUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 /*driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		 
		 driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		 
		 Thread.sleep(2000);
		 
		// driver.switchTo().alert().accept();
		 
		 driver.switchTo().alert().dismiss();*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		 
        driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
 
        Thread.sleep(2000);
        
       
        
        //driver.switchTo().alert().accept();
        
		 driver.switchTo().alert().dismiss();*/
		 
		 
		 driver.get("https://nxtgenaiacademy.com/alertandpopup");
		 
		 driver.findElement(By.xpath("\"//button[@name='confirmalertbox']")).click();
		 
		// driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss();
		 
	}

}
