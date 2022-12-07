package PopUP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		 
		   driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		   Thread.sleep(2000);
		 
		   driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		 
		   driver.switchTo().alert().getText();
		  
		   
		   
		 
	}
}
