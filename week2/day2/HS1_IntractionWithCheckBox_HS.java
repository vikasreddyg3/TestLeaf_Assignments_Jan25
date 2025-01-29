package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HS1_IntractionWithCheckBox_HS {

	public static void main(String[] args) throws InterruptedException {
		
		//Browser lunch
		ChromeDriver driver =new ChromeDriver();
		
		//URl lunch
		driver.get("https://leafground.com/checkbox.xhtml");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Implicity wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click on the "Basic Checkbox.”"
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		//- Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();	
		
		//- Verify that the expected message is displayed.
	    boolean popUp=driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();
	    if(popUp=true)
	    {
	    	 System.out.println(" Ajax check box clicked pop present : "+popUp);
	    }
	    else
	    {
	    	 System.out.println("  Ajax check box clicked pop not present : "+popUp);
	    }
	   
		
		//- Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("//label[text()='Java']/parent::td//div[2]")).click();
		
		//- Click on the "Tri-State Checkbox."
		WebElement triStateCheckBox=driver.findElement(By.xpath("(//h5[text()='Tri State Checkbox']/following-sibling::div//div)[4]"));
		triStateCheckBox.click();
		Thread.sleep(2000);
		
		//- Verify which tri-state option has been chosen.
		if(triStateCheckBox.isSelected())
		{
			System.out.println("Tri State checkbox Selected");
		}
		else
		{
			System.out.println("Tri State CheckBox not selected");
		}
		
		//- Click on the "Toggle Switch."
		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following-sibling::div//div[2]")).click();
		
		//- Verify that the expected message is displayed.
		 boolean popUp1=driver.findElement(By.xpath("//span[text()='Checked']/parent::div[@class='ui-growl-message']")).isSelected();
		    if(popUp=true)
		    {
		    	 System.out.println(" Toggle switch pop present : "+popUp1);
		    }
		    else
		    {
		    	 System.out.println("Toggle swith pop not present : "+popUp1);
		    }
		
		//- Verify if the Checkbox is disabled.
		WebElement disabled=driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following-sibling::div//div[2]"));
		if(disabled.isSelected())
		{
			System.out.println("check box is Enabled");
		}
		else
		{
			System.out.println("check box is disabled");
		}
		
		//- Select multiple options on the page (details may be needed).
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following-sibling::div/ul")).click();
		driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]/preceding::div[1]")).click();
		driver.findElement(By.xpath("(//label[text()='Brasilia'])[2]/preceding::div[1]")).click();
		
		//- Perform any additional actions or verifications required.
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		//- Close the web browser when done.
		

	}

}
