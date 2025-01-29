package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HS2_CreateAccountWithSelectClass {

	public static void main(String[] args) throws InterruptedException {
		
		String beforeCreateAccountName="vikki1";
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
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		
		//Click on the "Create Account" button
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(3000);
		
		//Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys(beforeCreateAccountName);
		
		//Enter a description as "Selenium Automation Tester."
		driver.findElement(By.tagName("textarea")).sendKeys("Selenium Automation Tester");

		//Select "ComputerSoftware" as the industry.
		WebElement industryDD=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		Select industrySelect=new Select(industryDD);
		industrySelect.selectByVisibleText("Computer Software");

		//- Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownerShipDD=driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		Select ownerShipSelect=new Select(ownerShipDD);
		ownerShipSelect.selectByVisibleText("S-Corporation");

		//- Select "Employee" as the source using SelectByValue.
		WebElement sourceDD=driver.findElement(By.xpath("//select[@id='dataSourceId']"));
		Select sourceSelect=new Select(sourceDD);
		sourceSelect.selectByIndex(4);

		//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketingDD=driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
		Select marketSelect=new Select(marketingDD);
		marketSelect.selectByIndex(6);

		//- Select "Texas" as the state/province using SelectByValue.
		WebElement stateDD=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select stateSelect=new Select(stateDD);
		stateSelect.selectByIndex(50);

		//- Click the "Create Account" button
		driver.findElement(By.className("smallSubmit")).click();

		//Verify that the account name is displayed correctly.
		String accountName=driver.findElement(By.xpath("(//span[text()='Account Name']/parent::td/following-sibling::td)[1]")).getText();
		if(accountName.contains(beforeCreateAccountName))
		{
			System.out.println("Account name is correct");
		}
		else
		{
			System.out.println("Account name is not matching");
		}

				
				//driver.close();

	}

}
