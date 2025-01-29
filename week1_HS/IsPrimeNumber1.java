package week1_HS;

public class IsPrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		boolean b=true;
		for(int i=2;i<n;i++) {
			
			if(n%i==0)
			{
				b=false;
				break;
	
			}
			
		}
		if(b==true)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}

}
