package week3.day2;

public class overloading {
	
	public void reportStep(String message,String status)
	{
		System.out.println("Message : "+message);
		System.out.println("Status : "+status);
	}
	
	public void reportStep(String message,String status,boolean snap)
	{
		System.out.println("Message : "+message);
		System.out.println("Status : "+status);
		System.out.println("Take Snap :"+snap);
	}

	public static void main(String[] args) {
		
		overloading ol=new overloading();
		ol.reportStep("My name is vikas", "pass");
		ol.reportStep("i am learning overloading", "good swith this convcept", true);
		
	}
}
