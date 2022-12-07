package PopUP;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		/* driver.get("https://skpatro.github.io/demo/links/");
		 
		 driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		 
		 Set<String> ids = driver.getWindowHandles();
		 ArrayList<String> al = new ArrayList<String>(ids);
	 
		  String cw = al.get(1);
		  
		  driver.switchTo().window(cw);
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		  Thread.sleep(5000);
		  
		  driver.switchTo().window(al.get(0));
		  
		  driver.findElement(By.xpath("//input[@name='NewWindow']")).click();*/
		  
		  
		  
		  
		  
		/* driver.get("https://skpatro.github.io/demo/links/");
		 
		 driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		 
		 Set<String> ids = driver.getWindowHandles();
		 ArrayList<String> al = new  ArrayList<String>(ids);
		 
		String cw = al.get(1);
		 
		 driver.switchTo().window(cw);
		 
		 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		 
		 driver.switchTo().window(al.get(0));
		 
		 driver.findElement(By.xpath("//input[@name='NewWindow']")).click();*/
		 
		 
		 
		 
		 driver.get("https://skpatro.github.io/demo/links/");
		 
		 driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		 
		 Set<String> ids = driver.getWindowHandles();
		 ArrayList<String> al = new ArrayList<String>(ids);
		 
		 String cw = al.get(1);
		 
		 driver.switchTo().window(cw);
		 
		 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		 
		 //Thread.sleep(2000);
		 
		 driver.switchTo().window(al.get(0));
		 driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
}
