package Selenium;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TimeSpanSreenshot {


	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shubh\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		/*Calendar cal = Calender.getInstance();
		 
		 Date time = cal.getTime();
		 
		 String timeStamp = time.toString().replace(":" ,"").replace(" ",""); 
		 
		 System.out.println(time);
		 
		 System.out.println(timeStamp);*/
		 
		 
		
		
		
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
	    File destination = new File("C:\\Users\\shubh\\OneDrive\\Pictures\\Screenshots\\Swar"+timeStamp()+".jpeg");
		  //if we use the above calender code then we concat with only timestamp...(no timestamp()...)
	    
	    
		FileHandler.copy(src, destination);
	}
	
	

    public static String timeStamp()
     {
    	 return new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date());
     }
}



