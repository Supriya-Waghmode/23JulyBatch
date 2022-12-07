package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableClass {

	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shubh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		/* driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
		List<WebElement> NoofRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println("No of Rows="+NoofRows.size());
		
		
		for(int i=1;i<NoofRows.size();i++)
		{
			List<WebElement> NoofCells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			
			System.out.println(NoofCells.size());
			
			for(int cell=0;cell<NoofCells.size();cell++)
			{
				System.out.print(NoofCells.get(cell).getText());
			}
			System.out.println();
		}*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 driver.get("https://www.w3schools.com/html/html_tables.asp");
		 
	   List<WebElement> NoofRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		 
		 System.out.println("Number of rows="+NoofRows.size());
		 
		 for(int i=1;i<NoofRows.size();i++)
		 {
			 List<WebElement> NoofCells = driver.findElements(By.xpath("//table[@id='customers']//tr[\"+(i+1)+\"]//td"));
			 
			 System.out.println("No of cells="+NoofCells);
		
			 for(int cell=0;cell<NoofCells.size();cell++)
			 {
				 System.out.println(NoofCells.get(cell).getText());
			 }
			 
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
