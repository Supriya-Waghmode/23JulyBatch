package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class MultipleScreenShots {
	
	
	

	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 
		 Thread.sleep(2000);
		 
		  /*for(int i=5;i>=1;i--)
		  {
		  
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  String random = RandomString.make(2);
		
		  File dest = new File("C:\\Users\\shubh\\OneDrive\\Pictures\\Screenshots\\testing"+random+".jpeg");
		
		  FileHandler.copy(src, dest);
		  }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		/* for(int i=5;i>=1;i--)
		 {
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String random = RandomString.make(2);
			
			File dest = new File("C:\\Users\\shubh\\OneDrive\\Pictures\\Screenshots\\testing"+random+".jpeg");
			
			FileHandler.copy(src, dest);
		 }*/
		 
		 
		 
		 
		 
		/* for(int i=5;i>=1;i++)
		 {
			  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  
			  String random = RandomString.make(2);
			  
			  File dest = new File("C:\\Users\\shubh\\OneDrive\\Pictures\\Screenshots\\abc"+random+".jpeg");
			  
			  FileHandler.copy(src, dest);
		 }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 for(int i=5;i>=1;i++)
		 {
		 
		   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   String random = RandomString.make(2);
		   
		   File dest = new File("C:\\Users\\shubh\\OneDrive\\Pictures\\Screenshots\\test"+random+".jpeg");
		   
		   FileHandler.copy(src, dest);
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
