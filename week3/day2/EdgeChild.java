package week3.day2;

public class EdgeChild extends BrowserParent {

	String browserName="Edge";
	float browserVersion=130.5f;
	public void takeSnap()
	{
		System.out.println("takes snap");
	}
	
	public void clearCookies()
	{
		System.out.println("clear cookies");
	}
	
	public static void main(String[] args) {
		
		EdgeChild e=new EdgeChild();
		e.openURL();
		e.navigateBack();
		e.closeBrowser();
		e.takeSnap();
		e.clearCookies();
		System.out.println("Browser name :"+e.browserName);
		System.out.println("Browser version"+e.browserVersion);
		
		
				
	}
}
