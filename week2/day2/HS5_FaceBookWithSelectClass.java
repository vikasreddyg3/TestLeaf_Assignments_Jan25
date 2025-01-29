package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HS5_FaceBookWithSelectClass {

	public static void main(String[] args) {
		
		//Browser launch
		ChromeDriver driver =new ChromeDriver();
		
		//URl lunch
		driver.get("https://en-gb.facebook.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on the Create new account button.
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 
		//- Enter the First name.
		 driver.findElement(By.xpath("//div[text()='First name']/following-sibling::input")).sendKeys("vikas");
		 
		//- Enter the Surname.
		 driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("gopavaram");
		 
		//- Enter the Mobile number or email address.
		 driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("9133628820");
		 
		//- Enter the New password.
		 driver.findElement(By.xpath("//div[contains(text(),'New passw')]/following-sibling::input")).sendKeys("Vikas@1997");
		 
		//- Handle all three dropdowns in Date of birth
		WebElement birthDay= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement birthMonth= driver.findElement(By.xpath("//select[@id='month']"));
		WebElement birthYear= driver.findElement(By.xpath("//select[@id='year']"));
		
		Select birthDaySelect = new Select(birthDay);
		Select birthMonthSelect = new Select(birthMonth);
		Select birthYearSelect = new Select(birthYear);
		
		birthDaySelect.selectByIndex(4);
		birthMonthSelect.selectByValue("6");
		birthYearSelect.selectByVisibleText("1999");
		
		
		//- Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Male']/input")).click();
	}

}
