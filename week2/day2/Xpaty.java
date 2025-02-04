package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Browser lunch
		ChromeDriver driver =new ChromeDriver();
		//URl lunch
		driver.get("https://login.salesforce.com/?locale=in");
		//maximize the browser
		driver.manage().window().maximize();
		//enter the user name
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
		//enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@2025");
		//click on sign in button
		driver.findElement(By.xpath("//input[@name='Login']")).click();
	}

}
