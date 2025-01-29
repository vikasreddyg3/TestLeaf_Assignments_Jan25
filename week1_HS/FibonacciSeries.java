package week1_HS;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,range=8,c;
		System.out.print(a+" "+b);
		for(int i=2;i<=8;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}

	}

}
