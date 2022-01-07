package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartRegister {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-username")).sendKeys("Shanthi Gurudass");
		driver.findElement(By.id("input-firstname")).sendKeys("Shanthi");
		driver.findElement(By.id("input-lastname")).sendKeys("Gurudass");
		driver.findElement(By.id("input-email")).sendKeys("shanthi@gmail.com");
		
		WebElement country = driver.findElement(By.id("input-country"));
		Select dd = new Select(country);
		dd.selectByValue("99");
		
		driver.findElement(By.id("input-password")).sendKeys("Shan1234");
		

	}

}
