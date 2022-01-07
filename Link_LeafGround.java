package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link_LeafGround {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
        driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
        
	     String url1 = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		 System.out.println("Valid URL:"+url1);
	 
		 String url2 = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		 System.out.println("The broken URL is "+ url2);
		 
		 if(url2.contains("error.html"))
			 System.out.println("URL is broken");
		 else
			 System.out.println("URL is not broken");

         driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		 driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();

		  List<WebElement> noOfUrls = driver.findElements(By.tagName("a"));
	      System.out.println("Total links on this Page: " + noOfUrls.size());
	      
	      driver.close();
	      
		

	}

}
