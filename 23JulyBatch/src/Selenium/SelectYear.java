package Selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectYear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 
		 /*driver.get("https://www.facebook.com/r.php");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		 WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		 
		 Select ele=new Select(Year);
		 List<WebElement> options = ele.getOptions();
		 
		 System.out.println(options);
		 
		 int size = options.size();
		 System.out.println(size);*/
		 
		 
		 driver.get("https://www.facebook.com/r.php");
         
		 Thread.sleep(2000);
		 
		 WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 Select x= new Select(Month);
		 
		 List<WebElement> Options = x.getOptions();
		 
		 System.out.println(Options);
		 
		 int size=Options.size();
		 
		 System.out.println("List of months:"+size);
		 
		 for(int i=0;i<=Options.size()-1;i++)
		 {
			 System.out.println(Options.get(i).getText());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
