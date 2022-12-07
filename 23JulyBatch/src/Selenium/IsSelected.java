package Selenium;

import org.openqa.selenium.By;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSelected {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 
		 driver.get("https://www.facebook.com/r.php");
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Swarup");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sargar");
		 Thread.sleep(2000);
		 
		 
		 driver.findElement(By.xpath("(//input[contains(@name,'_email_')])[1]")).sendKeys("swarupsargar123@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("swarupsargar123@gmail.com");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("(//input[contains(@class,'_58mg ')])[5]")).sendKeys("Swarup#111");
		 Thread.sleep(2000);
		 
		

		 org.openqa.selenium.WebElement x= driver.findElement(By.xpath("//select[@title='Day']"));
		 Select s=new Select(x);
		 //s.selectByIndex(5);
		 //s.selectByValue("16");
		 s.selectByVisibleText("16");
		 Thread.sleep(2000);
		 
		 org.openqa.selenium.WebElement y = driver.findElement(By.xpath("//select[@title='Month']"));
		 Select month=new Select(y);
		 //month.selectByValue("7");
		 //month.selectByIndex(1);
		 month.selectByVisibleText("Jul");   
		 Thread.sleep(2000);
		 
		 org.openqa.selenium.WebElement z = driver.findElement(By.xpath("//select[@title='Year']"));
		 Select year=new Select(z);
		 //year.selectByIndex();
		 //year.selectByValue("2021");
		 year.selectByVisibleText("2015");
		 Thread.sleep(2000);
		 
		 
		// WebElement male = driver.findElement(By.xpath("//label[text()='Male']"));
		 
		 WebElement male = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		 male.click();
	     boolean result = male.isSelected();
	     System.out.println(result);
	     
	     if(result==true)
	     {
	    	 System.out.println("element is selected");
	     }
	     else
	     {
	    	 System.out.println("element is not selected");
	     }
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		 
		 
		 
		
	}
}

