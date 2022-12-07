package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 
	 driver.get("https://www.amazon.in/");
	 
	 Thread.sleep(2000);
	 
	 driver.get("https://www.amazon.in/dp/B08L5TNJHG?aaxitk=01219a40deeb166f0d4d6af67217c48a");
	 
	 Thread.sleep(2000);
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 driver.navigate().back();
	 
	 Thread.sleep(2000);
	 driver.navigate().forward();
	 
	 Thread.sleep(3000);
	 
	 driver.navigate().refresh();*/
		
		
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in/dp/B0B4F3G74S/?pf_rd_r=XC0CSNZXFDJPK22RT57R&pf_rd_p=ad2c17da-56fa-473c-8574-cab659495a2a&pd_rd_r=ad9e9e0f-2230-45d2-b50f-edd3fc3a6706&pd_rd_w=2rqO9&pd_rd_wg=lmFj4&ref_=pd_gw_unk");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	 
	 

}
}