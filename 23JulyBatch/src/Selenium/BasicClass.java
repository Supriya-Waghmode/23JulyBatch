
package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty(""
				+ "webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.facebook.com/r.php");// TO LAUNCH THE URL AND NAVIGATE TO THAT PAGE.
		
	    Thread.sleep(2000);
		
	    driver.close();//IT IS USED TO CLOSE THE SINGLE TAB ONLY.
	    
	    driver.quit(); //IT IS USED TO CLOSE ALL THE TABS ON THE BROWSER.
	    
	   String title = driver.getTitle();
	    
	    System.out.println(title);// IT WILL PRINT ACTUAL TITLE
	    
	   String exptitle = "Up For Facebook";
	 
	    
	    if(title.equalsIgnoreCase(exptitle))
	    {
	    	System.out.println("Navigate to correct page");
	    }
	    else
	    {
	    	System.out.println("Navigate to wrong page");
	    }
	    
	    
	    
		
		
		
	}

}
