package ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.album.alexflueras.ro/index.php");
		 
		 Thread.sleep(2000);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,2000)");
		 Thread.sleep(2000);
		 
		 js.executeScript("window.scrollBy(0,-1000)");
		 Thread.sleep(2000);
		 
		 
		 js.executeScript("window.scrollBy(2000,0)");
		 Thread.sleep(2000);
		 
		 
		 js.executeScript("window.scrollBy(-2000,0)");
		 
	}

}
