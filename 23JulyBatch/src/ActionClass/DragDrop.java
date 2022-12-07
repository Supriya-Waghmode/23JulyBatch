package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 
		 /*driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
		 Thread.sleep(2000);
		 
		WebElement amt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 
		 WebElement place = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(amt, place).perform();*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		/* driver.get("https://demo.guru99.com/test/drag_drop.html");
		 
	     WebElement amt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		 
		 Thread.sleep(2000);
		 
		WebElement place = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		 
		 Actions a = new Actions(driver);
		 
		 a.dragAndDrop(amt, place).perform();*/
		 
		 
		 
		 
		 
		 
		 
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Propagation");
		 
		 Thread.sleep(2000);
		 
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[3]/p/iframe"));
		driver.switchTo().frame(iframe); 
		
		 WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable-inner']"));
		 
		 Actions a = new Actions(driver);
		 
		 a.dragAndDrop(drag, drop).perform();
		 
		 
		 
		 
		 /*driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
		 
		 WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		 driver.switchTo().frame(iframe);
		 
		 WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		 Thread.sleep(2000);
		 
		 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		 
		 Actions a = new Actions(driver);
		 
		 //a.dragAndDrop(drag, drop).perform();
		 
		 a.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();*/
		 
		 
		 
		 
		 
		 
		 
		 /*driver.get("https://jqueryui.com/droppable/");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iframe);
		 
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
	    WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		 
		 Actions a = new Actions(driver);
		 
		a.dragAndDrop(drag, drop).perform();*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
