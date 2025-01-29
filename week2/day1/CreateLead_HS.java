package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead_HS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Browser launch
		ChromeDriver driver =new ChromeDriver();
		//URl lunch
		driver.get("http://leaftaps.com/opentaps/");
		//maximize the browser
		driver.manage().window().maximize();
		//enter user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//enter login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crm/sfa
		driver.findElement(By.id("label")).click();
		Thread.sleep(5000);
		//click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter first name
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vikas1");
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Reddy1");
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("virtusa1");
		//enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Enter a title");
		//enter create lead
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		//get the current title and store it in variable
		String title=driver.getTitle();
		if(title.equals(driver.getTitle()))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
