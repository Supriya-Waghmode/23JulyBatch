package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		/* driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(1000);
		 
		 
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(2000);
		 
		  WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		 // Thread.sleep(1000);
		 
		 Actions a = new Actions(driver);
		 
		 a.moveToElement(login).perform();
		 
		 
		 WebElement orders = driver.findElement(By.xpath("//div[text()='Orders']"));
		 
		//a.contextClick(orders).perform();
		 a.click(orders).perform();*/
		 
		 
		 
		 
		 
		 /*driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		 
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		 
		 Thread.sleep(2000);
		 
		 Actions a = new Actions(driver);
		 
		 a.moveToElement(login).perform();
		 
		WebElement orders = driver.findElement(By.xpath("(//div[@class='_3vhnxf'])[3]"));
		 
		 
		// a.contextClick(orders).perform();
		 
		a.click(orders).perform();*/
		 
		 
		 
		 
		 
		 
		 /*driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		 
		 Thread.sleep(2000);
		 
		 Actions a = new Actions(driver);
		 
		 a.moveToElement(login).perform();
		 
		 WebElement orders = driver.findElement(By.xpath("//div[@class='_3vhnxf'])[3]"));
		 
		 a.click(orders).perform();
		 
		 a.contextClick(orders).perform();*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		 
		 Thread.sleep(2000);
		 
		 Actions a = new Actions(driver);
		 
		 a.moveToElement(login).perform();
		 
		 WebElement orders = driver.findElement(By.xpath("//div[text()='Orders']"));
		 
		 //a.click(orders).perform();
		 
		 a.contextClick(orders).perform();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}
}

