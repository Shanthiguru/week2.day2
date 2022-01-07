package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button_LeafGround {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
        driver.findElement(By.id("home")).click();
        driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
       
         //Position
       WebElement Position = driver.findElement(By.xpath("//button[text()='Get Position']"));
       System.out.println("Position in x and y : "+ Position.getLocation());
       System.out.println("Position of x is : "+ Position.getLocation().getX());
       System.out.println("Position of y is : "+ Position.getLocation().getY());
       
       //Color
      WebElement color = driver.findElement(By.id("color"));
      System.out.println("Color : "+ color.getCssValue("background-color"));
      
      //Size( height and width)
      WebElement size = driver.findElement(By.id("size"));
      System.out.println("Size : "+ size.getSize());
      System.out.println("Height : "+ size.getSize().getHeight());
      System.out.println("Width : "+ size.getSize().getWidth());
      System.out.println("Color : "+ size.getCssValue("background-color"));
      
      driver.close();
		

	}

}
