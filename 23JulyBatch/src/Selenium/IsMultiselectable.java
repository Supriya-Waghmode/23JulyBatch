package Selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiselectable {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 
		 //driver.get("https://www.facebook.com/r.php");
		 
		 //Thread.sleep(2000);
		 
		 
		 /*WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 Select ele = new Select(Month);
		 
	   boolean result = ele.isMultiple();		
	   
	   System.out.println(result);
		 
      if(result==true)
      {
    	  System.out.println("listbox is multiselectable");
      }
      else
      {
    	  System.out.println("Listbox is not multiselectable");
      }*/
		 
		 
		 
		 
		 
		 
		 
		 
		/* WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 
		 Select ele=new Select(month);
		 
		 boolean result = ele.isMultiple();
		 
		 System.out.println(result);
		 
		 if(result==true)
		 {
			 System.out.println("Listbox is multiselectable");
		 }
		 else
		 {
			 System.out.println("Listbox is not multiselectable");
		 }*/
		 
		 
		 
		 
		 
        /* driver.get("https://www.facebook.com/r.php");
		 
		 Thread.sleep(2000);
		 
		 WebElement Day = driver.findElement(By.xpath("//select[@title='Day']"));
		 
		 Select Y= new Select(Day);
		 
		   boolean result = Y.isMultiple();
		   
		   System.out.println(result);
		   
		   if(result==true)
		   {
			   System.out.println("Listbox is multiselectable");
		   }
		   else
		   {
			   System.out.println("Listbox is not multiselectable");
		   }*/
		 
		 
		 
		 
		  driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		  
		  Thread.sleep(2000);
		  
		   WebElement Brand = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base')])[50]"));
		   
		   Select Z=new Select(Brand);
		   
		   boolean result = Z.isMultiple();
		   
		   System.out.println(result);
		   
		   if(result==true)
		   {
			   System.out.println("Listbox is multiselectable");
		   }
		   else
		   {
			   System.out.println("Listbox is not multiselectable");
		   }
		  
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
