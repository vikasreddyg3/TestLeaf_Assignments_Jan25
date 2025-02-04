package week3.day2;

public class Hs2_Overloading {
	
	public void sendRequest(String endPoint)
	{
		System.out.println("Send request method with one paramenter End pont : "+endPoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("Send Request method from 3 input parameters :"+endpoint+" "+requestBody+" "+requestStatus);
	}
	
	public static void main(String[] args) {
		
		Hs2_Overloading obj=new Hs2_Overloading();
		obj.sendRequest("vikas sending inputo to single parameter");
		obj.sendRequest("Endpoint", "Request Body", true);
	}

}
