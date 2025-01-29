package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount_HS {

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
		//click on Accounts
		Thread.sleep(3000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(3000);
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("vikas");
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.tagName("textarea")).sendKeys("Selenium Automation Tester");
		//Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		//- Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//- Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(3000);
		//Verify that the Title is displayed correctly
		String title=driver.getTitle();
		if(title.equals("Account Details | opentaps CRM"))
		{
			System.out.println("Account details Title is correct");
		}
		else
		{
			System.out.println("Account details Title is not correct");
		}
		
		Thread.sleep(5000);
		//Close the browser window.
		driver.close();
	}

}
