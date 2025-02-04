package week3.day2;

public class SafariChild extends BrowserParent {

	String browserName="Safari";
	float browserVersion=133.5f;
	public void readerMode()
	{
		System.out.println("Read mode");
	}
	
	public void fullScreenMode()
	{
		System.out.println("Full Scvreen Mode");
	}
	
	public static void main(String[] args) {
		
		SafariChild s=new SafariChild();
		s.closeBrowser();
		s.navigateBack();
		s.openURL();
		s.readerMode();
		s.fullScreenMode();
		System.out.println("Browser name :"+s.browserName);
		System.out.println("Browser version"+s.browserVersion);
	}
	
	
	
	
	
	
}
