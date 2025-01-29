package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HS6_LeafGroundButtons {

	public static void main(String[] args) {
		
		//Browser launch
		ChromeDriver driver =new ChromeDriver();
		
		//URl lunch
		driver.get("https://leafground.com/button.xhtml");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button")).click();
		
		//- Verify that the title of the page is ‘dashboard.’
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("dashboard"))
		{
			System.out.println("Navigated to correct page");
		}
		else
		{
			System.out.println("Navigated to wrong page");
		}
		
		//- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		driver.navigate().back();
		boolean b=driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']/following-sibling::button")).isSelected();
		if(b==true)
		{
			System.out.println(" Button is Enable");
		}
		else
		{
			System.out.println(" Button is Disabled");
		}
		
		//- Find and print the position of the button with the text ‘Submit.’
		Point position=driver.findElement(By.xpath("//h5[contains(text(),'Find the position')]/following-sibling::button")).getLocation();
		System.out.println(position);
		
		//- Find and print the background color of the button with the text ‘Find the Save button color.’
		WebElement color=driver.findElement(By.xpath("//span[text()='Save']"));
		System.out.println("color : "+color.getCssValue("background-color"));
		
		//- Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		System.out.println("Hight adn width of the button : "+driver.findElement(By.xpath("//span[text()='Submit']")).getSize());
		//- Close the browser window.
		driver.close();

	}

}
