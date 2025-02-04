package week3.day2;

public class ChromeChild extends BrowserParent {
	 
	String browserName="Chrome";
	float browserVersion=132.5f;
	
	
	public void openIncognito()
	{
		System.out.println("open incognito");
	}
	
	public void clearCache()
	{
		System.out.println("clear cache");
	}
	
	public static void main(String[] args) {
		  
		ChromeChild c=new ChromeChild();
		c.openIncognito();
		c.clearCache();
		c.closeBrowser();
		c.navigateBack();
		c.openURL();
		System.out.println("Browser name :"+c.browserName);
		System.out.println("Browser version"+c.browserVersion);
	}
}
