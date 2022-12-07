package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		// TakesScreenshot driv= new ChromeDriver();
		 
		 
		 driver.get("https://www.amazon.in/");
		 
		 Thread.sleep(2000);
		 
		/*File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		File destination = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Ruturaj\\ss01.jpeg");
		
		FileHandler.copy(src, destination);*/
		
		/* driver.get("https://www.amazon.in/");
		
		File  src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Ruturaj\\supriya.jpeg");
		
		FileHandler.copy(src, dest);*/
		 
		 
		 
		 
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Ruturaj\\ss.jpeg");
		
		FileHandler.copy(src, dest);*/
		 
		 
		 driver.get("");
		 driver.manage().window().maximize();
		 
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("C:\\Users\\shubh\\OneDrive\\Desktop\\Ruturaj\\ss.jpeg");
		 
		 FileHandler.copy(src, dest);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
