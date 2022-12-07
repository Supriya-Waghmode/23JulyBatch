package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 /*driver.get("https://www.facebook.com/login/");
		 
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 
		 System.out.println(links.size());
		 
		 for(int i=0;i<links.size();i++)
		 {
			 System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
		 }*/
		 
		 
		 
		 
		 
		 
		 /*driver.get("https://www.facebook.com/login/");
		 
		 Thread.sleep(2000);
		 
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		 
		  System.out.println(links.size());
		  
		  for(int i=0;i<links.size();i++)
		  {
			  System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
		  }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 /*driver.get("https://www.facebook.com/login/");
		 
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 
		 System.out.println(links.size());
		 
		 for(int i=0;i<links.size();i++)
		 {
			 System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
			 
		 }*/
		 
		 
		 
		 
		 
		 
		 driver.get("https://www.facebook.com/login/");
		 
	    List<WebElement> links = driver.findElements(By.xpath("//a"));
		 
	    
	    System.out.println(links.get(1).getText());//to show only one link
		// System.out.println(links.size());//To show the multiple link size
		 
//		 for(int i=0;i<links.size();i++)
//		 {
//			 System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
//		 }
//		 
//		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
}
