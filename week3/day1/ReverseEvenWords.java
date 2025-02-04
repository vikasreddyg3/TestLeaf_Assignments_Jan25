package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Ia am ab Software Tester";
		String[] split=s.split(" ");
		String res="";
		for(int i=0;i<split.length;i++)
		{
			res=" ";
			if(i%2==0)
			{
				for(int k=split[i].length()-1;k>=0;k--)
				{
					res=res+split[i].charAt(k);
					
				}
				System.out.print(res+" ");
			}
			else
			{
				System.out.print(split[i]);
			}
			
			
			
			
				
		}
		
		/*for(int j=0;j<split.length-1;j++)
		{
			if(j%2==0)
			{
				for(int k=split[j].length()-1;k>0;k--)
				{
					System.out.println(split[j].charAt(k));
					
				}
				
			}
			else
			{
				System.out.println(split[j]);
			}
		}*/

	}

}
