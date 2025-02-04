package week3.day1;

public class Hs4_ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "I am a software tester";
		String[] split=test.split(" ");
		String res;
		for(int i=0;i<=split.length-1;i++)
		{
			res = " ";
			if((i%2)!=0)
			{
				for(int j=split[i].length()-1;j>=0;j--)
				{
					res=res+split[i].charAt(j);
				}
				System.out.print(res+" ");
			}
			else
			{
				System.out.print(split[i]);
			}
		}
		

	}

}
