package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 
		/* driver.get("https://www.facebook.com/r.php");
		 
		 WebElement text = driver.findElement(By.xpath("//div[@class='large_form']"));
		 
		 String result = text.getText();
		 
		 System.out.println(result);*/
		 
		 
		 
		 
		 
		/* driver.get("https://www.facebook.com/r.php");
		 
		 driver.manage().window().maximize();
		 
		 WebElement text = driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']"));
		 
		 String result = text.getText();
		 
		 System.out.println(result);*/
		 
		 
		 
		 
		 
		 
		 driver.get("https://www.facebook.com/r.php");
		 driver.manage().window().maximize();
		 
	    WebElement text = driver.findElement(By.xpath("//input[@name='lastname']"));
		 
		 String result = text.getText();
		 
		 System.out.println(result);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
