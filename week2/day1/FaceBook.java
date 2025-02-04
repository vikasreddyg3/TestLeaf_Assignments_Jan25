package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Browser launch
		ChromeDriver driver =new ChromeDriver();
		//URl lunch
		driver.get("https://www.facebook.com/");
		//enter user name
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//enter password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//click on login button
		driver.findElement(By.name("login")).click();
		//get the title and store it in variable
		String title=driver.getTitle();
		//check the title
		if(title.equals(driver.getTitle()))
		{
			System.out.println("Title is match");
		}
		else
		{
			System.out.println("Title is not matched");
		}
		
		

	}

}
