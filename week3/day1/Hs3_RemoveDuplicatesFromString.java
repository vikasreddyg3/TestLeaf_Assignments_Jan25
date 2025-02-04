package week3.day1;

public class Hs3_RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		int count = 0;
		String text ="We learn Java basics as part of java sessions in java week1";
		String[] a=text.split(" ");
		String output="";
		
		for(int i=0;i<=a.length-1;i++)
		{
			//count=0;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i].equalsIgnoreCase(a[j]))
				{
						a[j]=" ";	
						
				}
				
				
				
				
			}
			output=output+a[i]+" ";
			
		}
		/*for(int k=0;k<a.length-1;k++)
		{
			System.out.print(a[k]+" ");				
			
		}*/
		System.out.println(output.trim());
			
			
			
	}
}
