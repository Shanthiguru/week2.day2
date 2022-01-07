package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsEditLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Shanthi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement company = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		company.clear();
		company.sendKeys("TCS");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String changedName=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(changedName);
		driver.close();
	}

}
