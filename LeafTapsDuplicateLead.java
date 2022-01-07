package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsDuplicateLead {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("shanthi@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		
		String fElement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println("First Lead is: "+fElement);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		String capturedTitle = driver.getTitle();
		System.out.println("Duplicate Lead Title : "+capturedTitle);
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(1000);
		
		String verifyTitle = driver.getTitle();
		System.out.println("View Lead Title: "+verifyTitle);
		
		String fElement1= driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		 if( fElement1.contains(fElement))
			   System.out.println("Duplicate is created ");
		   else
			   System.out.println("Duplicate is not created");
		driver.close();

	}

}
