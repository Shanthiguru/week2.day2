package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Shanthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gurudass");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("987654321");
		driver.findElement(By.id("password_step_input")).sendKeys("Shan123");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select dropdown = new Select(day);
		dropdown.selectByValue("3");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropdown1 = new Select(month);
		dropdown1.selectByIndex(7);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dropdown2 = new Select(year);
		dropdown2.selectByVisibleText("1994");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
