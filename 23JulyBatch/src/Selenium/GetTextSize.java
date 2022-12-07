package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTextSize {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 
		 driver.get("https://www.facebook.com/r.php");
		 
		 Thread.sleep(2000);
		 
//		 WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
//		 
//		 Select ele = new Select(Year);
//		 
//      		 List<WebElement> options = ele.getOptions();
//      		 
//      		 System.out.println(options);
//      		 
//      		 int size=options.size();
//      		 System.out.println("List of size:"+size);
//      		 
//      		
//			for(int i=0;i<=options.size()-1;i++)
//			{
//				System.out.println(options.get(i).getText());
//			}
		 
		 
		    /*WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		 
		    Select ele = new Select(Year);
		    
		    List<WebElement> options = ele.getOptions();
		    int size=options.size();
		    System.out.println(size);
		    
		    for(int i=0;i<=options.size()-1;i++)
		    {
		    	System.out.println(options.get(i).getText());
		    }*/
		 
		 
		/*WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select ele=new Select(Month);
		
		 List<WebElement> options = ele.getOptions();
		 int size=options.size();
		 
		 System.out.println(size);
		 
		 for(int i=0;i<=options.size()-1;i++)
		 {
			 System.out.println(options.get(i).getText());
		 }*/
		 
		 
		 
		 
		 
		 
		 
		/* WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 
		 Select ele = new Select(Month);
		 
		 List<WebElement> options = ele.getOptions();
		 
		 int size=options.size();
		 System.out.println("List of months:"+size);
		 
		 for(int i=0;i<=options.size()-1;i++)
		 {
			 System.out.println(options.get(i).getText());
		 }*/
		 
		 
		 WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		 
		 Select ele = new Select(Day);
		 
		 List<WebElement> options = ele.getOptions();
		 
		 System.out.println(options);
		 
		 int size=options.size();
		 
		 System.out.println("List og days:"+size);
		 
		 for(int i=0;i<=options.size()-1;i++)
		 {
			 System.out.println(options.get(i).getText());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		    
		  
		  
		 
		 
		 
				
	}

}
