package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		//launch browser
		ChromeDriver driver =new ChromeDriver();
		//URl lunch
		driver.get("https://www.telerik.com/contact");
		//maximize the browser
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//1st drop down
		WebElement firsrDD=driver.findElement(By.id("Dropdown-1"));
		Select option1=new Select(firsrDD);
		option1.selectByVisibleText("General Inquiries");
		//2nd drop down
		WebElement secondDD=driver.findElement(By.name("DropdownListFieldController"));
		Select option2=new Select(secondDD);
		option2.selectByIndex(10);
		//3rd drop down
		WebElement thirdDD=driver.findElement(By.className("js-country-field"));
		Select option3=new Select(thirdDD);
		option3.selectByValue("Canada");
		

	}

}
