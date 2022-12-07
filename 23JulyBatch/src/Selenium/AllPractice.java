package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllPractice {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shubh\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Swarup");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sargar");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("swarupsargar123@gmail.com");
        Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@name,'reg_email_')])[2]")).sendKeys("swarupsargar123@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Swarup@111");
		Thread.sleep(2000);
		
    	WebElement Day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
    	
    	Select s = new Select(Day);
    	
    	
    	//s.selectByIndex(9);
    	s.selectByValue("8");
    	Thread.sleep(2000);
    	
    	
    	WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
    	
    	Select a=new Select(Month);
    	//a.selectByIndex(6);
    	a.selectByVisibleText("Jul");
    	Thread.sleep(2000);
    	
    	WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
    	
    	Select b = new Select(Year);
    	b.selectByValue("2015");
    	Thread.sleep(2000);
    	
    	
    	 WebElement Male = driver.findElement(By.xpath("//label[text()='Male']"));
    	
    	 Male.click();
    	 
    	 boolean result = Male.isSelected(); 
    	 
    	 if(result==true)
    	 {
    		 System.out.println("Element is selected");
    	 }
    	 else
    	 {
    		 System.out.println("Element is not selected");
    	 }
    	
    	/* WebElement Female = driver.findElement(By.xpath("//label[text()='Female']"));
    	 Female.click();
    	 
    	 boolean result1 = Female.isSelected();
    	 
    	 if(result1==true)
    	 {
    		 System.out.println("Element is selected");
    	 }
    	 else
    	 {
    		 System.out.println("Element is not selected");
    	 }*/
    	 
    	 WebElement Display = driver.findElement(By.xpath("//input[@name='custom_gender']"));
    	 
    	 boolean result2 = Display.isDisplayed();
    	 
    	 if(result2==true)
    	 {
    		 System.out.println("Element is displayed");
    	 }
    	 
    	 else
    	 {
    		 System.out.println("Element is not displayed");
    	 }
    	 Thread.sleep(2000);
    	 
    	 driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
    	 
    	 
    	 
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
