package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image_LeafGround {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following::img[1]")).click();
		Thread.sleep(2000);
		System.out.println("Entered home page");
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following::img[1]")).click();
		Thread.sleep(2000);
		System.out.println("Image is broken");
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following::img[1]")).click();
		Thread.sleep(2000);
		System.out.println("Clicked using mouse");
		driver.close();
		

	}

}
