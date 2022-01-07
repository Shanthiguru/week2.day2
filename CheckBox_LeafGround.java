package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox_LeafGround {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		driver.findElement(By.xpath("//div[text()='SQL']/input")).click();
		driver.findElement(By.xpath("//div[text()='C']/input")).click();
		System.out.println("Selenium is selected? :"+ driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected());

		
		if(driver.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected())
			driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
						
		driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
		
		driver.close();
		
		
	}

	}


