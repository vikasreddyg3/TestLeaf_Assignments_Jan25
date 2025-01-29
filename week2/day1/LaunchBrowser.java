package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//launch the browser

		ChromeDriver driver=new ChromeDriver();
		//launch the URL
		driver.get("https://www.facebook.com/");
		//maximize the browser
		driver.manage().window().maximize();
		//pause the execution for 5 seconds
		Thread.sleep(5000);
		//close the browser
		driver.close();
		
		

	}

}
