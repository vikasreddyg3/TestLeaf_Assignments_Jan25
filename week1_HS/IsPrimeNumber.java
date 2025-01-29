package week1_HS;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		boolean b = true;
		for(int i=1;i<n;i++)
		{
			b=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					b=false;
					break;
				}
			}

			if(b==true)
			{
				System.out.println(i+ " is  a prime number"+b);
				//return true;
			}
			else
			{
				System.out.println(i+ "is not a prime number"+b);
				//return false;
			}

		}
		


	}

}
