package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HS3_DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		//click on Leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click "Find leads."
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9133628820");
		
		//- Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		//- Capture the lead ID of the first resulting lead.
		WebElement leadId=driver.findElement(By.xpath("(//div[@class='x-grid3-scroller']//table)[1]//tr[1]/td[1]/div/a"));
		String leadIDNum=leadId.getText();
		Thread.sleep(3000);
		
		//- Click the first resulting lead.
		leadId.click();	
		
		//- Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//- Click "Find leads" again.
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//- Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDNum);
		
		//- Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//- Verify the presence of the message "No records to display" in the Lead List. This 
	//	message confirms the successful deletion.
		String b=driver.findElement(By.xpath("//div[@class='x-panel-bbar']//table/following-sibling::div")).getText();
		if(b.equals("No records to display"))
		{
		System.out.println("value deleted");
		}
		else
		{
			System.out.println("value not deleted");
		}
	}

}
