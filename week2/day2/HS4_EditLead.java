package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HS4_EditLead {

	public static void main(String[] args) {
		
		//Browser launch
		ChromeDriver driver =new ChromeDriver();
		
		//URl lunch
		driver.get("http://leaftaps.com/opentaps/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//enter login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crm/sfa
		driver.findElement(By.id("label")).click();
		
		//click on Leads button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click on Create Lead.
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
	//	Enter the CompanyName Field Using Xpath.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Virtusa");
		
	//	- Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("vikas");
		
	//	- Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Reddy");
		
	//	- Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Gopa");
		
	//	- Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		
	//	- Enter the Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("i am the cse student");
		
	//	- Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vikas@gmail.com");
		
	//	- Select State/Province as NewYork Using Visible Text.
		WebElement stateDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statevalue=new Select(stateDD);
		statevalue.selectByVisibleText("New York");
		
	//	- Click on the Create Button.
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	//	- Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
	//	- Clear the Description Field.
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
	//	- Fill the Important Note Field with Any text.
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important note");
		
	//	- Click on the update button.
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
	//	- Get the Title of the Resulting Page.
		String title=driver.getTitle();
		System.out.println("After update title : "+title);
		
	//	- Close the browser window.
		driver.close();
		
				

	}

}
